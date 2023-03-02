package com.example.demo.entity.schemas.paciente;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "gruposanguineo", schema = "paciente")
public class GrupoSanguineo {
    @Id
    @Column(name = "idgruposanguineo")
    private String idGrupoSanguineo;
    private String descripcion;

    public String getIdGrupoSanguineo() {
        return idGrupoSanguineo;
    }

    public void setIdGrupoSanguineo(String idGrupoSanguineo) {
        this.idGrupoSanguineo = idGrupoSanguineo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
