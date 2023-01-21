package ru.mega.library.models;

import javax.validation.constraints.*;

public class Person {
    private int id;
    @NotEmpty(message = "Поле не может быть пустым")
    @Size(min = 2, max = 100, message = "Минимальное количество символов 2. Максимальное 100")
    private String fullName;

    @Min(value = 1901, message = "Год Рождения не может быть раньше 1901")
    @Max(value = 2022, message = "Год Рождения не может быть позже 2022")
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
