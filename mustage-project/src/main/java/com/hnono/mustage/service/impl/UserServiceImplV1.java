package com.hnono.mustage.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hnono.mustage.models.UserVO;
import com.hnono.mustage.persistence.UserDao;
import com.hnono.mustage.service.UserService;

@Service
public class UserServiceImplV1 implements UserService{
	
	protected final UserDao userDao;

	public UserServiceImplV1(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public int join(UserVO userVO) {
		List<UserVO> users = userDao.selectAll();
		if (users == null || users.size() < 1) {
			userVO.setRole("ADMIN");
		}else {
			userVO.setRole("USER");
		}
		int ret = userDao.insert(userVO);
		return ret;
	}

	@Override
	public UserVO findById(String id) {
		return null;
	}

}
