package com.api.sisa.entity.schemas.farmacia;

import com.api.sisa.entity.schemas.paciente.Paciente;
import com.api.sisa.entity.schemas.personal.Personal;
import jakarta.persistence.*;

import java.text.AttributedString;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "receta", schema = "farmacia")
public class Receta {
    @EmbeddedId
    private RecetaPK id;
    @OneToMany
    @JoinColumn(name = "idpaciente",referencedColumnName = "idpaciente")
    private List<Paciente> paciente;
    @Column(name = "fechareceta")
    private Date fechaReceta;
    @OneToMany
    @JoinColumn(name = "profesionalsolicitante", referencedColumnName = "codigoprofesional")
    private List<Personal> profesionalSolicitante;
    @Column(name = "tipoproc")
    private String tipoProc;
    @Column(name = "uatproc")
    private String uatProc;
    @Column(name = "codigoprocedencia")
    private String codigoProcedencia;
    @Column(name = "codigosala")
    private String codigoSala;
    @Column(name = "nromovimiento")
    private String nroMovimiento;
    private String observaciones;
    private String estado;
    private LocalDateTime hora;
    @Column(name = "descuentastock")
    private String descuentaStock;
    @OneToMany
    @JoinColumn(name = "codigour", referencedColumnName = "codigour")
    private List<UnidadesRecepcion> unidadesRecepcion;

    public RecetaPK getId() {
        return id;
    }

    public void setId(RecetaPK id) {
        this.id = id;
    }

    public List<Paciente> getPaciente() {
        return paciente;
    }

    public void setPaciente(List<Paciente> paciente) {
        this.paciente = paciente;
    }

    public Date getFechaReceta() {
        return fechaReceta;
    }

    public void setFechaReceta(Date fechaReceta) {
        this.fechaReceta = fechaReceta;
    }

    public List<Personal> getProfesionalSolicitante() {
        return profesionalSolicitante;
    }

    public void setProfesionalSolicitante(List<Personal> profesionalSolicitante) {
        this.profesionalSolicitante = profesionalSolicitante;
    }

    public String getTipoProc() {
        return tipoProc;
    }

    public void setTipoProc(String tipoProc) {
        this.tipoProc = tipoProc;
    }

    public String getUatProc() {
        return uatProc;
    }

    public void setUatProc(String uatProc) {
        this.uatProc = uatProc;
    }

    public String getCodigoProcedencia() {
        return codigoProcedencia;
    }

    public void setCodigoProcedencia(String codigoProcedencia) {
        this.codigoProcedencia = codigoProcedencia;
    }

    public String getCodigoSala() {
        return codigoSala;
    }

    public void setCodigoSala(String codigoSala) {
        this.codigoSala = codigoSala;
    }

    public String getNroMovimiento() {
        return nroMovimiento;
    }

    public void setNroMovimiento(String nroMovimiento) {
        this.nroMovimiento = nroMovimiento;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }

    public String getDescuentaStock() {
        return descuentaStock;
    }

    public void setDescuentaStock(String descuentaStock) {
        this.descuentaStock = descuentaStock;
    }

    public List<UnidadesRecepcion> getUnidadesRecepcion() {
        return unidadesRecepcion;
    }

    public void setUnidadesRecepcion(List<UnidadesRecepcion> unidadesRecepcion) {
        this.unidadesRecepcion = unidadesRecepcion;
    }
}
