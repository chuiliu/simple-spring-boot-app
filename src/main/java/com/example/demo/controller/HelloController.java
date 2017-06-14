package com.example.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zcl
 * @date 2017/5/23
 */

@RestController
public class HelloController {

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/hello",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public String hello() {
        return "Hello";
    }
}
