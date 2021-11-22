package com.hitices.mgateway.client;

import com.hitices.common.bean.MResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "PrimeC")
public interface PrimeCClient {
    @RequestMapping(value = "/primea", method = RequestMethod.POST)
    MResponse isPrimea(@RequestParam(value = "n") Integer n);
}
