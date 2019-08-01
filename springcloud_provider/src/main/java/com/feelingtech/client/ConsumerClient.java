package com.feelingtech.client;

import com.feelingtech.base.pojo.User;
import com.feelingtech.client.impl.CustomerClientImpl;
import com.feelingtech.entity.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "springcloud-customer",fallback = CustomerClientImpl.class)
public interface ConsumerClient {

    @RequestMapping(value = "/customer/findAll",method = RequestMethod.GET)
    Result findAll();

    @RequestMapping(value = "/customer/findById/{id}",method = RequestMethod.GET)
    Result findById(@PathVariable("id") Integer id);

    @RequestMapping(value = "/customer/save",method = RequestMethod.POST)
    Result saveCustomer(@RequestBody User user);

}
