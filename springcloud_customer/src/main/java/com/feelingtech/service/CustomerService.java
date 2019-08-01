package com.feelingtech.service;

import com.feelingtech.base.pojo.User;
import com.feelingtech.dao.CustomerDao;
import com.feelingtech.util.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerDao customerDao;

    @Autowired
    private IdWorker idWorker;

    public List<User> findAll(){
        return customerDao.findAll();
    }

    public User findById(Integer id){
        return customerDao.findById(id).get();
    }

    public void saveCustomer(User user){
        user.setId((int) idWorker.nextId());
        customerDao.save(user);
    }
}
