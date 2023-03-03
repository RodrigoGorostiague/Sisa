package com.example.demo.entity.schemas.historialAmbulatorio;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historiaambulatorio", name = "refcontraref")
public class RefContraRef {
    @EmbeddedId
    private RefContraRefPK id;
    private String motivo;
    @Column(name = "derivacionpertinente")
    private String derivacionPertinente;
    @Column(name = "nroconsultacontraref")
    private Integer nroconsultacontraref;
    @Column(name = "referenciacumplimentada")
    private String referenciaCumplimentada;
    @Column(name = "nivelurgencia")
    private String nivelUrgencia;
    @Column(name = "profesionalderivado")
    private String profesionalDerivado;
    private String turno;

    public RefContraRefPK getId() {
        return id;
    }

    public void setId(RefContraRefPK id) {
        this.id = id;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getDerivacionPertinente() {
        return derivacionPertinente;
    }

    public void setDerivacionPertinente(String derivacionPertinente) {
        this.derivacionPertinente = derivacionPertinente;
    }

    public Integer getNroconsultacontraref() {
        return nroconsultacontraref;
    }

    public void setNroconsultacontraref(Integer nroconsultacontraref) {
        this.nroconsultacontraref = nroconsultacontraref;
    }

    public String getReferenciaCumplimentada() {
        return referenciaCumplimentada;
    }

    public void setReferenciaCumplimentada(String referenciaCumplimentada) {
        this.referenciaCumplimentada = referenciaCumplimentada;
    }

    public String getNivelUrgencia() {
        return nivelUrgencia;
    }

    public void setNivelUrgencia(String nivelUrgencia) {
        this.nivelUrgencia = nivelUrgencia;
    }

    public String getProfesionalDerivado() {
        return profesionalDerivado;
    }

    public void setProfesionalDerivado(String profesionalDerivado) {
        this.profesionalDerivado = profesionalDerivado;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
