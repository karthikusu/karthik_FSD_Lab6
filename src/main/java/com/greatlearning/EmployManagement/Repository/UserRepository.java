package com.greatlearning.EmployManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.EmployManagement.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	public User findByUsername(String s);
}
