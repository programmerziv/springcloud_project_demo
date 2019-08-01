package com.feelingtech.controller;

import com.feelingtech.base.pojo.User;
import com.feelingtech.entity.Result;
import com.feelingtech.entity.StateCode;
import com.feelingtech.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "findAll",method = RequestMethod.GET)
    public Result findAll(){
        List<User> users = customerService.findAll();
        return new Result(true, StateCode.OK,"查询成功",users);
    }

    @RequestMapping(value = "findById/{id}",method = RequestMethod.GET)
    public Result findById(@PathVariable("id") Integer id){
        User user = customerService.findById(id);
        return new Result(true, StateCode.OK,"查询成功",user);
    }

    @RequestMapping(value = "save",method = RequestMethod.POST)
    public Result saveCustomer(@RequestBody User user){
        customerService.saveCustomer(user);
        return new Result(true, StateCode.OK,"保存成功");
    }
}
