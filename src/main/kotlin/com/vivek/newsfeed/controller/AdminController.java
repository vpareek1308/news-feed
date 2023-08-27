package com.vivek.newsfeed.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @GetMapping("/ping")
    ResponseEntity<?> ping() {
        ResponseEntity<?> response = new ResponseEntity<>("pong", HttpStatus.OK);
        return response;
    }
}