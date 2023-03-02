package com.example.demo.entity.schemas.emergencia;

import com.example.demo.entity.schemas.paciente.Paciente;
import com.example.demo.entity.schemas.personal.Personal;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(schema = "emergencia", name = "llamadas107")
public class Llamadas107 {
    @EmbeddedId
    private Llamadas107PK id;
    private String accidente;
    private String calle;
    private String nro;
    @Column(name = "entrecalle")
    private String entreCalle;
    @Column(name = "ycalle")
    private String yCalle;
    @Column(name = "kmruta")
    private String kmRuta;
    private String telefono;
    private String motivo;
    @Column(name = "nrodepacientes")
    private String nroPacientes;
    @Column(name = "nombreyapellido")
    private String nombreApellido;
    private String sexo;
    private String edad;
    private String conciente;
    private String respiracion;
    @Column(name = "nombreyapellidosolicitante")
    private String nombreApellidoSolicitante;
    @Column(name = "codigousuario")
    private String codigoUsuario;
    @ManyToOne
    @JoinColumn(name = "enfermero", referencedColumnName = "codigopersonal")
    private Personal enfermero;
    @ManyToOne
    @JoinColumn(name = "chofer", referencedColumnName = "codigopersonal")
    private Personal chofer;
    @ManyToOne
    @JoinColumn(name = "idpaciente", referencedColumnName = "idpaciente")
    private Paciente paciente;
    @Column(name = "triage_operador")
    private String triageOperador;
    private String triageMedico;
    @Column(name = "momento_obito")
    private String momentoObito;
    @Column(name = "hora_salida_amb")
    private LocalDateTime horaSalidaAmb;
    @Column(name = "hora_arribo_lugar")
    private LocalDateTime horaArriboLugar;
    @Column(name = "hora_salida_lugar")
    private LocalDateTime horaSalidaLugar;
    @Column(name = "hora_arribo_guardia")
    private LocalDateTime horaArriboGuardia;
    private String lugar;
    private String observaciones;
    @Column(name = "ingreso_guardia")
    private String ingresoGuardia;
    @Column(name = "despacho_cancelado")
    private String despachoCancelado;
    private String medico;

    public Llamadas107PK getId() {
        return id;
    }

    public void setId(Llamadas107PK id) {
        this.id = id;
    }

    public String getAccidente() {
        return accidente;
    }

    public void setAccidente(String accidente) {
        this.accidente = accidente;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public String getEntreCalle() {
        return entreCalle;
    }

    public void setEntreCalle(String entreCalle) {
        this.entreCalle = entreCalle;
    }

    public String getyCalle() {
        return yCalle;
    }

    public void setyCalle(String yCalle) {
        this.yCalle = yCalle;
    }

    public String getKmRuta() {
        return kmRuta;
    }

    public void setKmRuta(String kmRuta) {
        this.kmRuta = kmRuta;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getNroPacientes() {
        return nroPacientes;
    }

    public void setNroPacientes(String nroPacientes) {
        this.nroPacientes = nroPacientes;
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

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getConciente() {
        return conciente;
    }

    public void setConciente(String conciente) {
        this.conciente = conciente;
    }

    public String getRespiracion() {
        return respiracion;
    }

    public void setRespiracion(String respiracion) {
        this.respiracion = respiracion;
    }

    public String getNombreApellidoSolicitante() {
        return nombreApellidoSolicitante;
    }

    public void setNombreApellidoSolicitante(String nombreApellidoSolicitante) {
        this.nombreApellidoSolicitante = nombreApellidoSolicitante;
    }

    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public Personal getEnfermero() {
        return enfermero;
    }

    public void setEnfermero(Personal enfermero) {
        this.enfermero = enfermero;
    }

    public Personal getChofer() {
        return chofer;
    }

    public void setChofer(Personal chofer) {
        this.chofer = chofer;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getTriageOperador() {
        return triageOperador;
    }

    public void setTriageOperador(String triageOperador) {
        this.triageOperador = triageOperador;
    }

    public String getTriageMedico() {
        return triageMedico;
    }

    public void setTriageMedico(String triageMedico) {
        this.triageMedico = triageMedico;
    }

    public String getMomentoObito() {
        return momentoObito;
    }

    public void setMomentoObito(String momentoObito) {
        this.momentoObito = momentoObito;
    }

    public LocalDateTime getHoraSalidaAmb() {
        return horaSalidaAmb;
    }

    public void setHoraSalidaAmb(LocalDateTime horaSalidaAmb) {
        this.horaSalidaAmb = horaSalidaAmb;
    }

    public LocalDateTime getHoraArriboLugar() {
        return horaArriboLugar;
    }

    public void setHoraArriboLugar(LocalDateTime horaArriboLugar) {
        this.horaArriboLugar = horaArriboLugar;
    }

    public LocalDateTime getHoraSalidaLugar() {
        return horaSalidaLugar;
    }

    public void setHoraSalidaLugar(LocalDateTime horaSalidaLugar) {
        this.horaSalidaLugar = horaSalidaLugar;
    }

    public LocalDateTime getHoraArriboGuardia() {
        return horaArriboGuardia;
    }

    public void setHoraArriboGuardia(LocalDateTime horaArriboGuardia) {
        this.horaArriboGuardia = horaArriboGuardia;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getIngresoGuardia() {
        return ingresoGuardia;
    }

    public void setIngresoGuardia(String ingresoGuardia) {
        this.ingresoGuardia = ingresoGuardia;
    }

    public String getDespachoCancelado() {
        return despachoCancelado;
    }

    public void setDespachoCancelado(String despachoCancelado) {
        this.despachoCancelado = despachoCancelado;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }
}
