package com.hnono.mustage.service;

import com.hnono.mustage.models.UserVO;

public interface UserService {

	public int join(UserVO userVO);
	public UserVO findById(String id);
}
