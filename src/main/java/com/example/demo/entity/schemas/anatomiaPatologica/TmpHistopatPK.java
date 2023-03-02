package com.example.demo.entity.schemas.anatomiaPatologica;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class TmpHistopatPK implements Serializable {
    @Column(name = "nrolinea")
    private Integer nroLinea;
    private String topografia;
    @Column(name = "desctopo")
    private String descTopo;
    @Column(name = "txtlibretopo")
    private String txtLibreTopo;
    private String diagnostico;
    @Column(name = "descdiag")
    private String descDiagnostico;
    @Column(name = "txtlibrediag")
    private String txtLibreDiag;
    private String macroscopia;
    private String microscopia;
    private String estadificacion;
    private String usuario;
    @Column(name = "nroinforme")
    private String nroInforme;

    public Integer getNroLinea() {
        return nroLinea;
    }

    public void setNroLinea(Integer nroLinea) {
        this.nroLinea = nroLinea;
    }

    public String getTopografia() {
        return topografia;
    }

    public void setTopografia(String topografia) {
        this.topografia = topografia;
    }

    public String getDescTopo() {
        return descTopo;
    }

    public void setDescTopo(String descTopo) {
        this.descTopo = descTopo;
    }

    public String getTxtLibreTopo() {
        return txtLibreTopo;
    }

    public void setTxtLibreTopo(String txtLibreTopo) {
        this.txtLibreTopo = txtLibreTopo;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getDescDiagnostico() {
        return descDiagnostico;
    }

    public void setDescDiagnostico(String descDiagnostico) {
        this.descDiagnostico = descDiagnostico;
    }

    public String getTxtLibreDiag() {
        return txtLibreDiag;
    }

    public void setTxtLibreDiag(String txtLibreDiag) {
        this.txtLibreDiag = txtLibreDiag;
    }

    public String getMacroscopia() {
        return macroscopia;
    }

    public void setMacroscopia(String macroscopia) {
        this.macroscopia = macroscopia;
    }

    public String getMicroscopia() {
        return microscopia;
    }

    public void setMicroscopia(String microscopia) {
        this.microscopia = microscopia;
    }

    public String getEstadificacion() {
        return estadificacion;
    }

    public void setEstadificacion(String estadificacion) {
        this.estadificacion = estadificacion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNroInforme() {
        return nroInforme;
    }

    public void setNroInforme(String nroInforme) {
        this.nroInforme = nroInforme;
    }
}
