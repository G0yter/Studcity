package com.gmail.goyter012.studcity.service;

import com.gmail.goyter012.studcity.model.User;
import com.gmail.goyter012.studcity.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    private  UserRepo userRepo;


    public User findUserByUsername(String username){
        return userRepo.findByUsername(username);
    }

    public User saveUser(User user){
        userRepo.save(user);
        return user;
    }

    public List<User> findAllUsers(){
        return (List<User>)(userRepo.findAll());
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return (UserDetails) userRepo.findByUsername(username);
    }
}
