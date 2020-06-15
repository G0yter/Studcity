package com.gmail.goyter012.studcity.controller;

import com.gmail.goyter012.studcity.model.Role;
import com.gmail.goyter012.studcity.model.User;
import com.gmail.goyter012.studcity.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

@Controller
public class RegistrationController {



    @Autowired
    private UserRepo userRepo;

    @GetMapping("/registration")
    public String registration(){
        return "registration";
    }

    @PostMapping("/registration")
    public String addUser(User user, Map<String,Object> model){

        User userFromDb = userRepo.findByUsername(user.getUsername());
        if(userFromDb != null){
            model.put("message", "User exists");
            return "registration";
        }

        user.setActive(true);
        user.setRoles(Collections.singleton(Role.USER));
        userRepo.save(user);

        ArrayList<User> users = (ArrayList<User>) userRepo.findAll();

        return "redirect:/login";
    }



}
