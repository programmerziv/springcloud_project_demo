package com.feelingtech.client.impl;

import com.feelingtech.base.pojo.User;
import com.feelingtech.client.ConsumerClient;
import com.feelingtech.entity.Result;
import com.feelingtech.entity.StateCode;
import org.springframework.stereotype.Component;

@Component
public class CustomerClientImpl implements ConsumerClient {
    @Override
    public Result findAll() {
        return new Result(false, StateCode.ERROR,"hystrix触发");
    }

    @Override
    public Result findById(Integer id) {
        return null;
    }

    @Override
    public Result saveCustomer(User user) {
        return null;
    }
}
