package com.example.demo.entity.schemas.domicilio;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(schema = "domicilio", name = "zonastandil")
public class ZonasTandil {
    @Id
    @Column(name = "codigozona")
    private String codigoZona;
    private String domicilio;
    @Column(name = "descbreve")
    private String descBreve;
    @OneToMany(mappedBy = "id.zonasTandil")
    private List<CalleZona> calleZonas;

    public List<CalleZona> getCalleZonas() {
        return calleZonas;
    }

    public void setCalleZonas(List<CalleZona> calleZonas) {
        this.calleZonas = calleZonas;
    }

    public String getCodigoZona() {
        return codigoZona;
    }

    public void setCodigoZona(String codigoZona) {
        this.codigoZona = codigoZona;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getDescBreve() {
        return descBreve;
    }

    public void setDescBreve(String descBreve) {
        this.descBreve = descBreve;
    }
}
