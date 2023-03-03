package com.example.demo.entity.schemas.seguridad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "aplicacion", schema = "seguridad")
public class Aplicacion {
    @Id
    @Column(name = "naplicacion")
    private String nAplicacion;
    @Column(name = "nservidor")
    private String nServidor;
    private String path;

    public String getnAplicacion() {
        return nAplicacion;
    }

    public void setnAplicacion(String nAplicacion) {
        this.nAplicacion = nAplicacion;
    }

    public String getnServidor() {
        return nServidor;
    }

    public void setnServidor(String nServidor) {
        this.nServidor = nServidor;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
