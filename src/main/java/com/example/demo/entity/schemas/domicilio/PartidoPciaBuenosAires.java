package com.example.demo.entity.schemas.domicilio;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(schema = "domicilio", name = "")
public class PartidoPciaBuenosAires {
    @Id
    private Integer codigopartido;
    private String nombre;
    @OneToMany(mappedBy = "id.partidoPciaBuenosAires")
    private List<LocalidadPciaBuenosAires> localidadPciaBuenosAires;

    public List<LocalidadPciaBuenosAires> getLocalidadPciaBuenosAires() {
        return localidadPciaBuenosAires;
    }

    public void setLocalidadPciaBuenosAires(List<LocalidadPciaBuenosAires> localidadPciaBuenosAires) {
        this.localidadPciaBuenosAires = localidadPciaBuenosAires;
    }

    public Integer getCodigopartido() {
        return codigopartido;
    }

    public void setCodigopartido(Integer codigopartido) {
        this.codigopartido = codigopartido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
