package com.example.demo.entity.schemas.historialAmbEsp;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historialambesp", name = "formularioespecialidad")
public class FormularioEspecialidad {
    @EmbeddedId
    private FormularioEspecialidadPK id;
    @Column(name = "urlformulario")
    private String urlFormulario;

    public FormularioEspecialidadPK getId() {
        return id;
    }

    public void setId(FormularioEspecialidadPK id) {
        this.id = id;
    }

    public String getUrlFormulario() {
        return urlFormulario;
    }

    public void setUrlFormulario(String urlFormulario) {
        this.urlFormulario = urlFormulario;
    }
}
