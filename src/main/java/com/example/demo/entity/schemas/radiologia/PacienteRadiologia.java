package com.example.demo.entity.schemas.radiologia;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "pacienteradiologia", schema = "radiologia")
public class PacienteRadiologia {
    @Id
    @Column(name = "nropaciente")
    private Integer nroPaciente;
    @Column(name = "apyno")
    private String apellidoNombre;
    private String sexo;
    @Column(name = "fechanacimiento")
    private Date fechaNacimiento;
    @Column(name = "numerodocumento")
    private String numeroDocumento;
    @Column(name = "idtipodocumento")
    private String idTipoDocumento;

    public Integer getNroPaciente() {
        return nroPaciente;
    }

    public void setNroPaciente(Integer nroPaciente) {
        this.nroPaciente = nroPaciente;
    }

    public String getApellidoNombre() {
        return apellidoNombre;
    }

    public void setApellidoNombre(String apellidoNombre) {
        this.apellidoNombre = apellidoNombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(String idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }
}
