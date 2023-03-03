package com.example.demo.entity.schemas.historialInternacion;

import com.example.demo.entity.schemas.internacion.Internacion;
import jakarta.persistence.*;

import java.sql.Blob;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(schema = "historialinternacion", name = "documentoadjunto")
public class DocumentoAdjunto {
    @Id
    @ManyToOne
    @JoinColumn(name = "nrointernacion", referencedColumnName = "nrointernacion")
    private Internacion internacion;
    @Column(name = "iddocumento")
    private Integer idDocumento;
    @Column(name = "codigopersonal")
    private String codigoPersonal;
    @Column(name = "fechahora")
    private LocalDateTime fechaHora;
    private String nombre;
    private Blob archivo;
    @ManyToOne
    @JoinColumn(name = "niveldeconfidencialidad", referencedColumnName = "id")
    private NivelConfidencialidad nivelConfidencialidad;

    public Internacion getInternacion() {
        return internacion;
    }

    public void setInternacion(Internacion internacion) {
        this.internacion = internacion;
    }

    public Integer getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(Integer idDocumento) {
        this.idDocumento = idDocumento;
    }

    public String getCodigoPersonal() {
        return codigoPersonal;
    }

    public void setCodigoPersonal(String codigoPersonal) {
        this.codigoPersonal = codigoPersonal;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Blob getArchivo() {
        return archivo;
    }

    public void setArchivo(Blob archivo) {
        this.archivo = archivo;
    }

    public NivelConfidencialidad getNivelConfidencialidad() {
        return nivelConfidencialidad;
    }

    public void setNivelConfidencialidad(NivelConfidencialidad nivelConfidencialidad) {
        this.nivelConfidencialidad = nivelConfidencialidad;
    }
}
