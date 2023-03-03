package com.example.demo.entity.schemas.paciente;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "paciente_actualizar_datos_defunciones", schema = "paciente")
public class PacienteActualizarDatosDefunciones {
    @Id
    @Column(name = "idpaciente")
    private Integer idPaciente;
    private Boolean defusion;
    @Column(name = "fechadefuncion")
    private Date fechaDefuncion;
    @Column(name = "lugardefuncion")
    private String lugarDefuncion;

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Boolean getDefusion() {
        return defusion;
    }

    public void setDefusion(Boolean defusion) {
        this.defusion = defusion;
    }

    public Date getFechaDefuncion() {
        return fechaDefuncion;
    }

    public void setFechaDefuncion(Date fechaDefuncion) {
        this.fechaDefuncion = fechaDefuncion;
    }

    public String getLugarDefuncion() {
        return lugarDefuncion;
    }

    public void setLugarDefuncion(String lugarDefuncion) {
        this.lugarDefuncion = lugarDefuncion;
    }
}
