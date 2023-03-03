package com.example.demo.entity.schemas.laboratorio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "padronpracticas", schema = "laboratorio_2009")
public class PadronPracticas {
    @Id
    @Column(name = "codigopractica")
    private String codigoPractica;
    private String descripcion;
    @Column(name = "derutina")
    private String deRutina;
    @Column(name = "derutinaguardia")
    private String deRutinaGuardia;
    @Column(name = "derutinaguardiadbv")
    private String deRutinaGuardiaDbv;
    @Column(name = "derutinainternacion")
    private String deRutinaInternacion;
    @Column(name = "derutinainternaciondbv")
    private String deRutinaInternacionDbv;
    @Column(name = "diasrepedido")
    private Integer diasRePedido;

    public String getCodigoPractica() {
        return codigoPractica;
    }

    public void setCodigoPractica(String codigoPractica) {
        this.codigoPractica = codigoPractica;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDeRutina() {
        return deRutina;
    }

    public void setDeRutina(String deRutina) {
        this.deRutina = deRutina;
    }

    public String getDeRutinaGuardia() {
        return deRutinaGuardia;
    }

    public void setDeRutinaGuardia(String deRutinaGuardia) {
        this.deRutinaGuardia = deRutinaGuardia;
    }

    public String getDeRutinaGuardiaDbv() {
        return deRutinaGuardiaDbv;
    }

    public void setDeRutinaGuardiaDbv(String deRutinaGuardiaDbv) {
        this.deRutinaGuardiaDbv = deRutinaGuardiaDbv;
    }

    public String getDeRutinaInternacion() {
        return deRutinaInternacion;
    }

    public void setDeRutinaInternacion(String deRutinaInternacion) {
        this.deRutinaInternacion = deRutinaInternacion;
    }

    public String getDeRutinaInternacionDbv() {
        return deRutinaInternacionDbv;
    }

    public void setDeRutinaInternacionDbv(String deRutinaInternacionDbv) {
        this.deRutinaInternacionDbv = deRutinaInternacionDbv;
    }

    public Integer getDiasRePedido() {
        return diasRePedido;
    }

    public void setDiasRePedido(Integer diasRePedido) {
        this.diasRePedido = diasRePedido;
    }
}
