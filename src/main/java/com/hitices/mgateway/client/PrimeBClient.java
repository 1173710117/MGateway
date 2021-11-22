package com.hitices.mgateway.client;

import com.hitices.common.bean.MResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "PrimeB")
public interface PrimeBClient {
    @RequestMapping(value = "/primeb", method = RequestMethod.POST)
    MResponse isPrimeb(@RequestParam(value = "n") Integer n);
}
