package com.example.demo.entity.schemas.paciente;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "conexionagua", schema = "paciete")
public class ConexionAgua {
    @Id
    @Column(name = "idconexionagua")
    private String idConexionAgua;
    private String nombre;
    private String descripcion;

    public String getIdConexionAgua() {
        return idConexionAgua;
    }

    public void setIdConexionAgua(String idConexionAgua) {
        this.idConexionAgua = idConexionAgua;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
