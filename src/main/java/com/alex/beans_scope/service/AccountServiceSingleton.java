package com.alex.beans_scope.service;

import org.springframework.stereotype.Service;

@Service
public class AccountServiceSingleton {

    private String name = "Alex";

    public void changeName(String name) {
        this.name= name + " -- " + name;
    }

    public String getName() {
        return name;
    }
}
