package com.api.sisa.entity.schemas.farmacia;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "item_back", schema = "farmacia")
public class itemBack {
    @EmbeddedId
    private itemBackPK id;
    private String denominacion;
    @Column(name = "unimed")
    private String uniMed;
    @Column(name = "costounitario")
    private Integer costoUnitario;
    @Column(name = "stockdinamico")
    private Integer stockDinamico;
    private Boolean baja;
    @Column(name = "vademecumambul")
    private Boolean vademecumAmbul;
    @Column(name = "cantidadstockcritico")
    private Integer cantidadStockCritico;
    @Column(name = "ultpreciovta")
    private Integer ultPrecioVta;
    private Integer tipo;
    private Boolean psicotropico;
    private Boolean seleccionable;
    @Column(name = "solorecetapac")
    private Boolean soloRecetaPac;
    @Column(name = "codigoproducto")
    private Integer codigoProducto;
    @Column(name = "codigopresentacion")
    private Integer codigoPresentacion;
    @Column(name = "cantidadpresentacion")
    private Integer cantidadPresentacion;

    public itemBackPK getId() {
        return id;
    }

    public void setId(itemBackPK id) {
        this.id = id;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getUniMed() {
        return uniMed;
    }

    public void setUniMed(String uniMed) {
        this.uniMed = uniMed;
    }

    public Integer getCostoUnitario() {
        return costoUnitario;
    }

    public void setCostoUnitario(Integer costoUnitario) {
        this.costoUnitario = costoUnitario;
    }

    public Integer getStockDinamico() {
        return stockDinamico;
    }

    public void setStockDinamico(Integer stockDinamico) {
        this.stockDinamico = stockDinamico;
    }

    public Boolean getBaja() {
        return baja;
    }

    public void setBaja(Boolean baja) {
        this.baja = baja;
    }

    public Boolean getVademecumAmbul() {
        return vademecumAmbul;
    }

    public void setVademecumAmbul(Boolean vademecumAmbul) {
        this.vademecumAmbul = vademecumAmbul;
    }

    public Integer getCantidadStockCritico() {
        return cantidadStockCritico;
    }

    public void setCantidadStockCritico(Integer cantidadStockCritico) {
        this.cantidadStockCritico = cantidadStockCritico;
    }

    public Integer getUltPrecioVta() {
        return ultPrecioVta;
    }

    public void setUltPrecioVta(Integer ultPrecioVta) {
        this.ultPrecioVta = ultPrecioVta;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public Boolean getPsicotropico() {
        return psicotropico;
    }

    public void setPsicotropico(Boolean psicotropico) {
        this.psicotropico = psicotropico;
    }

    public Boolean getSeleccionable() {
        return seleccionable;
    }

    public void setSeleccionable(Boolean seleccionable) {
        this.seleccionable = seleccionable;
    }

    public Boolean getSoloRecetaPac() {
        return soloRecetaPac;
    }

    public void setSoloRecetaPac(Boolean soloRecetaPac) {
        this.soloRecetaPac = soloRecetaPac;
    }

    public Integer getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(Integer codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public Integer getCodigoPresentacion() {
        return codigoPresentacion;
    }

    public void setCodigoPresentacion(Integer codigoPresentacion) {
        this.codigoPresentacion = codigoPresentacion;
    }

    public Integer getCantidadPresentacion() {
        return cantidadPresentacion;
    }

    public void setCantidadPresentacion(Integer cantidadPresentacion) {
        this.cantidadPresentacion = cantidadPresentacion;
    }
}
