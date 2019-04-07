package com.example.demo.dao;


import com.example.demo.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author wtf
 * @date 2019/4/7 18:08
 * @description:
 */
public interface UserDao extends JpaRepository<User, Long> {
    User findByUserName(String userName);
}
