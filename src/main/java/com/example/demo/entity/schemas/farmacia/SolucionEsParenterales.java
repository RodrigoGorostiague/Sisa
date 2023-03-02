package com.api.sisa.entity.schemas.farmacia;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "solucionesparenterales", schema = "farmacia")
public class SolucionEsParenterales {
    @Id
    private String codigo;
    private String descripcion;
    @OneToMany
    @JoinColumns({
            @JoinColumn(name = "codigoclase", referencedColumnName = "codigoclase"),
            @JoinColumn(name = "item", referencedColumnName = "item")
    })
    private List<Item> item;

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

    public List<Item> getItem() {
        return item;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }
}
