package com.example.demo.entity.schemas.paciente;

import com.example.demo.entity.schemas.organizacion.UnidadAtencion;
import com.example.demo.entity.schemas.personal.Personal;
import jakarta.persistence.*;

@Entity
@Table(name = "consultaviolencia", schema = "paciente")
public class ConsultaViolencia {
    @EmbeddedId
    private ConsultaViolenciaPK id;
    @ManyToOne
    @JoinColumn(name = "codigouniat", referencedColumnName = "codigouniat")
    private UnidadAtencion unidadAtencion;
    @Column(name = "apynoconsultante")
    private String apellidoNombreConsultante;
    @Column(name = "domicilioconsultante")
    private String domicilioConsultante;
    @Column(name = "telefonoconsultante")
    private String telefonoConsultante;
    @Column(name = "areareceptora")
    private String areaReceptora;
    @OneToOne
    @JoinColumn(name = "motivoconsulta", referencedColumnName = "codigo")
    private MotivoConsultaViolencia motivoConsultaViolencia;
    @Column(name = "motivoconsultadetalle")
    private String motivoConsultaDetalle;
    @ManyToOne
    @JoinColumn(name = "vinculoagresor", referencedColumnName = "codigo")
    private VinculoAgresor vinculoAgresor;
    @Column(name = "vinculoagresordetalle")
    private String vinculoAgresorDetalle;
    @Column(name = "convive")
    private String conVive;
    @ManyToOne
    @JoinColumn(name = "lavictima", referencedColumnName = "codigo")
    private LaVictima laVictima;
    @Column(name = "lavictimadetalle")
    private String laVictimaDetalle;
    private String observaciones;
    @ManyToOne
    @JoinColumn(name = "codigoprofesional", referencedColumnName = "codigopersonal")
    private Personal personal;

    public ConsultaViolenciaPK getId() {
        return id;
    }

    public void setId(ConsultaViolenciaPK id) {
        this.id = id;
    }

    public UnidadAtencion getUnidadAtencion() {
        return unidadAtencion;
    }

    public void setUnidadAtencion(UnidadAtencion unidadAtencion) {
        this.unidadAtencion = unidadAtencion;
    }

    public String getApellidoNombreConsultante() {
        return apellidoNombreConsultante;
    }

    public void setApellidoNombreConsultante(String apellidoNombreConsultante) {
        this.apellidoNombreConsultante = apellidoNombreConsultante;
    }

    public String getDomicilioConsultante() {
        return domicilioConsultante;
    }

    public void setDomicilioConsultante(String domicilioConsultante) {
        this.domicilioConsultante = domicilioConsultante;
    }

    public String getTelefonoConsultante() {
        return telefonoConsultante;
    }

    public void setTelefonoConsultante(String telefonoConsultante) {
        this.telefonoConsultante = telefonoConsultante;
    }

    public String getAreaReceptora() {
        return areaReceptora;
    }

    public void setAreaReceptora(String areaReceptora) {
        this.areaReceptora = areaReceptora;
    }

    public MotivoConsultaViolencia getMotivoConsultaViolencia() {
        return motivoConsultaViolencia;
    }

    public void setMotivoConsultaViolencia(MotivoConsultaViolencia motivoConsultaViolencia) {
        this.motivoConsultaViolencia = motivoConsultaViolencia;
    }

    public String getMotivoConsultaDetalle() {
        return motivoConsultaDetalle;
    }

    public void setMotivoConsultaDetalle(String motivoConsultaDetalle) {
        this.motivoConsultaDetalle = motivoConsultaDetalle;
    }

    public VinculoAgresor getVinculoAgresor() {
        return vinculoAgresor;
    }

    public void setVinculoAgresor(VinculoAgresor vinculoAgresor) {
        this.vinculoAgresor = vinculoAgresor;
    }

    public String getVinculoAgresorDetalle() {
        return vinculoAgresorDetalle;
    }

    public void setVinculoAgresorDetalle(String vinculoAgresorDetalle) {
        this.vinculoAgresorDetalle = vinculoAgresorDetalle;
    }

    public String getConVive() {
        return conVive;
    }

    public void setConVive(String conVive) {
        this.conVive = conVive;
    }

    public LaVictima getLaVictima() {
        return laVictima;
    }

    public void setLaVictima(LaVictima laVictima) {
        this.laVictima = laVictima;
    }

    public String getLaVictimaDetalle() {
        return laVictimaDetalle;
    }

    public void setLaVictimaDetalle(String laVictimaDetalle) {
        this.laVictimaDetalle = laVictimaDetalle;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }
}
