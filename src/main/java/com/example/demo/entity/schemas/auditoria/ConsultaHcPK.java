package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Date;

@Embeddable
public class ConsultaHcPK implements Serializable {
    private Date fecha;
    private String usuario;
    @Column(name = "idpac_o_nromov")
    private Integer idPacienteONroMov;
    @Column(name = "modulohc")
    private String moduloHc;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Integer getIdPacienteONroMov() {
        return idPacienteONroMov;
    }

    public void setIdPacienteONroMov(Integer idPacienteONroMov) {
        this.idPacienteONroMov = idPacienteONroMov;
    }

    public String getModuloHc() {
        return moduloHc;
    }

    public void setModuloHc(String moduloHc) {
        this.moduloHc = moduloHc;
    }
}
