package com.example.demo.entity.schemas.internacion;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "epicrisisformato", schema = "internacion")
public class EpicrisisFormato {
    @EmbeddedId
    private EpicrisisFormatoPK id;
    private Integer formato;
    @Column(name = "imprdiagcie10")
    private String imprDiagCie10;

    public EpicrisisFormatoPK getId() {
        return id;
    }

    public void setId(EpicrisisFormatoPK id) {
        this.id = id;
    }

    public Integer getFormato() {
        return formato;
    }

    public void setFormato(Integer formato) {
        this.formato = formato;
    }

    public String getImprDiagCie10() {
        return imprDiagCie10;
    }

    public void setImprDiagCie10(String imprDiagCie10) {
        this.imprDiagCie10 = imprDiagCie10;
    }
}
