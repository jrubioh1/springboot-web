package com.jorge.curso.springboot.web.springbootweb.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.jorge.curso.springboot.web.springbootweb.models.User;



@Controller
public class UserController {

    @GetMapping("/details")
    public String details (Model model){
        
        User user=new User("Jorge", "Rubio", "sdfdgf");
        model.addAttribute("title", "Hola mundo SpringBoot");
        model.addAttribute("user", user);
      
        return "details";
    }

   @GetMapping("/list")
   public String list(ModelMap model)  {

    /*List<User> users=Arrays.asList(
        new User("pepa", "perez", "sdfsfghgh"),
        new User("antonio", "flores"),
        new User("jorge", "loli")
    );

    model.addAttribute("users", users);*/
    model.addAttribute("title", "Lista de usuarios");

    return "list";
   }

   @ModelAttribute("users")
   public List<User> userModel(){
    return Arrays.asList(
        new User("pepa", "perez", "sdfsfghgh"),
        new User("antonio", "flores"),
        new User("jorge", "loli")
    );

   }

}


