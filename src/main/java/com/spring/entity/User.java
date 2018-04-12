package com.spring.entity;

import javax.validation.constraints.Size;

public class User {
    private int id;
    @Size (min = 5, max = 15, message = "Username must contain from 5 to 15 symbols")
    private String name;
    @Size (min = 5, max = 15, message = "Password must contain from 5 to 15 symbols")
    private String password;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
