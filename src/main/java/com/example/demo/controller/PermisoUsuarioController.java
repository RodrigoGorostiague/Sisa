package com.example.demo.controller;

import com.example.demo.entity.schemas.admSistema.Grupo;
import com.example.demo.entity.schemas.admSistema.PermisoUsuario;
import com.example.demo.service.PermisoUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/")
public class PermisoUsuarioController {
    @Autowired
    PermisoUsuarioService permisoUsuarioService;
    String usuario = "GBRR_UAT_UAHRS";
    @GetMapping("permiso")
    public PermisoUsuario getPermiso(String usuario){
        return permisoUsuarioService.getPermiso(this.usuario); }
}



