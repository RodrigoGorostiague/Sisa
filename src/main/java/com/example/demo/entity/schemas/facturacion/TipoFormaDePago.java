package com.example.demo.entity.schemas.facturacion;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipoformadepago", schema = "facturacion")
public class TipoFormaDePago {
    @Id
    @Column(name = "idtipoformadepago")
    private Integer idTipoFormaDePago;

    public Integer getIdTipoFormaDePago() {
        return idTipoFormaDePago;
    }

    public void setIdTipoFormaDePago(Integer idTipoFormaDePago) {
        this.idTipoFormaDePago = idTipoFormaDePago;
    }
}
