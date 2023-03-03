package com.example.demo.entity.schemas.pami;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "beneficio_invalido", schema = "pami_nuevo")
public class BeneficioInvalido {
    @Id
    @Column(name = "idpaciente")
    private Integer idPaciente;
    @Column(name = "id_beneficio")
    private String idBeneficio;
    @Column(name = "verifica_sisa_pami")
    private Boolean verificaSisaPami;
    @Column(name = "anio_exp")
    private Integer anioExp;
    @Column(name = "mes_exp")
    private Integer mesExp;
    private String observaciones;

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getIdBeneficio() {
        return idBeneficio;
    }

    public void setIdBeneficio(String idBeneficio) {
        this.idBeneficio = idBeneficio;
    }

    public Boolean getVerificaSisaPami() {
        return verificaSisaPami;
    }

    public void setVerificaSisaPami(Boolean verificaSisaPami) {
        this.verificaSisaPami = verificaSisaPami;
    }

    public Integer getAnioExp() {
        return anioExp;
    }

    public void setAnioExp(Integer anioExp) {
        this.anioExp = anioExp;
    }

    public Integer getMesExp() {
        return mesExp;
    }

    public void setMesExp(Integer mesExp) {
        this.mesExp = mesExp;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
