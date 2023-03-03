package com.example.demo.entity.schemas.internacion;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "nacimiento",schema = "internacion")
public class Nacimiento {
    @EmbeddedId
    private NacimientoPK id;
    private Integer peso;
    private String condicion;
    private String terminacion;
    private String sexo;
    @Column(name = "apgardesde")
    private String apgarDesde;
    @Column(name = "apgarhasta")
    private String apgarHasta;
    @Column(name = "idpaciente")
    private Integer idPaciente;

    public NacimientoPK getId() {
        return id;
    }

    public void setId(NacimientoPK id) {
        this.id = id;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public String getTerminacion() {
        return terminacion;
    }

    public void setTerminacion(String terminacion) {
        this.terminacion = terminacion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getApgarDesde() {
        return apgarDesde;
    }

    public void setApgarDesde(String apgarDesde) {
        this.apgarDesde = apgarDesde;
    }

    public String getApgarHasta() {
        return apgarHasta;
    }

    public void setApgarHasta(String apgarHasta) {
        this.apgarHasta = apgarHasta;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }
}
