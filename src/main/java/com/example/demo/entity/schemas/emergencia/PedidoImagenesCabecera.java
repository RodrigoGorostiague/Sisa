package com.example.demo.entity.schemas.emergencia;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(schema = "emergencia", name = "pedidoimagenescabecera")
public class PedidoImagenesCabecera {
     @EmbeddedId
    private PedidoImagenesCabeceraPK id;
    @OneToMany(mappedBy = "id.pedidoImagenesCabecera")
    private List<PedidoImagenesLinea> pedidoImagenesLineas;

    public List<PedidoImagenesLinea> getPedidoImagenesLineas() {
        return pedidoImagenesLineas;
    }

    public void setPedidoImagenesLineas(List<PedidoImagenesLinea> pedidoImagenesLineas) {
        this.pedidoImagenesLineas = pedidoImagenesLineas;
    }

    private String observaciones;

    public PedidoImagenesCabeceraPK getId() {
        return id;
    }

    public void setId(PedidoImagenesCabeceraPK id) {
        this.id = id;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
