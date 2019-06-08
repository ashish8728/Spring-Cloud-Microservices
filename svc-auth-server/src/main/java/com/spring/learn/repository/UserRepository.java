package com.spring.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.learn.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	public User findUserByUsername(String username);
}
