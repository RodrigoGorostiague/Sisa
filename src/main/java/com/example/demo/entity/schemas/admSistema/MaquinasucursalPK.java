package com.example.demo.entity.schemas.admSistema;

import com.example.demo.entity.schemas.facturacionNew.Sucursal;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

import java.io.Serializable;

@Embeddable
public class MaquinasucursalPK implements Serializable {
    @Column(name = "ipmaquina")
    private String ipMaquina;
    @OneToOne
    @JoinColumn(name = "sucursal", referencedColumnName = "codigo")
    private Sucursal sucursal;
    public String getIpMaquina() {
        return ipMaquina;
    }

    public void setIpMaquina(String ipMaquina) {
        this.ipMaquina = ipMaquina;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
}
