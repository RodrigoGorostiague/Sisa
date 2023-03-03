package com.example.demo.entity.schemas.seguridad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "predicado", schema = "seguridad")
public class Predicado {
    @Id
    @Column(name = "id_predicado")
    private Integer idPredicado;
    @Column(name = "id_condicion")
    private Integer idCondicion;
    @Column(name = "id_expresion")
    private Integer idExpresion;
    @Column(name = "nombre_campo")
    private String nombreCampo;
    @Column(name = "nombre_tabla")
    private String nombreTabla;
    @Column(name = "operador_compara")
    private String operadorCompara;
    @Column(name = "valor_int")
    private Integer valorInt;
    @Column(name = "valor_string")
    private String valorString;
    @Column(name = "valor_char")
    private String valorChar;

    public Integer getIdPredicado() {
        return idPredicado;
    }

    public void setIdPredicado(Integer idPredicado) {
        this.idPredicado = idPredicado;
    }

    public Integer getIdCondicion() {
        return idCondicion;
    }

    public void setIdCondicion(Integer idCondicion) {
        this.idCondicion = idCondicion;
    }

    public Integer getIdExpresion() {
        return idExpresion;
    }

    public void setIdExpresion(Integer idExpresion) {
        this.idExpresion = idExpresion;
    }

    public String getNombreCampo() {
        return nombreCampo;
    }

    public void setNombreCampo(String nombreCampo) {
        this.nombreCampo = nombreCampo;
    }

    public String getNombreTabla() {
        return nombreTabla;
    }

    public void setNombreTabla(String nombreTabla) {
        this.nombreTabla = nombreTabla;
    }

    public String getOperadorCompara() {
        return operadorCompara;
    }

    public void setOperadorCompara(String operadorCompara) {
        this.operadorCompara = operadorCompara;
    }

    public Integer getValorInt() {
        return valorInt;
    }

    public void setValorInt(Integer valorInt) {
        this.valorInt = valorInt;
    }

    public String getValorString() {
        return valorString;
    }

    public void setValorString(String valorString) {
        this.valorString = valorString;
    }

    public String getValorChar() {
        return valorChar;
    }

    public void setValorChar(String valorChar) {
        this.valorChar = valorChar;
    }
}
