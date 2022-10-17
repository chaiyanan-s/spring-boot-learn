package com.example.demo.model;

import java.util.UUID;

public class Person {
    private final String id;
    private final String name;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

}
