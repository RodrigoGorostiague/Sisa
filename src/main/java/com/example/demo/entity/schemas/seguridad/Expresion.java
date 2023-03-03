package com.example.demo.entity.schemas.seguridad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "expresion", schema = "seguridad")
public class Expresion {
    @Id
    @Column(name = "id_expresion")
    private Integer idExpresion;
    @Column(name = "id_condicion")
    private Integer idCondicion;
    @Column(name = "operador_logico")
    private String operadorLogico;
    @Column(name = "expr_padre")
    private Integer exprPadre;

    public Integer getIdExpresion() {
        return idExpresion;
    }

    public void setIdExpresion(Integer idExpresion) {
        this.idExpresion = idExpresion;
    }

    public Integer getIdCondicion() {
        return idCondicion;
    }

    public void setIdCondicion(Integer idCondicion) {
        this.idCondicion = idCondicion;
    }

    public String getOperadorLogico() {
        return operadorLogico;
    }

    public void setOperadorLogico(String operadorLogico) {
        this.operadorLogico = operadorLogico;
    }

    public Integer getExprPadre() {
        return exprPadre;
    }

    public void setExprPadre(Integer exprPadre) {
        this.exprPadre = exprPadre;
    }
}
