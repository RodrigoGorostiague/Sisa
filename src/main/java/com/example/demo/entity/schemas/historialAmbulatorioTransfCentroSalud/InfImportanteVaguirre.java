package com.example.demo.entity.schemas.historialAmbulatorioTransfCentroSalud;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historialambulatorio_tranf_csalud", name = "infimportantevaguirre")
public class InfImportanteVaguirre {
    @EmbeddedId
    private InfImportanteVaguirrePK id;
    @Column(name = "infimportante")
    private String infImportante;
    @Column(name = "idpaciente")
    private Integer idPaciente;
    @Column(name = "pasaratabla")
    private Integer pasarTabla;

    public InfImportanteVaguirrePK getId() {
        return id;
    }

    public void setId(InfImportanteVaguirrePK id) {
        this.id = id;
    }

    public String getInfImportante() {
        return infImportante;
    }

    public void setInfImportante(String infImportante) {
        this.infImportante = infImportante;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Integer getPasarTabla() {
        return pasarTabla;
    }

    public void setPasarTabla(Integer pasarTabla) {
        this.pasarTabla = pasarTabla;
    }
}
