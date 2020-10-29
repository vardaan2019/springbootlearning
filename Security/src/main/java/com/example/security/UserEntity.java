package com.example.security;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

public class UserEntity {
	private String userName;
	private String passWord;
	private Collection<GrantedAuthority> grantlist=new ArrayList<>();
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public Collection<GrantedAuthority> getGrantlist() {
		return grantlist;
	}
	public void setGrantlist(Collection<GrantedAuthority> grantlist) {
		this.grantlist = grantlist;
	}
	

}
