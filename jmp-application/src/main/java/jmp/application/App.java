package jmp.application;

import bank.impl.RetailBank;
import dto.BankCardType;
import dto.User;
import service.impl.ServiceImpl;
import java.time.LocalDate;

//Demonstration of created Classes
public class App 
{
    public static void main( String[] args ) {


        var bank =  new RetailBank();
        var service = new ServiceImpl();
        var user = new User("Reno", LocalDate.of(1990,12,19),"Raimond");

        var bankCard = bank.createBankCard(user, BankCardType.DEBIT);
        service.subscribe(bankCard);

        var subscription = service.getSubscriptionByBankCardNumber(bankCard.getNumber());
        subscription.ifPresent(s->System.out.println("Subscription: " + s));

        var users = service.getAllUsers();
        users.forEach(u->System.out.println("User: "+ u.getName()));

    }
}
