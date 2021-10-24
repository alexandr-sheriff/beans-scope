package com.alex.beans_scope.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service("BaseService2")
public class BaseService2 implements CommandLineRunner {

    @Autowired
    private AccountServicePrototype prototype;

    @Autowired
    private AccountServiceSingleton singleton;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("--------------- BaseService1 --------------");

        System.out.println("--------------- Prototype --------------");
        System.out.println(prototype.getName());

        System.out.println("--------------- Singleton --------------");
        System.out.println(singleton.getName());
        System.out.println("\n\n");

    }

    @PostConstruct
    public void init(){
        System.out.println("**********" + getClass().getName() + "****** init method ******");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("**********" + getClass().getName() + "****** destroy method ******");
    }
}
