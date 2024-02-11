package com.spring.RestApi.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.RestApi.Entity.User_Data;

public interface UserRepo extends JpaRepository<User_Data, Integer>{

	public List<User_Data> findByname(String name);
}
