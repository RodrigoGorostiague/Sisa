package com.example.demo.entity.schemas.domicilio;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "domicilio", name = "localidadpciabuenosaires")
public class LocalidadPciaBuenosAires {
    @EmbeddedId
    private LocalidadPciaBuenosAiresPK id;
    private String nombre;

    public LocalidadPciaBuenosAiresPK getId() {
        return id;
    }

    public void setId(LocalidadPciaBuenosAiresPK id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
