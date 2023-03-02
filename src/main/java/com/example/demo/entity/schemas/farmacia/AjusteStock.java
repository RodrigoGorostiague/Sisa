package com.example.demo.entity.schemas.farmacia;

import jakarta.persistence.*;

import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Table(name = "ajustestock", schema = "farmacia")
public class AjusteStock {
    @Id
    @Column(name = "nroajuste")
    private Integer nroAjuste;
    private Date fecha;
    private Boolean anulado;
    private String motivo;
    private String observaciones;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "clase", referencedColumnName = "codigoclase"),
            @JoinColumn(name = "item", referencedColumnName = "item")
    })
    private Item item;
    private Integer cantidad;
    private String tipo;
    private LocalDateTime hora;
    @ManyToOne
    @JoinColumn(name = "codigour", referencedColumnName = "codigour")
    private UnidadesRecepcion unidadesRecepcion;

    public Integer getNroAjuste() {
        return nroAjuste;
    }

    public void setNroAjuste(Integer nroAjuste) {
        this.nroAjuste = nroAjuste;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Boolean getAnulado() {
        return anulado;
    }

    public void setAnulado(Boolean anulado) {
        this.anulado = anulado;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }

    public UnidadesRecepcion getUnidadesRecepcion() {
        return unidadesRecepcion;
    }

    public void setUnidadesRecepcion(UnidadesRecepcion unidadesRecepcion) {
        this.unidadesRecepcion = unidadesRecepcion;
    }
}
