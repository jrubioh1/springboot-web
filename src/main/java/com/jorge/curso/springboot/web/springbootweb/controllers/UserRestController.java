package com.jorge.curso.springboot.web.springbootweb.controllers;


import java.util.Map;
//import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jorge.curso.springboot.web.springbootweb.models.User;
import com.jorge.curso.springboot.web.springbootweb.models.DTO.UserDTO;

import org.springframework.web.bind.annotation.RequestMapping;






@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public UserDTO details (){
       UserDTO userDTO= new UserDTO();
       User user= new User("Jorge", "Rubio", "sdfsddgh");

       userDTO.setUser(user);
       userDTO.setTitle("Hola mundo desde Springboot");

       // Map <String, Object> body =new HashMap<>();

        //body.put("title", "Hola Mundo desde SpingBoot");
       // body.put("user", user);
       


        return userDTO;
    }

    @GetMapping("/list")
    public List<User> list(){

        User user= new User("Andres", "Guzman");
        User user2= new User("Jorge", "Guzman");
        User user3= new User("Antonio", "Guzman");
        
        List<User> users= Arrays.asList(user, user2, user3);
        //List <User> users= new ArrayList<>();
       // users.add(user);
        //users.add(user2);
       // users.add(user3);

        return users;


    }

    @GetMapping("/details-map")
    public Map<String, Object> detailsMap (){
        User user=new User("Jorge", "Rubio");

        Map <String, Object> body =new HashMap<>();

        body.put("title", "Hola Mundo desde SpingBoot");
        body.put("user", user);
       


        return body;
    }



}
