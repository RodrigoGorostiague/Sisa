package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "examenfisicoutiinf", schema = "historialinternacion")
public class ExamenFisicoUtiInf {
    @EmbeddedId
    private ExamenFisicoUtiInfPK id;
    @Column(name = "glasgowocular_neuro")
    private Integer glasgowOcularneuro;
    @Column(name = "glasgowverbal_neuro")
    private Integer glasgowVerbalNeuro;
    @Column(name = "glasgowmotor_neuro")
    private Integer glasgowMotorNeuro;

    public Integer getGlasgowOcularneuro() {
        return glasgowOcularneuro;
    }

    public void setGlasgowOcularneuro(Integer glasgowOcularneuro) {
        this.glasgowOcularneuro = glasgowOcularneuro;
    }

    public Integer getGlasgowVerbalNeuro() {
        return glasgowVerbalNeuro;
    }

    public void setGlasgowVerbalNeuro(Integer glasgowVerbalNeuro) {
        this.glasgowVerbalNeuro = glasgowVerbalNeuro;
    }

    public Integer getGlasgowMotorNeuro() {
        return glasgowMotorNeuro;
    }

    public void setGlasgowMotorNeuro(Integer glasgowMotorNeuro) {
        this.glasgowMotorNeuro = glasgowMotorNeuro;
    }

    public ExamenFisicoUtiInfPK getId() {
        return id;
    }

    public void setId(ExamenFisicoUtiInfPK id) {
        this.id = id;
    }
}
