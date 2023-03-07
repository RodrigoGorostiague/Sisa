package com.example.demo.controller;

import com.example.demo.entity.schemas.organizacion.UnidadAtencion;
import com.example.demo.service.UniatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/")
public class UniatController {
    @Autowired
    UniatService uniatService;
    @GetMapping("uniat")
    public List<UnidadAtencion> getTest(){ return uniatService.getUniat(); }

}
