package com.ensat.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class IndexController {

    @GetMapping("/")
    String index() {
        return "index";
    }

}
