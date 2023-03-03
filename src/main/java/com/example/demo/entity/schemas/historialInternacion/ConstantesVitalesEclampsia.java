package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity

@Table(schema = "historialinternacion", name = "constantesvitaleseclampsia")
public class ConstantesVitalesEclampsia {
    @EmbeddedId
    private ConstantesVitalesEclampsiaPk id;
    private Integer diuresis;
    private String reflejos;
    @Column(name = "latidoscardiacos_fetales")
    private Integer latidosCardiacosFetales;

    public ConstantesVitalesEclampsiaPk getId() {
        return id;
    }

    public void setId(ConstantesVitalesEclampsiaPk id) {
        this.id = id;
    }

    public Integer getDiuresis() {
        return diuresis;
    }

    public void setDiuresis(Integer diuresis) {
        this.diuresis = diuresis;
    }

    public String getReflejos() {
        return reflejos;
    }

    public void setReflejos(String reflejos) {
        this.reflejos = reflejos;
    }

    public Integer getLatidosCardiacosFetales() {
        return latidosCardiacosFetales;
    }

    public void setLatidosCardiacosFetales(Integer latidosCardiacosFetales) {
        this.latidosCardiacosFetales = latidosCardiacosFetales;
    }
}
