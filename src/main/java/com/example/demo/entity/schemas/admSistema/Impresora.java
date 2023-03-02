package com.example.demo.entity.schemas.admSistema;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(schema = "admsistema", name = "impresora")
public class Impresora {
    @Id
    @Column(name = "numeroimpresora")
    private Integer numeroImpresora;
    @Column(name = "nombreimpresoracups")
    private String nombreImpresoraCups;
    @Column(name = "maquinalocal")
    private String maquinaLocal;
    private String descripcion;
    private String observaciones;
    @OneToMany(mappedBy = "id.numeroImpresora")
    private List<ImpresoraEnGrupo> impresoraEnGrupos;

    public List<ImpresoraEnGrupo> getImpresoraEnGrupos() {
        return impresoraEnGrupos;
    }

    public void setImpresoraEnGrupos(List<ImpresoraEnGrupo> impresoraEnGrupos) {
        this.impresoraEnGrupos = impresoraEnGrupos;
    }

    public Integer getNumeroImpresora() {
        return numeroImpresora;
    }

    public void setNumeroImpresora(Integer numeroImpresora) {
        this.numeroImpresora = numeroImpresora;
    }

    public String getNombreImpresoraCups() {
        return nombreImpresoraCups;
    }

    public void setNombreImpresoraCups(String nombreImpresoraCups) {
        this.nombreImpresoraCups = nombreImpresoraCups;
    }

    public String getMaquinaLocal() {
        return maquinaLocal;
    }

    public void setMaquinaLocal(String maquinaLocal) {
        this.maquinaLocal = maquinaLocal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
