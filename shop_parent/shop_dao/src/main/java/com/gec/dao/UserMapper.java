package com.gec.dao;

import org.springframework.stereotype.Repository;

import com.gec.pojo.User;

@Repository
public interface UserMapper {
	User login(User user);
}
