package com.example.demo.entity.schemas.paciente;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tablasparaunificar", schema = "paciente")
public class TablasParaUnificar {
    @Id
    private String tabla;
    @Column(name = "codigosqlunificacion")
    private String codigoSqlUnificacion;
    private String observacion;
    @Column(name = "codigosqlmovimientos")
    private String codigoSqlMovimientos;

    public String getTabla() {
        return tabla;
    }

    public void setTabla(String tabla) {
        this.tabla = tabla;
    }

    public String getCodigoSqlUnificacion() {
        return codigoSqlUnificacion;
    }

    public void setCodigoSqlUnificacion(String codigoSqlUnificacion) {
        this.codigoSqlUnificacion = codigoSqlUnificacion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getCodigoSqlMovimientos() {
        return codigoSqlMovimientos;
    }

    public void setCodigoSqlMovimientos(String codigoSqlMovimientos) {
        this.codigoSqlMovimientos = codigoSqlMovimientos;
    }
}
