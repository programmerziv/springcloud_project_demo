package com.feelingtech.base.controller;

import com.alibaba.fastjson.JSON;
import com.feelingtech.base.pojo.User;
import com.feelingtech.base.service.BaseService;
import com.feelingtech.entity.Result;
import com.feelingtech.entity.StateCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@CrossOrigin //跨域
@RequestMapping("/base")
public class BaseController {

    @Autowired
    private BaseService baseService;

    @RequestMapping(value = "findAll",method = RequestMethod.GET)
    public Result findAll(HttpServletRequest request, HttpServletResponse response){
        String hero = request.getHeader("hero");
        System.out.println("base_hero:" + hero);
        response.setHeader("hero","IronMan");
        List<User> userData = baseService.findAll();
        String data = JSON.toJSONString(userData);
        return new Result(true, StateCode.OK,"查询成功",data);
    }

    @RequestMapping(value = "findById/{id}",method = RequestMethod.GET)
    public  Result findById(@PathVariable("id") Integer id){
        User user = baseService.findById(id);
        return new Result(true, StateCode.OK,"查询成功",user);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Result save (@RequestBody User user){
        baseService.save(user);
        return new Result(true, StateCode.OK,"添加成功");
    }

    @RequestMapping(value ="update/{id}",method = RequestMethod.PUT)
    public Result update (@RequestBody User user,@PathVariable("id") Integer id){
        user.setId(id);
        baseService.update(user);
        return new Result(true, StateCode.OK,"修改成功");
    }

    @RequestMapping(value = "deleteById/{id}",method = RequestMethod.DELETE)
    public  Result deleteById(@PathVariable("id") Integer id){
        baseService.deleteById(id);
        return new Result(true, StateCode.OK,"删除成功");
    }

}
