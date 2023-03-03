package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "rnparto", schema = "historialinternacion")
public class RnParto {
    @EmbeddedId
    private RnPartoPk id;

    public RnPartoPk getId() {
        return id;
    }

    public void setId(RnPartoPk id) {
        this.id = id;
    }
}
