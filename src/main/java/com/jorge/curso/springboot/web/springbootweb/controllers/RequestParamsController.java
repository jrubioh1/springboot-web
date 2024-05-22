package com.jorge.curso.springboot.web.springbootweb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jorge.curso.springboot.web.springbootweb.models.DTO.ParamDto;
import com.jorge.curso.springboot.web.springbootweb.models.DTO.ParamDtoMix;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/params")
public class RequestParamsController {
    
    @GetMapping("/foo")
    public ParamDto foo(@RequestParam(required = false, defaultValue = "default", name = "mensaje") String message ){

        ParamDto param= new ParamDto();
        param.setMessage(message);

        return param;

        
    }

    @GetMapping("/bar")
    public ParamDtoMix bar(@RequestParam String text, @RequestParam Integer code){
        ParamDtoMix param= new ParamDtoMix();
        param.setMessage(text);
        param.setCode(code);
        return param;
    }

    @GetMapping("/request")
    public ParamDtoMix request(HttpServletRequest request){
        Integer code= 0; 
        try{ 
              Integer.parseInt(request.getParameter("code"));
            }catch(NumberFormatException e){
               
            }
     
        ParamDtoMix param= new ParamDtoMix();
        param.setCode(code);
        param.setMessage(request.getParameter("message"));

        return param;

    }
}
