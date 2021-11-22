package com.hitices.mgateway.controller;

import com.hitices.common.bean.MResponse;
import com.hitices.mgateway.client.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    PrimeABClient primeABClient;

    @Autowired
    PrimeAClient primeAClient;

    @Autowired
    PrimeBClient primeBClient;

    @Autowired
    PrimeCClient primeCClient;

    @Autowired
    PrimeDClient primeDClient;

    @PostMapping(value = "/userA")
    public MResponse testA(@RequestParam int n){
        primeABClient.isPrimea(n);
        return primeCClient.isPrimea(n);
    }

    @PostMapping(value = "/userB")
    public MResponse testB(@RequestParam int n){
        primeABClient.isPrimeb(n);
        return primeDClient.isPrimea(n);
    }

    @PostMapping(value = "/userA1")
    public MResponse testA1(@RequestParam int n){
        primeAClient.isPrimea(n);
        return primeCClient.isPrimea(n);
    }

    @PostMapping(value = "/userB1")
    public MResponse testB1(@RequestParam int n){
        primeBClient.isPrimeb(n);
        return primeDClient.isPrimea(n);
    }

}
