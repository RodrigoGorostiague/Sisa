package com.example.demo.entity.schemas.servicioSocial;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "institucion", schema = "serviciosocial")
public class InstitucionSCom {
    @Id
    private String codigo;
    private String nombre;
    private String utiliza;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUtiliza() {
        return utiliza;
    }

    public void setUtiliza(String utiliza) {
        this.utiliza = utiliza;
    }
}
