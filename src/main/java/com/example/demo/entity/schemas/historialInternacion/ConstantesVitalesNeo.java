package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historialinternacion", name = "constantesvitalesneo")
public class ConstantesVitalesNeo {
    @EmbeddedId
    private ConstantesVitalesNeoPK id;
    @Column(name = "estadogeneral")
    private String estadoGeneral;
    private String coloracion;
    private Boolean reactivo;
    private Integer ingresos;
    private Integer egresos;
    @Column(name = "ritmodiuretico")
    private Integer ritmoDiuretico;
    @Column(name = "necesidadesbasales")
    private Integer necesidadesBasales;
    private Boolean catarsis;

    public ConstantesVitalesNeoPK getId() {
        return id;
    }

    public void setId(ConstantesVitalesNeoPK id) {
        this.id = id;
    }

    public String getEstadoGeneral() {
        return estadoGeneral;
    }

    public void setEstadoGeneral(String estadoGeneral) {
        this.estadoGeneral = estadoGeneral;
    }

    public String getColoracion() {
        return coloracion;
    }

    public void setColoracion(String coloracion) {
        this.coloracion = coloracion;
    }

    public Boolean getReactivo() {
        return reactivo;
    }

    public void setReactivo(Boolean reactivo) {
        this.reactivo = reactivo;
    }

    public Integer getIngresos() {
        return ingresos;
    }

    public void setIngresos(Integer ingresos) {
        this.ingresos = ingresos;
    }

    public Integer getEgresos() {
        return egresos;
    }

    public void setEgresos(Integer egresos) {
        this.egresos = egresos;
    }

    public Integer getRitmoDiuretico() {
        return ritmoDiuretico;
    }

    public void setRitmoDiuretico(Integer ritmoDiuretico) {
        this.ritmoDiuretico = ritmoDiuretico;
    }

    public Integer getNecesidadesBasales() {
        return necesidadesBasales;
    }

    public void setNecesidadesBasales(Integer necesidadesBasales) {
        this.necesidadesBasales = necesidadesBasales;
    }

    public Boolean getCatarsis() {
        return catarsis;
    }

    public void setCatarsis(Boolean catarsis) {
        this.catarsis = catarsis;
    }
}
