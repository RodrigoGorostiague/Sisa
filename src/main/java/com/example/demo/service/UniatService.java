package com.example.demo.service;


import com.example.demo.entity.schemas.organizacion.UnidadAtencion;
import com.example.demo.repository.UniatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniatService {
    @Autowired
    UniatRepository uniatRepository;
    public List<UnidadAtencion> getUniat(){ return (List<UnidadAtencion>) uniatRepository.findAll(); }

}
