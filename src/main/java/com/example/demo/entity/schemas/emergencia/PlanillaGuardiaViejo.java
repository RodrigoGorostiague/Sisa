package com.example.demo.entity.schemas.emergencia;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "planillaguardia_viejo", schema = "emergencia")
public class PlanillaGuardiaViejo {
    @EmbeddedId
    private PlanillaGuardiaViejoPK id;
    @Column(name = "nropaciente")
    private Integer nroPaciente;
    @Column(name = "pac_t")
    private String pacT;
    private Date fecha;
    private LocalDateTime hora;
    @Column(name = "estadoform")
    private String estadoForm;
    @Column(name = "obrasocial")
    private String obraSocial;
    private String afiliado;
    private String medico;
    @Column(name = "esaccidente")
    private String esAccidente;
    private String policia;
    private String observacion;
    private String tipoAtencion;
    private String consulta;
    private String curacion;
    private String sutura;
    private String quemado;
    private String inyeccion;
    private String presion;
    private String nebulizacion;
    private String medicamentos;
    private String radiologia;
    private String laboratorio;
    @Column(name = "yeso_venda")
    private String yesoVenda;

    public PlanillaGuardiaViejoPK getId() {
        return id;
    }

    public void setId(PlanillaGuardiaViejoPK id) {
        this.id = id;
    }

    public Integer getNroPaciente() {
        return nroPaciente;
    }

    public void setNroPaciente(Integer nroPaciente) {
        this.nroPaciente = nroPaciente;
    }

    public String getPacT() {
        return pacT;
    }

    public void setPacT(String pacT) {
        this.pacT = pacT;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }

    public String getEstadoForm() {
        return estadoForm;
    }

    public void setEstadoForm(String estadoForm) {
        this.estadoForm = estadoForm;
    }

    public String getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }

    public String getAfiliado() {
        return afiliado;
    }

    public void setAfiliado(String afiliado) {
        this.afiliado = afiliado;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getEsAccidente() {
        return esAccidente;
    }

    public void setEsAccidente(String esAccidente) {
        this.esAccidente = esAccidente;
    }

    public String getPolicia() {
        return policia;
    }

    public void setPolicia(String policia) {
        this.policia = policia;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getTipoAtencion() {
        return tipoAtencion;
    }

    public void setTipoAtencion(String tipoAtencion) {
        this.tipoAtencion = tipoAtencion;
    }

    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }

    public String getCuracion() {
        return curacion;
    }

    public void setCuracion(String curacion) {
        this.curacion = curacion;
    }

    public String getSutura() {
        return sutura;
    }

    public void setSutura(String sutura) {
        this.sutura = sutura;
    }

    public String getQuemado() {
        return quemado;
    }

    public void setQuemado(String quemado) {
        this.quemado = quemado;
    }

    public String getInyeccion() {
        return inyeccion;
    }

    public void setInyeccion(String inyeccion) {
        this.inyeccion = inyeccion;
    }

    public String getPresion() {
        return presion;
    }

    public void setPresion(String presion) {
        this.presion = presion;
    }

    public String getNebulizacion() {
        return nebulizacion;
    }

    public void setNebulizacion(String nebulizacion) {
        this.nebulizacion = nebulizacion;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getRadiologia() {
        return radiologia;
    }

    public void setRadiologia(String radiologia) {
        this.radiologia = radiologia;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public String getYesoVenda() {
        return yesoVenda;
    }

    public void setYesoVenda(String yesoVenda) {
        this.yesoVenda = yesoVenda;
    }
}
