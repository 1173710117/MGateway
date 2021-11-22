package com.hitices.mgateway.client;

import com.hitices.common.bean.MResponse;
import com.hitices.mclient.annotation.MFuncProcess;
import com.hitices.mclient.base.Action;
import com.hitices.mclient.core.MServiceSkeleton;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "PrimeAB")
public interface PrimeABClient {
    @RequestMapping(value = "/primea", method = RequestMethod.POST)
    MResponse isPrimea(@RequestParam(value = "n") Integer n);

    @RequestMapping(value = "/primeb", method = RequestMethod.POST)
    MResponse isPrimeb(@RequestParam(value = "n") Integer n);
}
