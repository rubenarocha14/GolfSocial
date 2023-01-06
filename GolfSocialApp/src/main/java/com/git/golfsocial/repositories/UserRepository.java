package com.git.golfsocial.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.git.golfsocial.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	List<User> findByFirstName(String firstName);
	
	User findByEmail(String email);
}
