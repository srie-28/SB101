package com.kgisl.sb101.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/customer")
@RestController
public class CustomerController {
    {System.out.println("*********Customer**********");}
    @GetMapping
    public List<String>getAllCustomers(){
        List<String>players=List.of("srie","lekhaa");
        return players;
    }
}
