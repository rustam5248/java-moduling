package jmp.application;

import dto.Subscription;
import service.impl.ServiceImpl;

import java.util.Optional;
import java.util.function.Predicate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SubscriptionNotFoundExeption {
        ServiceImpl srvImpl = new ServiceImpl();
        String cardNumber = "123-555-555";
        Optional<Subscription> subscription = srvImpl.getSubscriptionByBankCardNumber(cardNumber);
        subscription.ifPresent(value -> System.out.println("Subscription found" + value.getBankcardNumber()));
        Predicate<Subscription> isActiveCondition = Subscription::isActive;
    }
}
