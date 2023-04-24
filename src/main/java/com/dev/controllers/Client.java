package com.dev.controllers;

public class Client {
    private String fullName;
    private String phoneNumber;

    public Client(String name,String phoneNumber){
        if (validName(name)) {
            this.fullName = name;
        }
        if (validPhoneNumber(phoneNumber)) {
            this.phoneNumber = phoneNumber;
        }
    }

    public boolean validName(String name){
        if (name.contains(" ")){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean validPhoneNumber(String phoneNumber){
        return phoneNumber.matches("[0-9]+");
    }

    public String getName() {
        return fullName;
    }

    public void setName(String name) {
        this.fullName = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
