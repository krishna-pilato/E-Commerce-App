package com.app.beans;

import java.util.Date;

import com.app.enums.ApplicationRole;
import com.app.enums.UserStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name, surname;
	@Column(unique = true, length = 256)
	private String email;
	private String password;
	@Column(name = "user_status")
	private UserStatus userStatus;
	@Column(name = "application_role")
	private ApplicationRole applicationRole;

	private Date created;
	@Column(name = "last_modified")
	private Date lastModified;
	@Column(name = "`key`", unique = true)
	private String key;
}