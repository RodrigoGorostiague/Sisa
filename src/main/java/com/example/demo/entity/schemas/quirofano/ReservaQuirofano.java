package com.example.demo.entity.schemas.quirofano;

import com.example.demo.entity.schemas.historialInternacion.ProcedenciaPac;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "reservaquirofano", schema = "quirofano")
public class ReservaQuirofano {
    @EmbeddedId
    private ReservaQuirofanoPK id;
    private LocalDateTime hora;
    private String diagnostico;
    private Integer anestesia;
    private String observaciones;
    private String titular;
    private String ayudante1;
    private String ayudante2;
    private String ayudante3;
    private String ayudante4;
    @Column(name = "nroorden")
    private String nroOrden;
    @Column(name = "codigouniat")
    private String codigoUniat;
    private String suspendida;
    private String obsersuspension;
    @Column(name = "duracionestimada")
    private LocalDateTime duracionEstimada;
    @ManyToOne
    @JoinColumn(name = "codigoprocedencia", referencedColumnName = "codigo")
    private ProcedenciaPac procedenciaPac;
    @Column(name = "tipoprocedencia")
    private String tipoProcedencia;
    @Column(name = "uniatprocedencia")
    private String uniatProcedencia;

    public ReservaQuirofanoPK getId() {
        return id;
    }

    public void setId(ReservaQuirofanoPK id) {
        this.id = id;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Integer getAnestesia() {
        return anestesia;
    }

    public void setAnestesia(Integer anestesia) {
        this.anestesia = anestesia;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getAyudante1() {
        return ayudante1;
    }

    public void setAyudante1(String ayudante1) {
        this.ayudante1 = ayudante1;
    }

    public String getAyudante2() {
        return ayudante2;
    }

    public void setAyudante2(String ayudante2) {
        this.ayudante2 = ayudante2;
    }

    public String getAyudante3() {
        return ayudante3;
    }

    public void setAyudante3(String ayudante3) {
        this.ayudante3 = ayudante3;
    }

    public String getAyudante4() {
        return ayudante4;
    }

    public void setAyudante4(String ayudante4) {
        this.ayudante4 = ayudante4;
    }

    public String getNroOrden() {
        return nroOrden;
    }

    public void setNroOrden(String nroOrden) {
        this.nroOrden = nroOrden;
    }

    public String getCodigoUniat() {
        return codigoUniat;
    }

    public void setCodigoUniat(String codigoUniat) {
        this.codigoUniat = codigoUniat;
    }

    public String getSuspendida() {
        return suspendida;
    }

    public void setSuspendida(String suspendida) {
        this.suspendida = suspendida;
    }

    public String getObsersuspension() {
        return obsersuspension;
    }

    public void setObsersuspension(String obsersuspension) {
        this.obsersuspension = obsersuspension;
    }

    public LocalDateTime getDuracionEstimada() {
        return duracionEstimada;
    }

    public void setDuracionEstimada(LocalDateTime duracionEstimada) {
        this.duracionEstimada = duracionEstimada;
    }

    public ProcedenciaPac getProcedenciaPac() {
        return procedenciaPac;
    }

    public void setProcedenciaPac(ProcedenciaPac procedenciaPac) {
        this.procedenciaPac = procedenciaPac;
    }

    public String getTipoProcedencia() {
        return tipoProcedencia;
    }

    public void setTipoProcedencia(String tipoProcedencia) {
        this.tipoProcedencia = tipoProcedencia;
    }

    public String getUniatProcedencia() {
        return uniatProcedencia;
    }

    public void setUniatProcedencia(String uniatProcedencia) {
        this.uniatProcedencia = uniatProcedencia;
    }
}
