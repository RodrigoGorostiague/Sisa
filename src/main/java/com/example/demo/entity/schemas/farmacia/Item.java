package com.example.demo.entity.schemas.farmacia;

import com.example.demo.entity.schemas.farmaciaKairos.PrecioPorProducto;
import jakarta.persistence.*;

@Entity
@Table(name = "item", schema = "farmacia")
public class Item {
    @EmbeddedId
    private ItemPK id;
    private String denominacion;
    @ManyToOne
    @JoinColumn(name = "unimed", referencedColumnName = "codigounimed")
    private UnidadMedida unidadMedida;
    @Column(name = "costounitario")
    private Integer costoUnitario;
    private Boolean baja;
    @Column(name = "vademecumambul")
    private Boolean vademecumAmbul;
    @Column(name = "ultpreciovta")
    private Integer ultPrecioVta;
    @ManyToOne
    @JoinColumn(name = "tipo", referencedColumnName = "codigo")
    private TipoItem tipoItem;
    private Boolean psicotropico;
    private Boolean seleccionable;
    @Column(name = "solorecetapac")
    private Boolean soloRecetaPac;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "codigopresentacion", referencedColumnName = "codigopresentacion"),
            @JoinColumn(name = "codigoproducto", referencedColumnName = "codigoproducto")
    })
    private PrecioPorProducto precioPorProducto;
    @Column(name = "cantidadpresentacion")
    private Integer cantidadPresentacion;
    @Column(name = "ultpreciovta_2")
    private Integer ultPrecioVta2;
    @Column(name = "ultpreciovta_ori")
    private Integer ultPrecioVtaOri;
    @Column(name = "escomprimido")
    private String esComprimido;
    @Column(name = "essuero")
    private String esSuero;
    @Column(name = "vademecumemehrs")
    private Boolean vademecumEmeHrs;
    @Column(name = "vademecumemedbv")
    private Boolean vademecumEmeDbv;
    @Column(name = "descart_emehrs")
    private Boolean descartEmeHrs;
    private String endovenoso;
    @Column(name = "vademecumaps")
    private Boolean vademecumAps;

    public ItemPK getId() {
        return id;
    }

    public void setId(ItemPK id) {
        this.id = id;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public UnidadMedida getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public Integer getCostoUnitario() {
        return costoUnitario;
    }

    public void setCostoUnitario(Integer costoUnitario) {
        this.costoUnitario = costoUnitario;
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

    public Integer getUltPrecioVta() {
        return ultPrecioVta;
    }

    public void setUltPrecioVta(Integer ultPrecioVta) {
        this.ultPrecioVta = ultPrecioVta;
    }

    public TipoItem getTipoItem() {
        return tipoItem;
    }

    public void setTipoItem(TipoItem tipoItem) {
        this.tipoItem = tipoItem;
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

    public PrecioPorProducto getPrecioPorProducto() {
        return precioPorProducto;
    }

    public void setPrecioPorProducto(PrecioPorProducto precioPorProducto) {
        this.precioPorProducto = precioPorProducto;
    }

    public Integer getCantidadPresentacion() {
        return cantidadPresentacion;
    }

    public void setCantidadPresentacion(Integer cantidadPresentacion) {
        this.cantidadPresentacion = cantidadPresentacion;
    }

    public Integer getUltPrecioVta2() {
        return ultPrecioVta2;
    }

    public void setUltPrecioVta2(Integer ultPrecioVta2) {
        this.ultPrecioVta2 = ultPrecioVta2;
    }

    public Integer getUltPrecioVtaOri() {
        return ultPrecioVtaOri;
    }

    public void setUltPrecioVtaOri(Integer ultPrecioVtaOri) {
        this.ultPrecioVtaOri = ultPrecioVtaOri;
    }

    public String getEsComprimido() {
        return esComprimido;
    }

    public void setEsComprimido(String esComprimido) {
        this.esComprimido = esComprimido;
    }

    public String getEsSuero() {
        return esSuero;
    }

    public void setEsSuero(String esSuero) {
        this.esSuero = esSuero;
    }

    public Boolean getVademecumEmeHrs() {
        return vademecumEmeHrs;
    }

    public void setVademecumEmeHrs(Boolean vademecumEmeHrs) {
        this.vademecumEmeHrs = vademecumEmeHrs;
    }

    public Boolean getVademecumEmeDbv() {
        return vademecumEmeDbv;
    }

    public void setVademecumEmeDbv(Boolean vademecumEmeDbv) {
        this.vademecumEmeDbv = vademecumEmeDbv;
    }

    public Boolean getDescartEmeHrs() {
        return descartEmeHrs;
    }

    public void setDescartEmeHrs(Boolean descartEmeHrs) {
        this.descartEmeHrs = descartEmeHrs;
    }

    public String getEndovenoso() {
        return endovenoso;
    }

    public void setEndovenoso(String endovenoso) {
        this.endovenoso = endovenoso;
    }

    public Boolean getVademecumAps() {
        return vademecumAps;
    }

    public void setVademecumAps(Boolean vademecumAps) {
        this.vademecumAps = vademecumAps;
    }
}
