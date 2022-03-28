package com.luv2code.springdemo.springMVCdemo;

public class Student {

    private String firstName;
    private String lastName;

    //non arg constructor
    public Student() {
    }

    //getters and setters
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
}
