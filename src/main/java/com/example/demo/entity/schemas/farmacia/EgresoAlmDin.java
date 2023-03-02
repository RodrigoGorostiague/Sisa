package com.example.demo.entity.schemas.farmacia;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "egresoalmdin", schema = "farmacia")
public class EgresoAlmDin {
    @Id
    @Column(name = "nroegreso")
    private Integer nroEgreso;
    private Date fecha;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "tipodestino", referencedColumnName = "codigo"),
            @JoinColumn(name = "codigour", referencedColumnName = "codigour")
    })
    private TipoDestino tipoDestino;
    @Column(name = "uniatdestino")
    private String uniatDestino;
    @Column(name = "saladestino")
    private String salaDestino;
    @Column(name = "nropedidosala")
    private String nroPedidoSala;
    private Boolean anulado;
    private String observaciones;
    private LocalDateTime hora;
    @ManyToOne
    @JoinColumn(name = "codigour", referencedColumnName = "codigour", insertable=false, updatable=false)
    private UnidadesRecepcion unidadesRecepcion;

    public Integer getNroEgreso() {
        return nroEgreso;
    }

    public void setNroEgreso(Integer nroEgreso) {
        this.nroEgreso = nroEgreso;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public TipoDestino getTipoDestino() {
        return tipoDestino;
    }

    public void setTipoDestino(TipoDestino tipoDestino) {
        this.tipoDestino = tipoDestino;
    }

    public String getUniatDestino() {
        return uniatDestino;
    }

    public void setUniatDestino(String uniatDestino) {
        this.uniatDestino = uniatDestino;
    }

    public String getSalaDestino() {
        return salaDestino;
    }

    public void setSalaDestino(String salaDestino) {
        this.salaDestino = salaDestino;
    }

    public String getNroPedidoSala() {
        return nroPedidoSala;
    }

    public void setNroPedidoSala(String nroPedidoSala) {
        this.nroPedidoSala = nroPedidoSala;
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

    public UnidadesRecepcion getUnidadesRecepcion() {
        return unidadesRecepcion;
    }

    public void setUnidadesRecepcion(UnidadesRecepcion unidadesRecepcion) {
        this.unidadesRecepcion = unidadesRecepcion;
    }
}
