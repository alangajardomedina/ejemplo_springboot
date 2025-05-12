package com.example.ejemplito.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ejemplo {
    
    @GetMapping("/")
    public String saludar(){
        return "hola mundo";
    }
}
