/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rockville.loggingdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Nouman Ahmed
 */
@RestController
@Slf4j
public class TestController {

    @GetMapping("/test")
    public String helloWorld(@RequestParam("query") String query) {
        log.info("Request received : {}", query);
        return "Hello World";
    }
}
