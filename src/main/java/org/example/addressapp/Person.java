package org.example.addressapp;

import java.time.LocalDate;
public class Person {
        private String firstName;
        private String lastName;
        private String street;
        private Integer postalCode;
        private String city;
        private LocalDate birthday;

    public Person() {
    }

    public Person(String firstName, String lastName, String street, Integer postalCode, String city, LocalDate birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.postalCode = postalCode;
        this.city = city;
        this.birthday = birthday;
    }

    public Person(Person other) {
        this.firstName = other.firstName;
        this.lastName = other.lastName;
        this.street = other.street;
        this.postalCode = other.postalCode;
        this.city = other.city;
        this.birthday = other.birthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
