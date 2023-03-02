package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "documentoadjuntointernacion")
public class DocumentoAdjuntoInternacion {
    @EmbeddedId
    private DocumentoAdjuntoInternacionPK id;

    public DocumentoAdjuntoInternacionPK getId() {
        return id;
    }

    public void setId(DocumentoAdjuntoInternacionPK id) {
        this.id = id;
    }
}
