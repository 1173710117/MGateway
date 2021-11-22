package com.hitices.mgateway.controller;

import com.hitices.common.bean.MResponse;
import com.hitices.mgateway.client.*;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MController {

    @Autowired
    PrimeClient primeclient;

    @Autowired
    PrimeABClient primeABClient;

    @Autowired
    PrimeAClient primeAClient;

    @Autowired
    PrimeBClient primeBClient;

    @Autowired
    FibonacciClient fibonacciClient;

    @Autowired
    FibonacciABClient fibonacciABClient;

    @Autowired
    FibonacciAClient fibonacciAClient;

    @Autowired
    FibonacciBClient fibonacciBClient;

    @PostMapping(value = "/test")
    public MResponse test(@RequestParam int n){
        return primeclient.isPrime(n);
    }

    @PostMapping(value = "/test1")
    public MResponse test1(@RequestParam int n){
        MResponse response = primeABClient.isPrimea(n);
        if (!response.get("result").equals(0))
            response = primeABClient.isPrimeb(n);
        return response;
    }

    @PostMapping(value = "/test2")
    public MResponse test2(@RequestParam int n){
        MResponse response = primeAClient.isPrimea(n);
        if (!response.get("result").equals(0))
            response = primeBClient.isPrimeb(n);
        return response;
    }

    @PostMapping(value = "/test3")
    public MResponse test3(@RequestParam int n){
        return fibonacciClient.fibonacci(n);
    }

    @PostMapping(value = "/test4")
    public MResponse test4(@RequestParam int n){
        MResponse response = fibonacciABClient.fibonacci1(n);
        MResponse result = fibonacciABClient.fibonacci2(response);
        return result;
    }

    @PostMapping(value = "/test5")
    public MResponse test5(@RequestParam int n){
        MResponse response = fibonacciAClient.fibonacci1(n);
        MResponse result = fibonacciBClient.fibonacci2(response);
        return result;
    }


}
