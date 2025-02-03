package com.example.carrental.models;

public class UserModel  {

    String email;
    String password;

    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }

    public UserModel(String email, String password) {
        this.email = email;
        this.password = password;
    }
}