package com.example.demo.entity.schemas.admSistema;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(schema = "admsistema", name = "itemmenu")
public class ItemMenu {
    @Id
    @Column(name = "iditemmenu")
    private String idItemMenu;
    private String nombre;
    private String descripcion;
    private String accion;
    private String titulo;
    private String contenido;
    @Column(name = "caminoimagen")
    private String caminoImagen;
    @OneToMany(mappedBy = "id.iditemmenu")
    private List<ArbolMenu> arbolMenus;

    public List<ArbolMenu> getArbolMenus() {
        return arbolMenus;
    }

    public void setArbolMenus(List<ArbolMenu> arbolMenus) {
        this.arbolMenus = arbolMenus;
    }

    public String getIdItemMenu() {
        return idItemMenu;
    }

    public void setIdItemMenu(String idItemMenu) {
        this.idItemMenu = idItemMenu;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getCaminoImagen() {
        return caminoImagen;
    }

    public void setCaminoImagen(String caminoImagen) {
        this.caminoImagen = caminoImagen;
    }
}
