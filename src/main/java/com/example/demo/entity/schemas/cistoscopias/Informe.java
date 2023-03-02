package com.example.demo.entity.schemas.cistoscopias;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "cistoscopias", name = "informe")
public class Informe {
    @EmbeddedId
    private InformePK id;
    private String profesional;
    @Column(name = "textoinforme")
    private String textoInforme;
}
