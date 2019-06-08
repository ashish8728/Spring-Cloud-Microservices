package com.spring.learn.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Privilege {
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
 
    @ManyToMany(mappedBy = "privileges")
    private Collection<Role> roles;

	@Override
	public String toString() {
		return "Privilege [id=" + id + ", name=" + name + ", roles=" + roles.size() + "]";
	}
    
    
}