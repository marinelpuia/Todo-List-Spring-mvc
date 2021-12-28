package com.marinel.service;

import org.springframework.stereotype.Service;

/*
    This class is used to implement DemoService class and to override the methods
 */

@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String getHelloMessage(String user) {
        return "Hello " + user;
    }

    @Override
    public String getWelcomeMessage() {
        return "Welcome to this Demo application.";
    }
}
