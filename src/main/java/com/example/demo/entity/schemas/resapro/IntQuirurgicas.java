package com.example.demo.entity.schemas.resapro;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "intquirurgicas", schema = "resapro")
public class IntQuirurgicas {
    @Id
    @Column(name = "id_internacion_local")
    private String idLnternacionLocal;
    @Column(name = "cod_estable")
    private String  codEstable;
    @Column(name = "cod_int_quirurgica")
    private String codIntQuirurgica;
    @Column(name = "fecha_intervencion")
    private Date fechaIntervencion;
    private Integer orden;

    public String getIdLnternacionLocal() {
        return idLnternacionLocal;
    }

    public void setIdLnternacionLocal(String idLnternacionLocal) {
        this.idLnternacionLocal = idLnternacionLocal;
    }

    public String getCodEstable() {
        return codEstable;
    }

    public void setCodEstable(String codEstable) {
        this.codEstable = codEstable;
    }

    public String getCodIntQuirurgica() {
        return codIntQuirurgica;
    }

    public void setCodIntQuirurgica(String codIntQuirurgica) {
        this.codIntQuirurgica = codIntQuirurgica;
    }

    public Date getFechaIntervencion() {
        return fechaIntervencion;
    }

    public void setFechaIntervencion(Date fechaIntervencion) {
        this.fechaIntervencion = fechaIntervencion;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }
}
