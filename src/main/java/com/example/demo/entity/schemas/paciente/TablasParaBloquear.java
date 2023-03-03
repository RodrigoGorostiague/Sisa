package com.example.demo.entity.schemas.paciente;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tablasparabloquear", schema = "paciente")
public class TablasParaBloquear {
    @Id
    private String tabla;
    @Column(name = "campoidpaciente")
    private String campoIdPaciente;

    public String getTabla() {
        return tabla;
    }

    public void setTabla(String tabla) {
        this.tabla = tabla;
    }

    public String getCampoIdPaciente() {
        return campoIdPaciente;
    }

    public void setCampoIdPaciente(String campoIdPaciente) {
        this.campoIdPaciente = campoIdPaciente;
    }
}
