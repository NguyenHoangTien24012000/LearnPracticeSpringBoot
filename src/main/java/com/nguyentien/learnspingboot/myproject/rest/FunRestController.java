package com.nguyentien.learnspingboot.myproject.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // expose "/" return "hello world"
    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }

}
