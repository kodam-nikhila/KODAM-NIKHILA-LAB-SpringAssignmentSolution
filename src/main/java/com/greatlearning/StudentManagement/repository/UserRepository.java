package com.greatlearning.StudentManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.greatlearning.StudentManagement.entity.User;



public interface UserRepository 
	extends JpaRepository<User, Long>{

	@Query("SELECT u FROM User u WHERE u.username = ?1")
	User getUserByUsername(String username);
}


