package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "seguimientoestudiosimg")
public class SeguimientoEstudiosImg {
    @EmbeddedId
    private SeguimientoEstudiosImgPK id;
    private String operacion;

    public SeguimientoEstudiosImgPK getId() {
        return id;
    }

    public void setId(SeguimientoEstudiosImgPK id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
