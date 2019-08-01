package com.feelingtech.dao;

import com.feelingtech.base.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CustomerDao extends JpaRepository<User,Integer>, JpaSpecificationExecutor<User> {
}
