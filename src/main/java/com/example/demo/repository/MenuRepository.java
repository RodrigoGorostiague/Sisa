package com.example.demo.repository;

import com.example.demo.entity.schemas.admSistema.Grupo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuRepository extends JpaRepository<Grupo, Integer> {
    List<Grupo> findByIdGrupo(Integer idGrupo);
}




