package com.andreymasiero.finance;

import com.andreymasiero.finance.entities.Category;
import com.andreymasiero.finance.entities.Transaction;
import com.andreymasiero.finance.entities.Type;

import java.time.LocalDateTime;
import java.util.List;

public class FinanceApplication {
    public static void main(String[] args) {
        var transactions = getTransactions();
        System.out.println(transactions);
    }

    public static List<Transaction> getTransactions() {
        return List.of(
                new Transaction(
                        "Salary",
                        LocalDateTime.of(2022, 2, 25, 10, 36, 15),
                        2000.,
                        Type.INCOME,
                        Category.WORK
                        ),
                new Transaction(
                        "Restaurant",
                        LocalDateTime.of(2022, 2, 26, 12, 0, 52),
                        15.5,
                        Type.OUTCOME,
                        Category.FOOD
                ),
                new Transaction(
                        "Restaurant",
                        LocalDateTime.of(2022, 2, 26, 19, 30, 12),
                        25.5,
                        Type.OUTCOME,
                        Category.FOOD
                ),
                new Transaction(
                        "Mobile Bill",
                        LocalDateTime.of(2022, 2, 28, 13, 50, 5),
                        30.,
                        Type.OUTCOME,
                        Category.HOME
                ),
                new Transaction(
                        "Salary",
                        LocalDateTime.of(2022, 3, 5, 10, 15, 55),
                        2000.,
                        Type.INCOME,
                        Category.WORK
                ),
                new Transaction(
                        "Supermarket",
                        LocalDateTime.of(2022, 3, 6, 18, 56, 10),
                        45.6,
                        Type.OUTCOME,
                        Category.HOME
                )
        );
    }
}
