package com.example.IntermediateJpa.models;

public class BillableTask extends Tasks{
    private double hourlyRate;

    public BillableTask() {

    }

    public BillableTask(String title, String dueDate, boolean status, double hourlyRate) {
        super(title, dueDate, status);
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String toString() {
        return "BillableTask{" +
                "hourlyRate=" + hourlyRate +
                '}';
    }
}
