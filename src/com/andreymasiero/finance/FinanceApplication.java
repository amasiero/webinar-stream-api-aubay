package com.andreymasiero.finance;

import com.andreymasiero.finance.entities.Category;
import com.andreymasiero.finance.entities.Transaction;
import com.andreymasiero.finance.entities.Type;

import java.time.LocalDateTime;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class FinanceApplication {
    public static void main(String[] args) {
        var transactions = getTransactions();
//        Java 7 -> Imperative Programming
//        for(Transaction transaction : transactions) {
//            System.out.println(transaction);
//        }

        // Java 8 -> Declarative Programming
//        transactions.forEach(System.out::println);

        // filter

        var totalIncome = getReduce(transactions, Type.INCOME);
        var totalOutcome = getReduce(transactions, Type.OUTCOME);


        System.out.println(totalIncome);
        System.out.println(totalOutcome);

        var maxValue = transactions.stream()
                .map(Transaction::getValue)
                .max(Double::compare)
                .get();

        var minValue = transactions.stream()
                .map(Transaction::getValue)
                .min(Double::compare)
                .get();

        System.out.println(maxValue);
        System.out.println(minValue);

        var noneMatch = transactions.stream()
                .noneMatch(transaction -> transaction.getValue() < 0);
        // sort
        // all match
        // any match
        // none match
        // max
        // min
        // group
        // map
        // reduce


//        System.out.println(transactions);
    }

    private static Double getReduce(List<Transaction> transactions, Type type) {
        return transactions.stream()
                .filter(transaction -> transaction.getType().equals(type))
                .map(Transaction::getValue)
                .reduce(0., Double::sum);
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
