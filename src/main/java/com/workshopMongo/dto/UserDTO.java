package com.workshopMongo.dto;

import java.io.Serializable;

import com.workshopMongo.domain.User;

public class UserDTO implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	
	// Attributes
	private String id;
	private String name;
	private String email;
	
	// Constructors
	public UserDTO() {
	}
	
	public UserDTO(User user) {
		id = user.getId();
		name = user.getName();
		email = user.getEmail();
	}

	// Getters and Setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
