package com.example.demo.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.RestController; 
import java.util.Map;

@RestController
public class exam82213721 {

    @GetMapping("/api/v1/user") 
    public Map<String, String> home() { 
        Map<String, String> response = new HashMap<>(); 
        response.put("user_id", "82213721");
        return response; 
    }
}
