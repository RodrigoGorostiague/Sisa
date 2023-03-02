package com.example.demo.entity.schemas.emergencia;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(schema = "emergencia", name = "consumofarcabecera")
public class ConsumoFarCabecera {
    @EmbeddedId
    private ConsumoFarCabeceraPK id;
    private String observaciones;
    @OneToMany(mappedBy = "id.consumoFarCabecera")
    private List<ConsumoFarLinea> consumoFarLineas;

    public List<ConsumoFarLinea> getConsumoFarLineas() {
        return consumoFarLineas;
    }

    public void setConsumoFarLineas(List<ConsumoFarLinea> consumoFarLineas) {
        this.consumoFarLineas = consumoFarLineas;
    }

    public ConsumoFarCabeceraPK getId() {
        return id;
    }

    public void setId(ConsumoFarCabeceraPK id) {
        this.id = id;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
