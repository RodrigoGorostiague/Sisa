package com.example.demo.entity.schemas.laboratorio;

import jakarta.persistence.*;

import java.io.Serializable;

@Embeddable
public class PedidoLaboratorioLineaPK implements Serializable {
    @OneToOne
    @JoinColumns({
            @JoinColumn(name = "uniat", referencedColumnName = "uniat"),
            @JoinColumn(name = "hora", referencedColumnName = "hora"),
            @JoinColumn(name = "fecha", referencedColumnName = "fecha"),
            @JoinColumn(name = "profesional", referencedColumnName = "profesional"),
            @JoinColumn(name = "nroatencion", referencedColumnName = "nroatencion")
    })
    private PedidoLaboratorioCabecera pedidoLaboratorioCabecera;
    @ManyToOne
    @JoinColumn(name = "codigopadron", referencedColumnName = "codigopractica")
    private PadronPracticas padronPracticas;

    public PedidoLaboratorioCabecera getPedidoLaboratorioCabecera() {
        return pedidoLaboratorioCabecera;
    }

    public void setPedidoLaboratorioCabecera(PedidoLaboratorioCabecera pedidoLaboratorioCabecera) {
        this.pedidoLaboratorioCabecera = pedidoLaboratorioCabecera;
    }

    public PadronPracticas getPadronPracticas() {
        return padronPracticas;
    }

    public void setPadronPracticas(PadronPracticas padronPracticas) {
        this.padronPracticas = padronPracticas;
    }
}
