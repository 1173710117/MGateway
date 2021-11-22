package com.hitices.mgateway.client;

import com.hitices.common.bean.MResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "Prime")
public interface PrimeClient {
    @RequestMapping(value = "/prime",method = RequestMethod.POST)
    MResponse isPrime(@RequestParam(value = "n") int n);
}
