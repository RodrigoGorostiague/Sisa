package com.example.demo.entity.schemas.historialAmbulatorioTransfCentroSalud;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class InfImportanteMetaPK implements Serializable{
    private String uniat;
    private String tdoc;
    @Column(name = "nrodoc")
    private String nroDoc;

    public String getUniat() {
        return uniat;
    }

    public void setUniat(String uniat) {
        this.uniat = uniat;
    }

    public String getTdoc() {
        return tdoc;
    }

    public void setTdoc(String tdoc) {
        this.tdoc = tdoc;
    }

    public String getNroDoc() {
        return nroDoc;
    }

    public void setNroDoc(String nroDoc) {
        this.nroDoc = nroDoc;
    }
}
