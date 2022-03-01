package com.andreymasiero.finance.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class Transaction {

    private final UUID id;
    private final String title;
    private final LocalDateTime dateTime;
    private final Double value;
    private final Type type;
    private final Category category;
    private final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");

    public Transaction(String title, LocalDateTime dateTime, Double value, Type type, Category category) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.dateTime = dateTime;
        this.value = value;
        this.type = type;
        this.category = category;
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public Double getValue() {
        return value;
    }

    public Type getType() {
        return type;
    }

    public Category getCategory() {
        return category;
    }

    public String formattedDateTime() {
        return dateTime.format(FORMATTER);
    }
    @Override
    public String toString() {
        return String.format("{\n\tid: %s,\n\ttitle: %s,\n\tdate: %s,\n\tvalue: %.2f,\n\ttype: %s,\n\tcategory: %s\n}",
                id, title, formattedDateTime(), value, type, category.getValue());
    }
}
