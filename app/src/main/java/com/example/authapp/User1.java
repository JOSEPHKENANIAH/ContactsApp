package com.example.authapp;

public class User1{
    private String ETName;
    private String ETNumber;
    private String ETEmail;

    public User1(String fName,String fNumber, String fEmail){
        ETName = fName;
        ETNumber = fNumber;
        ETEmail = fEmail;
    }

    public String getFName() {
        return ETName;
    }

    public void setFName(String fName) {
        ETName = fName;
    }

    public String getFNumber() {
        return ETNumber;
    }

    public void setFNumber(String fNumber) {
        ETNumber = fNumber;
    }

    public String getFEmail() {
        return ETEmail;
    }

    public void setFEmail(String fEmail) {
        ETEmail = fEmail;
    }
}
