package com.example.demo.service;

import com.example.demo.entity.schemas.domicilio.Localidad;
import com.example.demo.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    @Autowired
    TestRepository testRepository;
    public List<Localidad> getTest(){ return (List<Localidad>) testRepository.findAll(); }

}
