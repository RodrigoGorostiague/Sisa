package com.example.demo.entity.schemas.hemoterapia;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "hemoterapia", name = "recepcionbolsasangre")
public class RecepcionBolsaSangre {
    @EmbeddedId
    private RecepcionBolsaSangrePK id;
    private String observaciones;
    private String nrorecepcion;
    @Column(name = "bolsasvacias")
    private Integer bolsasVacias;
    @Column(name = "etiquetas")
    private Integer etiquetas;
    private Integer tubos;
    @Column(name = "cantproductos")
    private Integer cantProductos;

    public RecepcionBolsaSangrePK getId() {
        return id;
    }

    public void setId(RecepcionBolsaSangrePK id) {
        this.id = id;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getNrorecepcion() {
        return nrorecepcion;
    }

    public void setNrorecepcion(String nrorecepcion) {
        this.nrorecepcion = nrorecepcion;
    }

    public Integer getBolsasVacias() {
        return bolsasVacias;
    }

    public void setBolsasVacias(Integer bolsasVacias) {
        this.bolsasVacias = bolsasVacias;
    }

    public Integer getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(Integer etiquetas) {
        this.etiquetas = etiquetas;
    }

    public Integer getTubos() {
        return tubos;
    }

    public void setTubos(Integer tubos) {
        this.tubos = tubos;
    }

    public Integer getCantProductos() {
        return cantProductos;
    }

    public void setCantProductos(Integer cantProductos) {
        this.cantProductos = cantProductos;
    }
}
