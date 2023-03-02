package com.example.demo.repository;

import com.example.demo.entity.schemas.domicilio.Localidad;
import com.example.demo.entity.schemas.domicilio.LocalidadPK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TestRepository  extends JpaRepository<Localidad, LocalidadPK> {
    List<Localidad> findAll();
}
