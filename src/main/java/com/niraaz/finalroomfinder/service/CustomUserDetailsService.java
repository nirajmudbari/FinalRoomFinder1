package com.niraaz.finalroomfinder.service;

import com.niraaz.finalroomfinder.dao.UserDao;
import com.niraaz.finalroomfinder.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserDao userDao;

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDao.getUserByUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException("Username not found.");
        }

        return (UserDetails) user;
    }
}
