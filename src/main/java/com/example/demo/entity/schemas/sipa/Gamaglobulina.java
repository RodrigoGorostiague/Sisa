package com.example.demo.entity.schemas.sipa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "gamaglobulina", schema = "sipa")
public class Gamaglobulina {
    @Id
    private String coddigo;
    private String descr;

    public String getCoddigo() {
        return coddigo;
    }

    public void setCoddigo(String coddigo) {
        this.coddigo = coddigo;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }
}
