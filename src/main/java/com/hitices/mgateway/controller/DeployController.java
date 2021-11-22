package com.hitices.mgateway.controller;

import com.hitices.common.bean.MResponse;
import com.hitices.mgateway.client.PrimeABClient;
import com.hitices.mgateway.client.PrimeAClient;
import com.hitices.mgateway.client.PrimeBClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/deploy")
public class DeployController {
    @Autowired
    PrimeABClient primeABClient;

    @Autowired
    PrimeAClient primeAClient;

    @Autowired
    PrimeBClient primeBClient;

    @PostMapping(value = "/testA")
    public MResponse testA(@RequestParam int n){
        return primeABClient.isPrimea(n);
    }

    @PostMapping(value = "/testB")
    public MResponse testB(@RequestParam int n){
        return primeABClient.isPrimeb(n);
    }

    @PostMapping(value = "/testA1")
    public MResponse testA1(@RequestParam int n){
        return primeAClient.isPrimea(n);
    }

    @PostMapping(value = "/testB1")
    public MResponse testB1(@RequestParam int n){
        return primeBClient.isPrimeb(n);
    }


}
