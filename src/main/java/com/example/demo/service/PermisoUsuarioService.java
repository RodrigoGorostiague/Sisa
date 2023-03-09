package com.example.demo.service;

import com.example.demo.entity.schemas.admSistema.PermisoUsuario;
import com.example.demo.repository.PermisoUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermisoUsuarioService {
    @Autowired
    PermisoUsuarioRepository permisoUsuarioRepository;
    public PermisoUsuario getPermiso(String usuario){return permisoUsuarioRepository.findByUsuario(usuario);}
}
