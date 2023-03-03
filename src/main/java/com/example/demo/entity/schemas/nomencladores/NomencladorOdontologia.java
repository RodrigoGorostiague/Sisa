package com.example.demo.entity.schemas.nomencladores;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "nomencladorodontologia")
public class NomencladorOdontologia {
    @Id
    private String codigo;
    private String descripcion;
    private String agrupamiento;
    @Column(name = "unidadesodontologicas")
    private Integer unidadesOdontologicas;
    @Column(name = "llevapieza")
    private String llevaPieza;
    private String especificacion;
    @Column(name = "multiplespiezas")
    private String multiplesPiezas;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAgrupamiento() {
        return agrupamiento;
    }

    public void setAgrupamiento(String agrupamiento) {
        this.agrupamiento = agrupamiento;
    }

    public Integer getUnidadesOdontologicas() {
        return unidadesOdontologicas;
    }

    public void setUnidadesOdontologicas(Integer unidadesOdontologicas) {
        this.unidadesOdontologicas = unidadesOdontologicas;
    }

    public String getLlevaPieza() {
        return llevaPieza;
    }

    public void setLlevaPieza(String llevaPieza) {
        this.llevaPieza = llevaPieza;
    }

    public String getEspecificacion() {
        return especificacion;
    }

    public void setEspecificacion(String especificacion) {
        this.especificacion = especificacion;
    }

    public String getMultiplesPiezas() {
        return multiplesPiezas;
    }

    public void setMultiplesPiezas(String multiplesPiezas) {
        this.multiplesPiezas = multiplesPiezas;
    }
}
