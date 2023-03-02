package com.example.demo.entity.schemas.emergencia;

import com.example.demo.entity.schemas.asistencia.PadronEspecialidad;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "padronespinterconsulta", schema = "emergencia")
public class PadronEspInterconsulta {
    @Id
    @OneToMany
    @JoinColumn(name = "especialidad", referencedColumnName = "codigoespecialidad")
    private List<PadronEspecialidad> id;

    public List<PadronEspecialidad> getId() {
        return id;
    }

    public void setId(List<PadronEspecialidad> id) {
        this.id = id;
    }
}
