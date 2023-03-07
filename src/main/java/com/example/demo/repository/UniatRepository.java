package com.example.demo.repository;

import com.example.demo.entity.schemas.organizacion.UnidadAtencion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UniatRepository extends JpaRepository<UnidadAtencion, String> {
    List<UnidadAtencion> findAll();
}
