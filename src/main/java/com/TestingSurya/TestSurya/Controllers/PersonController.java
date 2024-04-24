package com.TestingSurya.TestSurya.Controllers;


import com.TestingSurya.TestSurya.DTO.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/hello")
    public String hello() {
        return "Ss";
    }

}