package com.spring.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.learn.entity.Privilege;
import com.spring.learn.entity.User;

@Repository
public interface PrivilegeRepository extends JpaRepository<Privilege, Long> {
	public Privilege findPrivilegeByName(String name);
}
