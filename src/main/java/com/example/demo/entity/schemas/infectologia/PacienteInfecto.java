package com.example.demo.entity.schemas.infectologia;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Date;

@Entity
@Table(name = "pacienteinfecto",schema = "infectologia")
public class PacienteInfecto {
    @Id
    @Column(name = "idpac")
    private Integer idPac;
    @Column(name = "fechadiagnostico")
    private Date fechaDiagnostico;
    @Column(name = "lugardiagnostico")
    private String lugarDiagnostico;
    private String codigo;

    public Integer getIdPac() {
        return idPac;
    }

    public void setIdPac(Integer idPac) {
        this.idPac = idPac;
    }

    public Date getFechaDiagnostico() {
        return fechaDiagnostico;
    }

    public void setFechaDiagnostico(Date fechaDiagnostico) {
        this.fechaDiagnostico = fechaDiagnostico;
    }

    public String getLugarDiagnostico() {
        return lugarDiagnostico;
    }

    public void setLugarDiagnostico(String lugarDiagnostico) {
        this.lugarDiagnostico = lugarDiagnostico;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
