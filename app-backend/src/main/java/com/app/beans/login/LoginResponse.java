package com.app.beans.login;

import com.app.beans.User;

import lombok.Data;

@Data
public class LoginResponse {
	private String jwttoken;
	private User user;
}