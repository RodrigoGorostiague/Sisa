package com.example.demo.entity.schemas.cistoscopias;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Date;

@Embeddable
public class AnestesiaCistoPK implements Serializable {
    private Date fecha;
    @Column(name = "idpaciente")
    private Integer idPaciente;
    private Integer anestesia;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Integer getAnestesia() {
        return anestesia;
    }

    public void setAnestesia(Integer anestesia) {
        this.anestesia = anestesia;
    }
}
