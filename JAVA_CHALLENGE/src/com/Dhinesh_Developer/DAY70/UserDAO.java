package com.DhineshDeveloper.DAY70;

import java.util.List;

public interface UserDAO {
	List<UserEntity> getAllUser(UserEntity user);
	UserEntity getUserById(int id);
	int deleteUserById(int id);
	int insertUser(UserEntity user);
	int updateUSerById(UserEntity user,int id,String passwd);
	
}
