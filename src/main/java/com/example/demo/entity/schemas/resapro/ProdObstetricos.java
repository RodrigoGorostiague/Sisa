package com.example.demo.entity.schemas.resapro;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "prodobstetricos", schema = "resapro")
public class ProdObstetricos {
    @Id
    @Column(name = "id_internacion_local")
    private String idInternacionLocal;
    @Column(name = "cod_estable")
    private String codEstable;
    @Column(name = "peso_nacimiento")
    private Integer pesoNacimiento;
    @Column(name = "condicion_nacimiento")
    private Integer condicionNacimiento;
    @Column(name = "terminacion_nacimiento")
    private Integer terminacionNacimiento;
    private Integer sexo;
    private String apellido;
    private String nombre;
    @Column(name = "nro_documento")
    private String nroDocumento;

    public String getIdInternacionLocal() {
        return idInternacionLocal;
    }

    public void setIdInternacionLocal(String idInternacionLocal) {
        this.idInternacionLocal = idInternacionLocal;
    }

    public String getCodEstable() {
        return codEstable;
    }

    public void setCodEstable(String codEstable) {
        this.codEstable = codEstable;
    }

    public Integer getPesoNacimiento() {
        return pesoNacimiento;
    }

    public void setPesoNacimiento(Integer pesoNacimiento) {
        this.pesoNacimiento = pesoNacimiento;
    }

    public Integer getCondicionNacimiento() {
        return condicionNacimiento;
    }

    public void setCondicionNacimiento(Integer condicionNacimiento) {
        this.condicionNacimiento = condicionNacimiento;
    }

    public Integer getTerminacionNacimiento() {
        return terminacionNacimiento;
    }

    public void setTerminacionNacimiento(Integer terminacionNacimiento) {
        this.terminacionNacimiento = terminacionNacimiento;
    }

    public Integer getSexo() {
        return sexo;
    }

    public void setSexo(Integer sexo) {
        this.sexo = sexo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
    }
}
