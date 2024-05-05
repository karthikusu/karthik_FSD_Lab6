package com.greatlearning.EmployManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.greatlearning.EmployManagement.Repository.UserRepository;
import com.greatlearning.EmployManagement.entity.User;


@Service
public class FetchedDecoratedUser implements UserDetailsService{
	
	@Autowired
	UserRepository userrepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=userrepo.findByUsername(username);
		if(user==null)
			throw new UsernameNotFoundException("User Not Found");
		
		
		return new UserDecorator(user);
	}

}
