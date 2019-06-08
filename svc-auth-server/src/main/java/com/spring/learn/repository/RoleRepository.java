package com.spring.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.learn.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	public Role findRoleByName(String username);
}
