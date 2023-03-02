package com.example.demo.entity.schemas.domicilio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "domicilio", name = "domplannacer")
public class DomPlanNacer {
    @Id
    private String ud;
    @Column(name = "nombreyap")
    private String nombreApellido;
    @Column(name = "fechanac")
    private String fechaNac;

    public String getUd() {
        return ud;
    }

    public void setUd(String ud) {
        this.ud = ud;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }
}
