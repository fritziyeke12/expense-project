package com.mycompany.expense;

public class Expense {
    //expense properties
    private String id;
    private Float amount;
    private String note;
    private String category;

    //expense class constructor method
    public Expense(String id, Float amount, String note, String category) {
        this.id = id;
        this.amount = amount;
        this.note = note;
        this.category = category;
    }

    //getter and setter methods for each property
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    //returns the properties of an expense instance as a string
    @Override
    public String toString() {
        return "Expense{" +
                "id='" + id + '\'' +
                ", amount=" + amount +
                ", note='" + note + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}

