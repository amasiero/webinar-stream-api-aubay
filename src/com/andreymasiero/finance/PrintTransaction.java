package com.andreymasiero.finance;

import com.andreymasiero.finance.entities.Transaction;

import java.util.function.Consumer;

public class PrintTransaction implements Consumer<Transaction> {
    @Override
    public void accept(Transaction transaction) {
        System.out.println(transaction);
    }
}
