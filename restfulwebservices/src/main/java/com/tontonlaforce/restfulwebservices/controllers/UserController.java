package com.tontonlaforce.restfulwebservices.controllers;

import com.tontonlaforce.restfulwebservices.entities.UserBean;
import com.tontonlaforce.restfulwebservices.exceptions.UserBeanNotFoundException;
import com.tontonlaforce.restfulwebservices.repositories.UserRepository;
import com.tontonlaforce.restfulwebservices.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class UserController {

    private static List<UserBean> users = new ArrayList<>();
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<UserBean> readAllUser(){
        if ( users.size() == 0 ){
            users = new ArrayList<>();
            users.add( new UserBean( 1 , "monthe" , new Date() ) );
            users.add( new UserBean( 2, "brice" , new Date() ) );
            userRepository.saveAll( users );
            return users;
        }else
            return (List<UserBean>) userRepository.findAll();

    }

    @PostMapping("/users")
    public UserBean createUser(@Valid  @RequestBody UserBean userBean ){
        return userRepository.save( userBean );
        //users.add( userBean );
    }

    @GetMapping("/users/{id}")
    public UserBean readuserByid(@PathVariable long id ){
        return userRepository.findById( id ).get();
    }

    @DeleteMapping("/users/{id}")
    public void deleteUserById(@PathVariable long id ){
        if( !userRepository.findById( id ).isPresent() )
            throw new UserBeanNotFoundException( "id -"+ id );
        userRepository.deleteById( id );

    }
}
