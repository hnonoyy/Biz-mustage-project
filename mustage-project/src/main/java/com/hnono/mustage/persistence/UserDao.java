package com.hnono.mustage.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.hnono.mustage.models.UserVO;

public interface UserDao {

	@Select("SELECT * FROM mustage_users")
	public List<UserVO> selectAll();
	
	@Select("SELECT * FROM mustage_users WHERE id = #{id}")
	public UserVO findById(String id);
	
	public int insert(UserVO userVO);
	
}
