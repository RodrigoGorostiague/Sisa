package com.example.demo.entity.schemas.anatomiaPatologica;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "anatomiapatologica", name = "informebiopsy")
public class InformeBiopsy {
    @EmbeddedId
    private InfComplHistoPatPK id;
    private String medico;
    @Column(name = "apynopaciente")
    private String apelldioNombrePaciente;
    private String hc;
    private Integer edad;
    private String sexo;
    private String procedencia;
    @Column(name = "idtopografia")
    private String idTopografia;
    private String topogafia;
    private String macroscopia;
    private String ihq;
    @Column(name = "iddiagnostico")
    private String  idDiagnostico;
    private String diagnostico;
    private String nomenclador;
    private Integer cantidad;

    public InfComplHistoPatPK getId() {
        return id;
    }

    public void setId(InfComplHistoPatPK id) {
        this.id = id;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getApelldioNombrePaciente() {
        return apelldioNombrePaciente;
    }

    public void setApelldioNombrePaciente(String apelldioNombrePaciente) {
        this.apelldioNombrePaciente = apelldioNombrePaciente;
    }

    public String getHc() {
        return hc;
    }

    public void setHc(String hc) {
        this.hc = hc;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public String getIdTopografia() {
        return idTopografia;
    }

    public void setIdTopografia(String idTopografia) {
        this.idTopografia = idTopografia;
    }

    public String getTopogafia() {
        return topogafia;
    }

    public void setTopogafia(String topogafia) {
        this.topogafia = topogafia;
    }

    public String getMacroscopia() {
        return macroscopia;
    }

    public void setMacroscopia(String macroscopia) {
        this.macroscopia = macroscopia;
    }

    public String getIhq() {
        return ihq;
    }

    public void setIhq(String ihq) {
        this.ihq = ihq;
    }

    public String getIdDiagnostico() {
        return idDiagnostico;
    }

    public void setIdDiagnostico(String idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getNomenclador() {
        return nomenclador;
    }

    public void setNomenclador(String nomenclador) {
        this.nomenclador = nomenclador;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
