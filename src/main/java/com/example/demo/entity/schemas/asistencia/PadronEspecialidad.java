package com.example.demo.entity.schemas.asistencia;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "asistencia", name = "padronespecialidad")
public class PadronEspecialidad {
    @Id
    @Column(name = "codigoespecialidad")
    private Integer codigoEspecialidad;
    private String nombre;
    @Column(name = "nombrecorto")
    private String nombreCorto;
    @Column(name = "codigooms")
    private Integer codigoOMS;
    @Column(name = "codigoanexo2")
    private Integer codigoAneco;
    private String tipo;
    @Column(name = "emiteplanilla")
    private String emitePlanilla;
    @Column(name = "codigoomsaps")
    private Integer codigoOmsAps;
    private String principal;
    @Column(name = "codigoespecialidadpadre")
    private Integer codigoEspecialidadPadre;
    private String habilitado;
    @Column(name = "evolucionainternacion")
    private Boolean evolucionaInternacion;

    public Integer getCodigoEspecialidad() {
        return codigoEspecialidad;
    }

    public void setCodigoEspecialidad(Integer codigoEspecialidad) {
        this.codigoEspecialidad = codigoEspecialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreCorto() {
        return nombreCorto;
    }

    public void setNombreCorto(String nombreCorto) {
        this.nombreCorto = nombreCorto;
    }

    public Integer getCodigoOMS() {
        return codigoOMS;
    }

    public void setCodigoOMS(Integer codigoOMS) {
        this.codigoOMS = codigoOMS;
    }

    public Integer getCodigoAneco() {
        return codigoAneco;
    }

    public void setCodigoAneco(Integer codigoAneco) {
        this.codigoAneco = codigoAneco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEmitePlanilla() {
        return emitePlanilla;
    }

    public void setEmitePlanilla(String emitePlanilla) {
        this.emitePlanilla = emitePlanilla;
    }

    public Integer getCodigoOmsAps() {
        return codigoOmsAps;
    }

    public void setCodigoOmsAps(Integer codigoOmsAps) {
        this.codigoOmsAps = codigoOmsAps;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public Integer getCodigoEspecialidadPadre() {
        return codigoEspecialidadPadre;
    }

    public void setCodigoEspecialidadPadre(Integer codigoEspecialidadPadre) {
        this.codigoEspecialidadPadre = codigoEspecialidadPadre;
    }

    public String getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(String habilitado) {
        this.habilitado = habilitado;
    }

    public Boolean getEvolucionaInternacion() {
        return evolucionaInternacion;
    }

    public void setEvolucionaInternacion(Boolean evolucionaInternacion) {
        this.evolucionaInternacion = evolucionaInternacion;
    }
}
