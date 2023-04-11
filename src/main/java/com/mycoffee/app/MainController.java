package com.mycoffee.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class MainController {
    @GetMapping("/")
    String index(){
        return "Hello, World!";
    }

}
