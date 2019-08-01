package com.feelingtech.controller;

import com.feelingtech.base.pojo.User;
import com.feelingtech.client.ConsumerClient;
import com.feelingtech.entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/provider")
public class ProviderController {
    @Autowired
    private ConsumerClient consumerClient;

    @RequestMapping(value = "findAll",method = RequestMethod.GET)
    public Result findAll(){
        return consumerClient.findAll();
    }

    @RequestMapping(value = "findById/{id}",method = RequestMethod.GET)
    public Result findById(@PathVariable("id") Integer id ){
        return consumerClient.findById(id);
    }

    @RequestMapping(value = "save",method = RequestMethod.POST)
    public Result saveCustomer(@RequestBody User user){
        return consumerClient.saveCustomer(user);
    }
}
