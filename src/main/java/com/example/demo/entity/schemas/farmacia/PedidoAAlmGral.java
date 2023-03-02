package com.api.sisa.entity.schemas.farmacia;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "pedidoaalmgral", schema = "farmacia")
public class PedidoAAlmGral {
    @Id
    @Column(name = "nropedido")
    private Integer nroPedido;
    private Date fecha;
    private Boolean anulado;
    private String observaciones;
    private LocalDateTime hora;
    @OneToMany
    @JoinColumn(name = "codigour", referencedColumnName = "codigour")
    private List<UnidadesRecepcion> unidadesRecepcion;
    public Integer getNroPedido() {
        return nroPedido;
    }

    public void setNroPedido(Integer nroPedido) {
        this.nroPedido = nroPedido;
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

    public List<UnidadesRecepcion> getUnidadesRecepcion() {
        return unidadesRecepcion;
    }

    public void setUnidadesRecepcion(List<UnidadesRecepcion> unidadesRecepcion) {
        this.unidadesRecepcion = unidadesRecepcion;
    }
}
