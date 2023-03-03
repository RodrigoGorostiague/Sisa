package com.example.demo.entity.schemas.historialInternacion;

import com.example.demo.entity.schemas.asistencia.PadronEspecialidad;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.io.Serializable;
import java.util.List;

@Embeddable
public class CuentaInterConsultaPK implements Serializable {
    @ManyToOne
    @JoinColumn(name = "codigoespecialidad", referencedColumnName = "codigoespecialidad")
    private PadronEspecialidad padronEspecialidad;
    private String cuenta;

    public PadronEspecialidad getPadronEspecialidad() {
        return padronEspecialidad;
    }

    public void setPadronEspecialidad(PadronEspecialidad padronEspecialidad) {
        this.padronEspecialidad = padronEspecialidad;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
}
