package com.jorge.curso.springboot.web.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jorge.curso.springboot.web.springbootweb.models.User;



@Controller
public class UserController {

    @GetMapping("/details")
    public String details (Model model){
        
        User user=new User("Jorge", "Rubio");
        model.addAttribute("title", "Hola mundo SpringBoot");
        model.addAttribute("user", user);
      
        return "details";
    }

}
