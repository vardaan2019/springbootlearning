package com.example.security;

import java.util.ArrayList;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
@Service
public class CustomerDetailService implements UserDetailsService{

	@Override
	public CustomerUser loadUserByUsername(String username) throws UsernameNotFoundException {
		Collection<GrantedAuthority> grantlist=new ArrayList<>();
		GrantedAuthority grantedAuthority = new SimpleGrantedAuthority("ROLE_ADMIN");
		grantlist.add(grantedAuthority);
		UserEntity entity=new UserEntity();
		entity.setUserName("Alex123");
		entity.setPassWord("$2a$04$I9Q2sDc4QGGg5WNTLmsz0.fvGv3OjoZyj81PrSFyGOqMphqfS2qKu");
		entity.setGrantlist(grantlist);
		CustomerUser  customuser=new CustomerUser(entity);
		return customuser;
	}
}
