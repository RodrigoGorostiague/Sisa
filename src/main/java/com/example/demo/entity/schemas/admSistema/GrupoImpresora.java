package com.example.demo.entity.schemas.admSistema;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(schema = "admsistema", name = "grupoimpresora")
public class GrupoImpresora {
    @Id
    @Column(name = "numerogrupo")
    private Integer numeroGrupo;
    @Column(name = "nombregrupo")
    private String nombreGrupo;
    private String descripcion;
    @OneToMany(mappedBy = "id.numeroGrupo")
    private List<ImpresoraEnGrupo> impresoraEnGrupos;

    public List<ImpresoraEnGrupo> getImpresoraEnGrupos() {
        return impresoraEnGrupos;
    }

    public void setImpresoraEnGrupos(List<ImpresoraEnGrupo> impresoraEnGrupos) {
        this.impresoraEnGrupos = impresoraEnGrupos;
    }

    public Integer getNumeroGrupo() {
        return numeroGrupo;
    }

    public void setNumeroGrupo(Integer numeroGrupo) {
        this.numeroGrupo = numeroGrupo;
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
