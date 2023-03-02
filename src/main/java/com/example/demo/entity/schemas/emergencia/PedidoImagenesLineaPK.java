package com.example.demo.entity.schemas.emergencia;

import com.example.demo.entity.schemas.nomencladores.PadronImagenes;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Embeddable
public class PedidoImagenesLineaPK implements Serializable {
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "uniat", referencedColumnName = "uniat"),
            @JoinColumn(name = "nrocon", referencedColumnName = "nrocon"),
            @JoinColumn(name = "profesional", referencedColumnName = "profesional")
    })
    private PedidoImagenesCabecera pedidoImagenesCabecera;
    @ManyToOne
    @JoinColumn(name = "codigo", referencedColumnName = "codigopractica")
    private PadronImagenes padronImagenes;

    public PedidoImagenesCabecera getPedidoImagenesCabecera() {
        return pedidoImagenesCabecera;
    }

    public void setPedidoImagenesCabecera(PedidoImagenesCabecera pedidoImagenesCabecera) {
        this.pedidoImagenesCabecera = pedidoImagenesCabecera;
    }

    public PadronImagenes getPadronImagenes() {
        return padronImagenes;
    }

    public void setPadronImagenes(PadronImagenes padronImagenes) {
        this.padronImagenes = padronImagenes;
    }
}
