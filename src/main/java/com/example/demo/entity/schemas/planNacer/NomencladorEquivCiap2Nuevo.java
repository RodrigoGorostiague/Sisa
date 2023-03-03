package com.example.demo.entity.schemas.planNacer;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "nomencladorequivciap2_nuevo", schema = "plannacer")
public class NomencladorEquivCiap2Nuevo {
    @EmbeddedId
    private NomencladorEquivCiap2NuevoPK id;
    private String descripcion;
    private Boolean neonato;
    private Boolean ninos0a5;
    private Boolean ninos6a9;
    @Column(name = "adolescentes10a19")
    private Boolean adolescentes10a19;
    @Column(name = "mujeres20a64")
    private Boolean mujeres20a64;
    private Boolean embarazadas;

    public NomencladorEquivCiap2NuevoPK getId() {
        return id;
    }

    public void setId(NomencladorEquivCiap2NuevoPK id) {
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
