package com.example.demo.entity.schemas.cistoscopias;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Date;

@Embeddable
public class AnestesistaCistoPK implements Serializable {
    private Date fecha;
    @Column(name = "idpaciente")
    private Integer idPaciente;
    private String anestesista;

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

    public String getAnestesista() {
        return anestesista;
    }

    public void setAnestesista(String anestesista) {
        this.anestesista = anestesista;
    }
}
