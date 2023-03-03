package com.example.demo.entity.schemas.historialInternacion;

import com.example.demo.entity.schemas.asistencia.PadronServicio;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(schema = "historialintyernacion", name = "textopredefinido")
public class TextoPredefinido {
    @Id
    private String codigo;
    private String descripcion;
    private String texto;
    @ManyToOne
    @JoinColumn(name = "servicio", referencedColumnName = "codigoservicio")
    private PadronServicio padronServicio;

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

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public PadronServicio getPadronServicio() {
        return padronServicio;
    }

    public void setPadronServicio(PadronServicio padronServicio) {
        this.padronServicio = padronServicio;
    }
}
