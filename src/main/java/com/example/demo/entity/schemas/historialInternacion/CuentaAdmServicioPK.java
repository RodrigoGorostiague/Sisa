package com.example.demo.entity.schemas.historialInternacion;

import com.example.demo.entity.schemas.asistencia.PadronServicio;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

import java.io.Serializable;

@Embeddable
public class CuentaAdmServicioPK implements Serializable {
// TODO: 24/2/23 preguntar relacion
    @OneToOne
    @JoinColumn(name = "codigoservicio", referencedColumnName = "codigoservicio")
    private PadronServicio padronServicio;
    private String cuenta;

    public PadronServicio getPadronServicio() {
        return padronServicio;
    }

    public void setPadronServicio(PadronServicio padronServicio) {
        this.padronServicio = padronServicio;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
}
