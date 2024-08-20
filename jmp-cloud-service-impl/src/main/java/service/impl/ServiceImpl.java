package service.impl;

import dto.BankCard;
import dto.Subscription;
import dto.User;
import service.api.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;


public class ServiceImpl implements ServiceAPI {

    private final List<BankCard> bankCardsList = new ArrayList<>();
    private final List<Subscription> subscriptionsList = new ArrayList<>();

    @Override
    public void subscribe(BankCard card) {
        bankCardsList.add(card);
        Subscription subs = new Subscription(card.getNumber(), LocalDate.now());
        subscriptionsList.add(subs);

    }

    @Override
    public Optional<Subscription> getSubscriptionByBankCardNumber(String cardNumber) {
         return subscriptionsList.stream()
                .filter(s-> Objects.equals(s.getBankcardNumber(), cardNumber))
                .findFirst();
    }

    @Override
    public List<User> getAllUsers() {
        return bankCardsList.stream()
                .map(BankCard::getUser)
                .toList();
    }

    @Override
    public List<Subscription> getAllSubscriptionsByCondition(Predicate<Subscription> condition){
        return subscriptionsList.stream()
                .filter(condition)
                .toList();
    }
}
