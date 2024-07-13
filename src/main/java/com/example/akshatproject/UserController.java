package com.example.akshatproject;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public String getUsers() {
        return "HTTP Get request was sent";
    }

    @PostMapping
    public String createUsers() {
        return "HTTP Post request was sent";
    }

    @DeleteMapping
    public String deleteUsers() {
        return "HTTP Delete request was sent";
    }

    @PutMapping
    public String updateUsers() {
        return "HTTP update request was sent";
    }
}
