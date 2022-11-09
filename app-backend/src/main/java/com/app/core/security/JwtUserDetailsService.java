package com.app.core.security;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.app.repository.UserRepository;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository repository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		com.app.beans.User user = this.repository.findByEmailAddress(username)
				.orElseThrow(() -> new UsernameNotFoundException("User not found with username: " + username));
		return new User(user.getEmail(), user.getPassword(), true, true, true, true,
				Arrays.asList(new SimpleGrantedAuthority(user.getApplicationRole().toString())));
	}
}