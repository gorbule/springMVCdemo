package com.luv2code.springdemo.springMVCdemo;


import javax.validation.constraints.NotNull;

public class Customer {

    private String firstName;

    @NotNull(message = "is required")
    private String lastName;

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
