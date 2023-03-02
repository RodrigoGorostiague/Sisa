package com.example.demo.entity.schemas.farmacia;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

import java.io.Serializable;

@Embeddable
public class LineaPedidoAAlmGralPK implements Serializable {
    @OneToOne
    @JoinColumn(name = "nropedido", referencedColumnName = "nropedido")
    private PedidoAAlmGral pedidoAAlmGral;
    @Column(name = "nrolinea")
    private Integer nroLinea;

    public PedidoAAlmGral getPedidoAAlmGral() {
        return pedidoAAlmGral;
    }

    public void setPedidoAAlmGral(PedidoAAlmGral pedidoAAlmGral) {
        this.pedidoAAlmGral = pedidoAAlmGral;
    }

    public Integer getNroLinea() {
        return nroLinea;
    }

    public void setNroLinea(Integer nroLinea) {
        this.nroLinea = nroLinea;
    }
}
