package com.example.demo.entity.schemas.historialAmbulatorio;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Embeddable
public class AtEnfermeriaLineasPK implements Serializable {
    @Column(name = "codigonic")
    private String codigoNic;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name="idpaciente", referencedColumnName="idpaciente"),
            @JoinColumn(name="fecha", referencedColumnName="fecha"),
            @JoinColumn(name="hora", referencedColumnName="hora")})
    private AtEnfermeriaCabecera atencionEnfermeriaCabecera;

    public AtEnfermeriaCabecera getAtencionEnfermeriaCabecera() {
        return atencionEnfermeriaCabecera;
    }

    public void setAtencionEnfermeriaCabecera(AtEnfermeriaCabecera atencionEnfermeriaCabecera) {
        this.atencionEnfermeriaCabecera = atencionEnfermeriaCabecera;
    }

    public String getCodigoNic() {
        return codigoNic;
    }

    public void setCodigoNic(String codigoNic) {
        this.codigoNic = codigoNic;
    }
}
