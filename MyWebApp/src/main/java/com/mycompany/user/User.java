package com.mycompany.user;

public class User {
    //user properties
    private String username;
    private String email;


    //user class constructor method
    public User(String username, String email){
        this.username = username;
        this.email = email;
    }

    //getter and setter methods for each property
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //returns
    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
