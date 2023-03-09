package com.example.demo.repository;

import com.example.demo.entity.schemas.admSistema.PermisoUsuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PermisoUsuarioRepository extends JpaRepository<PermisoUsuario, String> {
    PermisoUsuario findByUsuario(String usuario);
}
