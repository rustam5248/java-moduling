package bank.impl;

import bank.api.Bank;
import dto.*;

import java.util.UUID;

public class CentralBank implements Bank {
    @Override
    public BankCard createBankCard(User user, BankCardType type) {
        switch (type){
            case DEBIT -> {
                return new DebitBankCard(UUID.randomUUID().toString(), user);
            }
            case CREDIT -> {
                return new CreditBankCard(UUID.randomUUID().toString(), user);
            }
            default -> throw new IllegalArgumentException("Unknown BankCardType" + type);
        }

    }
}
