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
        LocalDate now = LocalDate.now();
        return getAllUsers().stream()
                .mapToLong(u -> ChronoUnit.YEARS.between(u.getBirthday(),now))
                .average()
                .orElse(0.0);
    }

    static boolean isPayableUser(User user){
        LocalDate now =LocalDate.now();
        return ChronoUnit.YEARS.between(user.getBirthday(), now) >= 18;
    }

    
}
