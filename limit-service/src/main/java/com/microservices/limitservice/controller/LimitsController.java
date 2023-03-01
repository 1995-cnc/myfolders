package com.microservices.limitservice.controller;

import com.microservices.limitservice.bean.Limits;
import com.microservices.limitservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")

    public Limits retreiveLimits(){
        return new Limits(configuration.getMinimum(), configuration.getMaximum());


        //return new Limits(1, 1000);

    }
}
