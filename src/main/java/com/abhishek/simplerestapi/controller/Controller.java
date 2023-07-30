package com.abhishek.simplerestapi.controller;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/home")
public class Controller {
    @Autowired
    ApplicationArguments arguments;
    @GetMapping
    public String home() throws IOException {
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
