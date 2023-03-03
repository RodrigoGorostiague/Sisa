package com.example.demo.entity.schemas.historialEnfermeria;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class LineasEvolucionPK implements Serializable {
    @Column(name = "nrointernacion")
    private Integer nroInternacion;
    @Column(name = "fechaevol")
    private Date fechaEvol;
    @Column(name = "horaevol")
    private LocalDateTime horaEvol;
    @Column(name = "codigopersonal")
    private String codigoPersonal;
    @Column(name = "codigonic")
    private String  codigoNic;

    public Integer getNroInternacion() {
        return nroInternacion;
    }

    public void setNroInternacion(Integer nroInternacion) {
        this.nroInternacion = nroInternacion;
    }

    public Date getFechaEvol() {
        return fechaEvol;
    }

    public void setFechaEvol(Date fechaEvol) {
        this.fechaEvol = fechaEvol;
    }

    public LocalDateTime getHoraEvol() {
        return horaEvol;
    }

    public void setHoraEvol(LocalDateTime horaEvol) {
        this.horaEvol = horaEvol;
    }

    public String getCodigoPersonal() {
        return codigoPersonal;
    }

    public void setCodigoPersonal(String codigoPersonal) {
        this.codigoPersonal = codigoPersonal;
    }

    public String getCodigoNic() {
        return codigoNic;
    }

    public void setCodigoNic(String codigoNic) {
        this.codigoNic = codigoNic;
    }
}
