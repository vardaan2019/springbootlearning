package com.example.security;

import org.springframework.security.core.userdetails.User;

public class CustomerUser extends User {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomerUser(UserEntity user) {
		super(user.getUserName(), user.getPassWord(), user.getGrantlist());
	}

}
