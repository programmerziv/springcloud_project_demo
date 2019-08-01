package com.feelingtech.base.dao;

import com.feelingtech.base.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * 继承JpaRepository<CURD的类,主键的类型>
 * 复杂查询查询用JpaSpecificationExecutor
 */
public interface BaseDao extends JpaRepository<User,Integer>, JpaSpecificationExecutor<User> {
}
