package com.example.demo.entity.schemas.anatomiaPatologica;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "anatomiapatologica", name = "tmphistopat")
public class TmpHistopat {
    @EmbeddedId
    private TmpHistopatPK id;

    public TmpHistopatPK getId() {
        return id;
    }

    public void setId(TmpHistopatPK id) {
        this.id = id;
    }
}
