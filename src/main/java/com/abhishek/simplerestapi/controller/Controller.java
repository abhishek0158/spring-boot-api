package com.abhishek.simplerestapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/home")
public class Controller {

    @GetMapping
    public String home(){
        return "Welcome Home";
    }

    @GetMapping("/json")
    public HashMap data(){
        HashMap hashMap=new HashMap();
        hashMap.put("name","abhsihek");
        hashMap.put("profession","sofware Engineer");
        hashMap.put("edu","BTECH");
        return hashMap;
    }

}
