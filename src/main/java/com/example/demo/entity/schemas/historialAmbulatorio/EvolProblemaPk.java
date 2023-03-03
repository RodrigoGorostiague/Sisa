package com.example.demo.entity.schemas.historialAmbulatorio;

import com.example.demo.entity.schemas.nomencladores.NomencladorCiap2;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

@Embeddable
public class EvolProblemaPk implements Serializable {
    @ManyToOne
    @JoinColumn(name = "nroconsulta", referencedColumnName = "nroconsulta")
    private ConsultaTurno consultaTurno;
    @Column(name = "problemaanterior")
    private String problemaAnterior;
    @ManyToOne
    @JoinColumn(name = "codigociap2", referencedColumnName = "codigo")
    private NomencladorCiap2 nomencladorCiap2;

    public ConsultaTurno getConsultaTurno() {
        return consultaTurno;
    }

    public void setConsultaTurno(ConsultaTurno consultaTurno) {
        this.consultaTurno = consultaTurno;
    }

    public String getProblemaAnterior() {
        return problemaAnterior;
    }

    public void setProblemaAnterior(String problemaAnterior) {
        this.problemaAnterior = problemaAnterior;
    }

    public NomencladorCiap2 getNomencladorCiap2() {
        return nomencladorCiap2;
    }

    public void setNomencladorCiap2(NomencladorCiap2 nomencladorCiap2) {
        this.nomencladorCiap2 = nomencladorCiap2;
    }
}
