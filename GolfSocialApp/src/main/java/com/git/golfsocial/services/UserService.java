package com.git.golfsocial.services;

import java.util.List;

import com.git.golfsocial.entities.User;

public interface UserService {
	
	//list all users
	List<User> index();
	
	//find single user
	User findByEmail(String email);
	
	//disable the account
	boolean disable(String email);
	
	//change the password
	User changePassword(User user, String newPassword);
	
	//update account info
	User updateAccount(User user);
	
	//enable a disabled account
	User enableDisableAccount(User user);

}
