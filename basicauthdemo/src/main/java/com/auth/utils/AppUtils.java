package com.auth.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppUtils {
	@Value("${user.name}")
	private String userName;
	@Value("${user.password}")
	private String password;
	@Value("${user.role}")
	private String userRole;
	@Value("${user.admin}")
	private String admin;
	@Value("${user.adminrole}")
	private String adminRole;

	public String getUserRole() {
		return userRole;
	}

	public String getAdminRole() {
		return adminRole;
	}

	public String getAdmin() {
		return admin;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

}
