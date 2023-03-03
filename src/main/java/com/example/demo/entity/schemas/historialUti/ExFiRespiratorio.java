package com.example.demo.entity.schemas.historialUti;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "exfirespiratorio", schema = "historialuti")
public class ExFiRespiratorio {
    @Id
    @Column(name = "nrouti")
    private String nroUti;
    private String auscultacion;
    @Column(name = "rxtoraxingr")
    private String rxToraxIngr;
    private String comentarios;

    public String getNroUti() {
        return nroUti;
    }

    public void setNroUti(String nroUti) {
        this.nroUti = nroUti;
    }

    public String getAuscultacion() {
        return auscultacion;
    }

    public void setAuscultacion(String auscultacion) {
        this.auscultacion = auscultacion;
    }

    public String getRxToraxIngr() {
        return rxToraxIngr;
    }

    public void setRxToraxIngr(String rxToraxIngr) {
        this.rxToraxIngr = rxToraxIngr;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
}
