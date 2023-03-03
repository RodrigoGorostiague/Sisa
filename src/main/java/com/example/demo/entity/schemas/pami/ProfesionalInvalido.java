package com.example.demo.entity.schemas.pami;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "profesional_invalido", schema = "pami")
public class ProfesionalInvalido {
    @Id
    private String codigopersonal;
    @Column(name = "codigo_personal_invalido")
    private Boolean codigoPersonalInvalido;
    @Column(name = "datos_faltantes")
    private Boolean datosFaltantes;
    @Column(name = "fechanacimiento")
    private Date fechaNacimiento;
    @Column(name = "nro_matricula_prov")
    private Integer nroMatriculaProv;
    @Column(name = "tipo_doc")
    private String tipoDoc;
    @Column(name = "nro_doc")
    private Integer nroDoc;
    private String calle;
    private String nro;

    public String getCodigopersonal() {
        return codigopersonal;
    }

    public void setCodigopersonal(String codigopersonal) {
        this.codigopersonal = codigopersonal;
    }

    public Boolean getCodigoPersonalInvalido() {
        return codigoPersonalInvalido;
    }

    public void setCodigoPersonalInvalido(Boolean codigoPersonalInvalido) {
        this.codigoPersonalInvalido = codigoPersonalInvalido;
    }

    public Boolean getDatosFaltantes() {
        return datosFaltantes;
    }

    public void setDatosFaltantes(Boolean datosFaltantes) {
        this.datosFaltantes = datosFaltantes;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getNroMatriculaProv() {
        return nroMatriculaProv;
    }

    public void setNroMatriculaProv(Integer nroMatriculaProv) {
        this.nroMatriculaProv = nroMatriculaProv;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public Integer getNroDoc() {
        return nroDoc;
    }

    public void setNroDoc(Integer nroDoc) {
        this.nroDoc = nroDoc;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }
}
