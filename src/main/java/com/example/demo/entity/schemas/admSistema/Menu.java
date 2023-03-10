package com.example.demo.entity.schemas.admSistema;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(schema = "admsistema", name = "menu")
public class Menu {
    @Id
    @Column(name = "idmenu")
    private String idMenu;
    @Column(name = "menubase")
    private Boolean menuBase;
    private String descripcion;
    private String disposicion;
    @ManyToOne
    @JoinColumn(name = "idmodulo", referencedColumnName = "idmodulo")
    private Modulo modulo;
    @OneToMany(mappedBy = "id.idmenu")
    @JsonManagedReference
    private List<ArbolMenuRaiz> arbolMenus;

    public String getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(String idMenu) {
        this.idMenu = idMenu;
    }

    public Boolean getMenuBase() {
        return menuBase;
    }

    public void setMenuBase(Boolean menuBase) {
        this.menuBase = menuBase;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDisposicion() {
        return disposicion;
    }

    public void setDisposicion(String disposicion) {
        this.disposicion = disposicion;
    }

    public Modulo getModulo() {
        return modulo;
    }

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }

    public List<ArbolMenuRaiz> getArbolMenus() {
        return arbolMenus;
    }

    public void setArbolMenus(List<ArbolMenuRaiz> arbolMenus) {
        this.arbolMenus = arbolMenus;
    }
}
