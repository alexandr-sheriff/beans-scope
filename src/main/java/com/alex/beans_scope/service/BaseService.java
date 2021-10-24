package com.alex.beans_scope.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class BaseService implements CommandLineRunner {

    @Autowired
    private AccountServicePrototype prototype;

    @Autowired
    private AccountServiceSingleton singleton;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("--------------- BaseService --------------");

        System.out.println("--------------- Prototype --------------");
        prototype.changeName("Bax");
        System.out.println(prototype.getName());

        System.out.println("--------------- Singleton --------------");
        singleton.changeName("Bax");
        System.out.println(singleton.getName());
        System.out.println("\n\n");


    }
}
