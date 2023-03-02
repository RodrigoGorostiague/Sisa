package com.example.demo.entity.schemas.emergencia;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(schema = "accfidentado", name = "accidentadolesiones")
public class AccidentadoLesiones {
    @Id
    private String codigo;
    private String descripcion;
    @OneToMany(mappedBy = "accidentadoLesiones")
    private List<AccidentadoEmergencias> accidentadoEmergencias;

    public List<AccidentadoEmergencias> getAccidentadoEmergencias() {
        return accidentadoEmergencias;
    }

    public void setAccidentadoEmergencias(List<AccidentadoEmergencias> accidentadoEmergencias) {
        this.accidentadoEmergencias = accidentadoEmergencias;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
