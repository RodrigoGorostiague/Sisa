package com.example.demo.entity.schemas.emergencia;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(schema = "emergencia", name = "pacienteguardia")
public class PacienteGuardia {
    @EmbeddedId
    private PacienteGuardiaPK id;
    @Column(name = "apyno")
    private String nombreApellido;
    private String sexo;
    @Column(name = "fechanacimiento")
    private Date fechaNacimiento;
    @Column(name = "numerodocumento")
    private String numeroDocumento;
    @Column(name = "idtipodocumento")
    private String idTipoDocumento;
    @OneToMany(mappedBy = "pacienteGuardia")
    private List<PlanillaGuardiaEmergencias> planillaGuardiaEmergencias;

    public List<PlanillaGuardiaEmergencias> getPlanillaGuardiaEmergencias() {
        return planillaGuardiaEmergencias;
    }

    public void setPlanillaGuardiaEmergencias(List<PlanillaGuardiaEmergencias> planillaGuardiaEmergencias) {
        this.planillaGuardiaEmergencias = planillaGuardiaEmergencias;
    }

    public PacienteGuardiaPK getId() {
        return id;
    }

    public void setId(PacienteGuardiaPK id) {
        this.id = id;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
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
