package com.example.demo.controller;

import com.example.demo.entity.schemas.domicilio.Localidad;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("test")
public class TestController {
    @Autowired
    TestService testService;
    @GetMapping()
    public List<Localidad> getTest(){ return testService.getTest(); }

}
