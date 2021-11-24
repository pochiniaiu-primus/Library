package com.serhiihonchar.entity;

public class Book {
    private int id;
    private String name;
    private int dateAdded;
    private boolean available;

    public Book() {
    }

    public Book(int id, String name, int dateAdded, boolean available) {
        this.id = id;
        this.name = name;
        this.dateAdded = dateAdded;
        this.available = available;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(int dateAdded) {
        this.dateAdded = dateAdded;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateAdded='" + dateAdded + '\'' +
                ", available=" + available +
                '}';
    }
}