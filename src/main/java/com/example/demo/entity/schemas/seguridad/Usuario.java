package com.example.demo.entity.schemas.seguridad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario", schema = "seguridad")
public class Usuario {
    @Id
    @Column(name = "id_usuario")
    private Integer idUsuario;
    @Column(name = "nombre_ext")
    private String nombreExt;
    private String nombre;
    @Column(name = "pregunta_secreta")
    private String preguntaSecreta;
    @Column(name = "respuesta_secreta")
    private String respuestaSecreta;
    private String contrasenia;

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreExt() {
        return nombreExt;
    }

    public void setNombreExt(String nombreExt) {
        this.nombreExt = nombreExt;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPreguntaSecreta() {
        return preguntaSecreta;
    }

    public void setPreguntaSecreta(String preguntaSecreta) {
        this.preguntaSecreta = preguntaSecreta;
    }

    public String getRespuestaSecreta() {
        return respuestaSecreta;
    }

    public void setRespuestaSecreta(String respuestaSecreta) {
        this.respuestaSecreta = respuestaSecreta;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
}
