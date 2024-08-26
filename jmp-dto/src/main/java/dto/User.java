package dto;

import java.time.LocalDate;

public class User {

    private String name;

    private String surname;

    private LocalDate birthday;

    public User(String name, LocalDate birthday, String surname) {
        this.name = name;
        this.birthday = birthday;
        this.surname = surname;
    }

    public User(String reno) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
