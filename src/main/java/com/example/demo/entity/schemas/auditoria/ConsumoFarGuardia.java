package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "consumofarguardia")
public class ConsumoFarGuardia {
    @EmbeddedId
    private ConsumoFarGuardiaPK id;
    private String usuario;
    private String operacion;
    private Integer clase;
    private Integer item;

    public ConsumoFarGuardiaPK getId() {
        return id;
    }

    public void setId(ConsumoFarGuardiaPK id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public Integer getClase() {
        return clase;
    }

    public void setClase(Integer clase) {
        this.clase = clase;
    }

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }
}
