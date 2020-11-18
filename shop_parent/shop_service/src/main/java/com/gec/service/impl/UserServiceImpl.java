package com.gec.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gec.dao.UserMapper;
import com.gec.pojo.User;
import com.gec.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User login(User user) {
		User u = userMapper.login(user);
		return u;
	}

}
