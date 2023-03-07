package com.example.demo.controller;

import com.example.demo.entity.schemas.admSistema.Grupo;
import com.example.demo.entity.schemas.admSistema.Menu;
import com.example.demo.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("menu")
public class MenuController {
    @Autowired
    MenuService menuService;
    @GetMapping("/{id}")
    public List<Grupo> getMenu(@PathVariable("id")Integer idGrupo){ return menuService.getMenu(idGrupo); }
}
