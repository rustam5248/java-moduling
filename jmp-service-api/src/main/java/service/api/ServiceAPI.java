package service.api;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.function.Predicate;

import dto.Subscription;
import dto.User;
import dto.BankCard;


public interface ServiceAPI {

    void subscribe(BankCard card);
    Optional<Subscription> getSubscriptionByBankCardNumber(String cardNumber);
    List<User> getAllUsers();
    List<Subscription> getAllSubscriptionsByCondition(Predicate<Subscription> condition);

    default double getAvarageUsersAge(){
        var dateNow = LocalDate.now();
        return getAllUsers().stream()
                .mapToLong(u -> ChronoUnit.YEARS.between(u.getBirthday(),dateNow))
                .average()
                .orElse(0.0);
    }

    static boolean isPayableUser(User user){
        var dateNow =LocalDate.now();
        return ChronoUnit.YEARS.between(user.getBirthday(), dateNow) >= 18;
    }

    
}
