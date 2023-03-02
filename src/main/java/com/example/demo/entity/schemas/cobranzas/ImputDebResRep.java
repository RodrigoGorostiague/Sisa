package com.example.demo.entity.schemas.cobranzas;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "cobranzas", name = "imput_deb_res_rep")
public class ImputDebResRep {
    @EmbeddedId
    private ImputDebResRepPK id;

    public ImputDebResRepPK getId() {
        return id;
    }

    public void setId(ImputDebResRepPK id) {
        this.id = id;
    }
}
