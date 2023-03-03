package com.example.demo.entity.schemas.historialInternacion;

import com.example.demo.entity.schemas.personal.Personal;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(schema = "historialinternacion", name = "ayudanteparto")
public class AyudaAnteParto {
    @Id
    @ManyToOne
    @JoinColumn(name = "nrointernacion", referencedColumnName = "nrointernacion")
    private Parto parto;
    @ManyToOne
    @JoinColumn(name = "codigopersonal", referencedColumnName = "codigopersonal")
    private Personal personal;

    public Parto getParto() {
        return parto;
    }

    public void setParto(Parto parto) {
        this.parto = parto;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }
}
