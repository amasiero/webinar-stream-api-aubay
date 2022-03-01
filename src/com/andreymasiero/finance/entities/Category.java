package com.andreymasiero.finance.entities;

public enum Category {
    HOME("Home"),
    FOOD("Food"),
    TRANSPORT("Transport"),
    FREE_TIME("Free time"),
    WORK("Work");

    private final String value;

    Category(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
