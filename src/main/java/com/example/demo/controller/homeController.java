/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author skybar
 */
@RestController
@RequestMapping("/")
public class homeController {
    
    @GetMapping
    public String home() {
        return "<h1>Hello DS-2022 Discovery Service</h1>";
    }
}
