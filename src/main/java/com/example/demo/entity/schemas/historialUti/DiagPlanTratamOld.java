package com.example.demo.entity.schemas.historialUti;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historialuti", name = "diagplantratamold")
public class DiagPlanTratamOld {
    @Id
    @Column(name = "nrouti")
    private String nroUti;
    @Column(name = "diagpresprim")
    private String diagPresPrim;
    @Column(name = "diagpresampl")
    private String diagPresAmpl;
    @Column(name = "planestudio")
    private String planEstudio;
    @Column(name = "tratamientourgencia")
    private String tratamientoUrgencia;
    @Column(name = "potasioserico")
    private Integer potasioSerico;
    @Column(name = "creaserica")
    private Integer creaSerica;
    private Integer hematocrito;
    @Column(name = "sodioserico")
    private Integer sodioSerico;
    private Integer leucocitos;
    private String valcliquir;

    public String getNroUti() {
        return nroUti;
    }

    public void setNroUti(String nroUti) {
        this.nroUti = nroUti;
    }

    public String getDiagPresPrim() {
        return diagPresPrim;
    }

    public void setDiagPresPrim(String diagPresPrim) {
        this.diagPresPrim = diagPresPrim;
    }

    public String getDiagPresAmpl() {
        return diagPresAmpl;
    }

    public void setDiagPresAmpl(String diagPresAmpl) {
        this.diagPresAmpl = diagPresAmpl;
    }

    public String getPlanEstudio() {
        return planEstudio;
    }

    public void setPlanEstudio(String planEstudio) {
        this.planEstudio = planEstudio;
    }

    public String getTratamientoUrgencia() {
        return tratamientoUrgencia;
    }

    public void setTratamientoUrgencia(String tratamientoUrgencia) {
        this.tratamientoUrgencia = tratamientoUrgencia;
    }

    public Integer getPotasioSerico() {
        return potasioSerico;
    }

    public void setPotasioSerico(Integer potasioSerico) {
        this.potasioSerico = potasioSerico;
    }

    public Integer getCreaSerica() {
        return creaSerica;
    }

    public void setCreaSerica(Integer creaSerica) {
        this.creaSerica = creaSerica;
    }

    public Integer getHematocrito() {
        return hematocrito;
    }

    public void setHematocrito(Integer hematocrito) {
        this.hematocrito = hematocrito;
    }

    public Integer getSodioSerico() {
        return sodioSerico;
    }

    public void setSodioSerico(Integer sodioSerico) {
        this.sodioSerico = sodioSerico;
    }

    public Integer getLeucocitos() {
        return leucocitos;
    }

    public void setLeucocitos(Integer leucocitos) {
        this.leucocitos = leucocitos;
    }

    public String getValcliquir() {
        return valcliquir;
    }

    public void setValcliquir(String valcliquir) {
        this.valcliquir = valcliquir;
    }
}
