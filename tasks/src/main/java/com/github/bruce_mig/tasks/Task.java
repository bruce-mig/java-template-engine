package com.github.bruce_mig.tasks;

import lombok.Getter;

import java.util.UUID;

@Getter
public class Task{
    private final String id;
    private final String description;

    public Task(String description) {
        this.id = UUID.randomUUID().toString();
        this.description = description;
    }
}
