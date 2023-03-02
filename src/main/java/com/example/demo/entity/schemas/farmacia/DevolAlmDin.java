package com.api.sisa.entity.schemas.farmacia;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "devolalmdin", schema = "farmacia")
public class DevolAlmDin {
    @Id
    @Column(name = "nrodevol")
    private Integer nroDevol;
    private Date fecha;
    @Column(name = "codigouniat")
    private String codigoUniat;
    @Column(name = "codigosala")
    private String codigoSala;
    private Boolean anulado;
    private String observaciones;
    private LocalDateTime hora;
    @OneToMany
    @JoinColumns({
            @JoinColumn(name = "tipodestino", referencedColumnName = "codigo"),
            @JoinColumn(name = "codigour", referencedColumnName = "codigour")
    })
    private List<TipoDestino> tipoDestino;
    @OneToMany
    @JoinColumn(name = "codigour", referencedColumnName = "codigour")
    private List<UnidadesRecepcion> unidadesRecepcion;

    public Integer getNroDevol() {
        return nroDevol;
    }

    public void setNroDevol(Integer nroDevol) {
        this.nroDevol = nroDevol;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCodigoUniat() {
        return codigoUniat;
    }

    public void setCodigoUniat(String codigoUniat) {
        this.codigoUniat = codigoUniat;
    }

    public String getCodigoSala() {
        return codigoSala;
    }

    public void setCodigoSala(String codigoSala) {
        this.codigoSala = codigoSala;
    }

    public Boolean getAnulado() {
        return anulado;
    }

    public void setAnulado(Boolean anulado) {
        this.anulado = anulado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }

    public List<TipoDestino> getTipoDestino() {
        return tipoDestino;
    }

    public void setTipoDestino(List<TipoDestino> tipoDestino) {
        this.tipoDestino = tipoDestino;
    }

    public List<UnidadesRecepcion> getUnidadesRecepcion() {
        return unidadesRecepcion;
    }

    public void setUnidadesRecepcion(List<UnidadesRecepcion> unidadesRecepcion) {
        this.unidadesRecepcion = unidadesRecepcion;
    }
}
