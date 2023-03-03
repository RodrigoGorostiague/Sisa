package com.example.demo.entity.schemas.seguridad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarioxfuncion", schema = "seguridad")
public class UsuarioXFuncion {
    @Id
    @Column(name = "id_usuario")
    private Integer idUsuario;
    @Column(name = "nfuncion")
    private Integer nFuncion;
    private String tipo;

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getnFuncion() {
        return nFuncion;
    }

    public void setnFuncion(Integer nFuncion) {
        this.nFuncion = nFuncion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
