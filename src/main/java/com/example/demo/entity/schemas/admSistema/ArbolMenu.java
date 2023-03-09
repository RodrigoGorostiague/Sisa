package com.example.demo.entity.schemas.admSistema;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(schema = "admsistema", name = "arbolmenu")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class ArbolMenu {
    @EmbeddedId
    private ArbolMenuPK id;
    private Integer orden;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name="iditemmenupadre", referencedColumnName="iditemmenu"),
            @JoinColumn(name="idmenupadre", referencedColumnName="idmenu")})
    @JsonBackReference
    private ArbolMenu padre;
    @OneToMany(mappedBy = "padre", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<ArbolMenu> hijos;

    public ArbolMenu getPadre() {
        return padre;
    }

    public void setPadre(ArbolMenu padre) {
        this.padre = padre;
    }

    public ArbolMenuPK getId() {
        return id;
    }

    public void setId(ArbolMenuPK id) {
        this.id = id;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public List<ArbolMenu> getHijos() {
        return hijos;
    }

    public void setHijos(List<ArbolMenu> hijos) {
        this.hijos = hijos;
    }
}
