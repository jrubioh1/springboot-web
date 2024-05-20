package com.jorge.curso.springboot.web.springbootweb.controllers;


import java.util.Map;
import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jorge.curso.springboot.web.springbootweb.models.User;

import org.springframework.web.bind.annotation.RequestMapping;






@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public Map<String, Object> details (){
        User user=new User("Jorge", "Rubio");

        Map <String, Object> body =new HashMap<>();

        body.put("title", "Hola Mundo desde SpingBoot");
        body.put("user", user);
       


        return body;
    }

}
