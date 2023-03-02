package com.example.demo.entity.schemas.derivaciones;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Date;

@Embeddable
public class ReservaCombiPK implements Serializable {
    private Date fecha;
    @Column(name = "idpaciente")
    private Integer idPaciente;
    @Column(name = "idavuelta")
    private String idaVuelta;
    private String destino;

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

    public String getIdaVuelta() {
        return idaVuelta;
    }

    public void setIdaVuelta(String idaVuelta) {
        this.idaVuelta = idaVuelta;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
