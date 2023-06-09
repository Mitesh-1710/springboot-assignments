package com.geekster.springboot.assignment.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Login {
	
	private String uuid;
	private String username;
	private String password;
	private String salt;
	private String md5;
	private String sha1;
	private String sha256;
	
	public Login(String uuid, String username, String password, String salt, String md5, String sha1, String sha256) {
		super();
		this.uuid = uuid;
		this.username = username;
		this.password = password;
		this.salt = salt;
		this.md5 = md5;
		this.sha1 = sha1;
		this.sha256 = sha256;
	}
	
}
