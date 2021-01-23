package com.giaothoa.auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("auth-api")
public class AuthController {

    @GetMapping("/hello")
    public String login() {
        return "Hello world!";
    }

}
