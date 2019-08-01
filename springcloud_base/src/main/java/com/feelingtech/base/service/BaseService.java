package com.feelingtech.base.service;

import com.feelingtech.base.dao.BaseDao;
import com.feelingtech.base.pojo.User;
import com.feelingtech.util.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseService {

    @Autowired
    private BaseDao baseDao;

    @Autowired
    private IdWorker idWorker;

    public List<User> findAll(){
        return baseDao.findAll();
    }
    public User findById(Integer id){
        //JDK1.8新特性 findById返回的是Optional,get一下得值
        return baseDao.findById(id).get();
    }
    public void save(User user){
        user.setId((int)idWorker.nextId());
        baseDao.save(user);
    }
    public void update (User user){
        baseDao.save(user);
    }
    public void deleteById(Integer id){
        baseDao.deleteById(id);
    }
}
