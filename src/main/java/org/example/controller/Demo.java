package org.example.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class Demo {

    @PostMapping("/api/registration")
    public String generateJWT(@RequestBody Map body) {
        return "OK";
    }

}
