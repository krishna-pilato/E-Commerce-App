package com.app.repository;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.beans.User;
import com.app.enums.ApplicationRole;
import com.app.enums.UserStatus;

@Transactional
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	@Query("SELECT u FROM User u WHERE u.email = :emailAddress")
	Optional<User> findByEmailAddress(String emailAddress);

	@Query("SELECT u FROM User u WHERE u.userStatus = :userStatus AND u.created < :created")
	Page<User> findExpired(UserStatus userStatus, Date created, Pageable pageable);

	User findByEmail(String email);

	@Modifying
	@Query("UPDATE User u SET u.surname = :surname, u.name = :name, u.email = :email, u.applicationRole = :applicationRole WHERE u.email = :emailID")
	void update(String surname, String name, String email, ApplicationRole applicationRole, String emailID);
}