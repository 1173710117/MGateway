package com.hitices.mgateway.client;

import com.hitices.common.bean.MResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "Fibonacci")
public interface FibonacciClient {
    @RequestMapping(value = "/fibonacci",method = RequestMethod.POST)
    MResponse fibonacci(@RequestParam(value = "n") Integer n);
}
