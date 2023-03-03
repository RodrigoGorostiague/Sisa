package com.example.demo.entity.schemas.paciente;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tablasctrlmovfuerarango", schema = "paciente")
public class TablasCtrlMovFueraRango {
    @Id
    private String sql;
    @Column(name = "datoscorrespodientesa")
    private String datosCorrespodienteSa;
    private String sistema;

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public String getDatosCorrespodienteSa() {
        return datosCorrespodienteSa;
    }

    public void setDatosCorrespodienteSa(String datosCorrespodienteSa) {
        this.datosCorrespodienteSa = datosCorrespodienteSa;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }
}
