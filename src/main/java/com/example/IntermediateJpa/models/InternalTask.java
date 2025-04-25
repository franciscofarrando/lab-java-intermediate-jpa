package com.example.IntermediateJpa.models;

import jakarta.persistence.Entity;

@Entity
public class InternalTask extends Tasks{
    public InternalTask() {
    }

    public InternalTask(String title, String dueDate, boolean status) {
        super(title, dueDate, status);
    }

}
