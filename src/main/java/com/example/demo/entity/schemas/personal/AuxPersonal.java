package com.example.demo.entity.schemas.personal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "aux_personal", schema = "personal")
public class AuxPersonal {
    @Id
    @Column(name = "codigopersonal")
    private String codigoPersonal;
    @Column(name = "numeroidentificatorio")
    private Integer numeroIdentificatorio;
    @Column(name = "tipo_doc")
    private String tipoDoc;
    @Column(name = "nro_doc")
    private Integer nroDoc;
    private String calle;
    private String nro;

    public String getCodigoPersonal() {
        return codigoPersonal;
    }

    public void setCodigoPersonal(String codigoPersonal) {
        this.codigoPersonal = codigoPersonal;
    }

    public Integer getNumeroIdentificatorio() {
        return numeroIdentificatorio;
    }

    public void setNumeroIdentificatorio(Integer numeroIdentificatorio) {
        this.numeroIdentificatorio = numeroIdentificatorio;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public Integer getNroDoc() {
        return nroDoc;
    }

    public void setNroDoc(Integer nroDoc) {
        this.nroDoc = nroDoc;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }
}
