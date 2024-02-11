package com.spring.RestApi.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.RestApi.Entity.User_Data;
import com.spring.RestApi.Repo.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo repo;
	
	public User_Data savaData(User_Data user_Data) {
		return repo.save(user_Data);
	}
	
	public List<User_Data> saveAll(List<User_Data> user_Data){
		return repo.saveAll(user_Data);
	}
	
	public Optional<User_Data> GetByid(int id) {
		
		return repo.findById(id);
	}
	
	public List<User_Data> getByName(String name){
		return repo.findByname(name);
	}
	
	public String deleteId(int id) {
		
		repo.deleteById(id);
		return "Id sucessfully deleted"+id;
	}
	
	
	
}
