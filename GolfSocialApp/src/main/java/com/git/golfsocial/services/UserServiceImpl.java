package com.git.golfsocial.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.git.golfsocial.entities.User;
import com.git.golfsocial.repositories.UserRepository;

public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private PasswordEncoder encoder;

	@Override
	public List<User> index() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean disable(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User changePassword(User user, String newPassword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateAccount(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User enableDisableAccount(User user) {
		// TODO Auto-generated method stub
		return null;
	}


}
