package com.example.demo.entity.schemas.emergencia;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Embeddable
public class TriageHallazgoNivelPK implements Serializable {
    @ManyToOne
    @JoinColumn(name = "idsintoma", referencedColumnName = "id")
    private TriageSintomas triageSintomas;
    @ManyToOne
    @JoinColumn(name = "idhallazgo", referencedColumnName = "id")
    private TriageHallazgo triageHallazgo;

    public TriageSintomas getTriageSintomas() {
        return triageSintomas;
    }
    public void setTriageSintomas(TriageSintomas triageSintomas) {
        this.triageSintomas = triageSintomas;
    }
    public TriageHallazgo getTriageHallazgo() {
        return triageHallazgo;
    }
    public void setTriageHallazgo(TriageHallazgo triageHallazgo) {
        this.triageHallazgo = triageHallazgo;
    }
}
