package nl.gettoworktogether.security_with_jwt.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class BaseController {

    @CrossOrigin(origins = "http://localhost:3000")

    @GetMapping(value = "/")
    public String hello() {
        return "Hello World";
    }

}
