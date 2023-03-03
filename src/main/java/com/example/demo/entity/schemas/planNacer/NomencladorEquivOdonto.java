package com.example.demo.entity.schemas.planNacer;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "nomencladorequivodonto", schema = "plannacer")
public class NomencladorEquivOdonto {
    @EmbeddedId
    private NomencladorEquivOdontoPK id;
    private String descripcion;
    private Boolean neonato;
    private Boolean ninos0a5;
    private Boolean ninos6a9;
    private Boolean adolescentes10a19;
    private Boolean mujeres20a64;
    private Boolean embarazadas;

    public NomencladorEquivOdontoPK getId() {
        return id;
    }

    public void setId(NomencladorEquivOdontoPK id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getNeonato() {
        return neonato;
    }

    public void setNeonato(Boolean neonato) {
        this.neonato = neonato;
    }

    public Boolean getNinos0a5() {
        return ninos0a5;
    }

    public void setNinos0a5(Boolean ninos0a5) {
        this.ninos0a5 = ninos0a5;
    }

    public Boolean getNinos6a9() {
        return ninos6a9;
    }

    public void setNinos6a9(Boolean ninos6a9) {
        this.ninos6a9 = ninos6a9;
    }

    public Boolean getAdolescentes10a19() {
        return adolescentes10a19;
    }

    public void setAdolescentes10a19(Boolean adolescentes10a19) {
        this.adolescentes10a19 = adolescentes10a19;
    }

    public Boolean getMujeres20a64() {
        return mujeres20a64;
    }

    public void setMujeres20a64(Boolean mujeres20a64) {
        this.mujeres20a64 = mujeres20a64;
    }

    public Boolean getEmbarazadas() {
        return embarazadas;
    }

    public void setEmbarazadas(Boolean embarazadas) {
        this.embarazadas = embarazadas;
    }
}
