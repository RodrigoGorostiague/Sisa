package com.example.demo.service;

import com.example.demo.entity.schemas.admSistema.Grupo;
import com.example.demo.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {
    @Autowired
    MenuRepository menuRepository;
    public List<Grupo> getMenu(Integer idGrupo){ return (List<Grupo>) menuRepository.findByIdGrupo(idGrupo);}
}
