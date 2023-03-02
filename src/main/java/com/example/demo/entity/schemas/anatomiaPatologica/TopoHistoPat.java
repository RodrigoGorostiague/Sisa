package com.example.demo.entity.schemas.anatomiaPatologica;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "topohistopat", schema = "anatomiapatologica")
public class TopoHistoPat {
    @EmbeddedId
    private TopoHistoPatPK id;
    private String topografia;
    @Column(name = "desctopografia")
    private String descTopografia;

    public TopoHistoPatPK getId() {
        return id;
    }

    public void setId(TopoHistoPatPK id) {
        this.id = id;
    }

    public String getTopografia() {
        return topografia;
    }

    public void setTopografia(String topografia) {
        this.topografia = topografia;
    }

    public String getDescTopografia() {
        return descTopografia;
    }

    public void setDescTopografia(String descTopografia) {
        this.descTopografia = descTopografia;
    }
}
