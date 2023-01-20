package ru.mega.library.models;

public class Person {
    private int id;
    private String fullName;
    private int yearOfBorn;

    public Person() {
    }

    public Person(int id, String fullName, int yearOfBorn) {
        this.id = id;
        this.fullName = fullName;
        this.yearOfBorn = yearOfBorn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearOfBorn() {
        return yearOfBorn;
    }

    public void setYearOfBorn(int yearOfBorn) {
        this.yearOfBorn = yearOfBorn;
    }
}
