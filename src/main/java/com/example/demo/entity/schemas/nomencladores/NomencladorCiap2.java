package com.example.demo.entity.schemas.nomencladores;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "nomencladorciap2", schema = "nomencladores")
public class NomencladorCiap2 {
    @Id
    private String codigo;
    private Integer componente;
    @Column(name = "rubricacompleta")
    private String rubricaCompleta;
    @Column(name = "rubricaabreviada")
    private String rubricaAbreviada;
    private String criterios;
    private String incluido;
    private String excluido;
    @Column(name = "consideraciones")
    private String consideraAciones;
    private String notas;
    private String habilitado;
    @Column(name = "dsm_iv")
    private Boolean dsmIv;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getComponente() {
        return componente;
    }

    public void setComponente(Integer componente) {
        this.componente = componente;
    }

    public String getRubricaCompleta() {
        return rubricaCompleta;
    }

    public void setRubricaCompleta(String rubricaCompleta) {
        this.rubricaCompleta = rubricaCompleta;
    }

    public String getRubricaAbreviada() {
        return rubricaAbreviada;
    }

    public void setRubricaAbreviada(String rubricaAbreviada) {
        this.rubricaAbreviada = rubricaAbreviada;
    }

    public String getCriterios() {
        return criterios;
    }

    public void setCriterios(String criterios) {
        this.criterios = criterios;
    }

    public String getIncluido() {
        return incluido;
    }

    public void setIncluido(String incluido) {
        this.incluido = incluido;
    }

    public String getExcluido() {
        return excluido;
    }

    public void setExcluido(String excluido) {
        this.excluido = excluido;
    }

    public String getConsideraAciones() {
        return consideraAciones;
    }

    public void setConsideraAciones(String consideraAciones) {
        this.consideraAciones = consideraAciones;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public String getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(String habilitado) {
        this.habilitado = habilitado;
    }

    public Boolean getDsmIv() {
        return dsmIv;
    }

    public void setDsmIv(Boolean dsmIv) {
        this.dsmIv = dsmIv;
    }
}
