package com.example.demo.entity.schemas.emergencia;

import com.example.demo.entity.schemas.nomencladores.NomencladorEnfermedadesCie10;
import jakarta.persistence.*;

@Entity
@Table(schema = "emergencia", name = "internaciontransitoria")
public class InternacionTransitoria {
    @EmbeddedId
    private InternacionTransitoriaPK id;
    private String motivo;
    private String evolucion;
    private String plan;
    @ManyToOne
    @JoinColumn(name = "diaegreso", referencedColumnName = "codigo")
    private NomencladorEnfermedadesCie10 nomencladorEnfermedadesCie10;

    public InternacionTransitoriaPK getId() {
        return id;
    }

    public void setId(InternacionTransitoriaPK id) {
        this.id = id;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getEvolucion() {
        return evolucion;
    }

    public void setEvolucion(String evolucion) {
        this.evolucion = evolucion;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public NomencladorEnfermedadesCie10 getNomencladorEnfermedadesCie10() {
        return nomencladorEnfermedadesCie10;
    }

    public void setNomencladorEnfermedadesCie10(NomencladorEnfermedadesCie10 nomencladorEnfermedadesCie10) {
        this.nomencladorEnfermedadesCie10 = nomencladorEnfermedadesCie10;
    }
}
