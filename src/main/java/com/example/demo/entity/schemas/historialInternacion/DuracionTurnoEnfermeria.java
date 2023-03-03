package com.example.demo.entity.schemas.historialInternacion;

import com.example.demo.entity.schemas.asistencia.PadronServicio;
import jakarta.persistence.*;

@Entity
@Table(schema = "historialinternacion", name = "duracionturnoenfermeria")
public class DuracionTurnoEnfermeria {
    @Id
    // TODO: 24/2/23 preguntar relaciones
    @OneToOne
    @JoinColumn(name = "codigoservicio", referencedColumnName = "codigoservicio")
    private PadronServicio padronServicio;
    private Integer duracion;

    public PadronServicio getPadronServicio() {
        return padronServicio;
    }

    public void setPadronServicio(PadronServicio padronServicio) {
        this.padronServicio = padronServicio;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }
}
