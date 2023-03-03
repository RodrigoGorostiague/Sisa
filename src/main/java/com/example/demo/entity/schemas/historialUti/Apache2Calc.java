package com.example.demo.entity.schemas.historialUti;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Date;

@Entity
@Table(schema = "historialuti", name = "apache2calc")
public class Apache2Calc {
    @Id
    @Column(name = "nrouti")
    private String nroUti;
    private Integer apache2;
    @Column(name = "frecrespiratoria")
    private Integer frecRespiratoria;
    @Column(name = "temprectal")
    private Integer tempRectal;
    @Column(name = "tadiastolica")
    private Integer taDiastolica;
    @Column(name = "tasistolica")
    private Integer taSistolica;
    @Column(name = "freccardiaca")
    private Integer frecCardiaca;
    @Column(name = "glasocular")
    private Integer glasOcular;
    @Column(name = "glasverbal")
    private Integer glasVerbal;
    @Column(name = "glasmotor")
    private Integer glasMotor;
    @Column(name = "gassgre_fio2")
    private Integer gassgreFio2;
    @Column(name = "gassgre_co2")
    private Integer gassgreCo2;
    @Column(name = "gassgre_pao2")
    private Integer gassgrePaO2;
    @Column(name = "gassgre_ph")
    private Integer gassgrePh;
    @Column(name = "potasioserico")
    private Integer potasioSerico;
    @Column(name = "creaserica")
    private Integer creaSerica;
    private Integer hematocrito;
    @Column(name = "sodioserico")
    private Integer sodioSerico;
    private Integer leucocitos;
    private String valcliquir;
    private Date fecha;
    private Integer edad;
    private String mortalidad;

    public String getNroUti() {
        return nroUti;
    }

    public void setNroUti(String nroUti) {
        this.nroUti = nroUti;
    }

    public Integer getApache2() {
        return apache2;
    }

    public void setApache2(Integer apache2) {
        this.apache2 = apache2;
    }

    public Integer getFrecRespiratoria() {
        return frecRespiratoria;
    }

    public void setFrecRespiratoria(Integer frecRespiratoria) {
        this.frecRespiratoria = frecRespiratoria;
    }

    public Integer getTempRectal() {
        return tempRectal;
    }

    public void setTempRectal(Integer tempRectal) {
        this.tempRectal = tempRectal;
    }

    public Integer getTaDiastolica() {
        return taDiastolica;
    }

    public void setTaDiastolica(Integer taDiastolica) {
        this.taDiastolica = taDiastolica;
    }

    public Integer getTaSistolica() {
        return taSistolica;
    }

    public void setTaSistolica(Integer taSistolica) {
        this.taSistolica = taSistolica;
    }

    public Integer getFrecCardiaca() {
        return frecCardiaca;
    }

    public void setFrecCardiaca(Integer frecCardiaca) {
        this.frecCardiaca = frecCardiaca;
    }

    public Integer getGlasOcular() {
        return glasOcular;
    }

    public void setGlasOcular(Integer glasOcular) {
        this.glasOcular = glasOcular;
    }

    public Integer getGlasVerbal() {
        return glasVerbal;
    }

    public void setGlasVerbal(Integer glasVerbal) {
        this.glasVerbal = glasVerbal;
    }

    public Integer getGlasMotor() {
        return glasMotor;
    }

    public void setGlasMotor(Integer glasMotor) {
        this.glasMotor = glasMotor;
    }

    public Integer getGassgreFio2() {
        return gassgreFio2;
    }

    public void setGassgreFio2(Integer gassgreFio2) {
        this.gassgreFio2 = gassgreFio2;
    }

    public Integer getGassgreCo2() {
        return gassgreCo2;
    }

    public void setGassgreCo2(Integer gassgreCo2) {
        this.gassgreCo2 = gassgreCo2;
    }

    public Integer getGassgrePaO2() {
        return gassgrePaO2;
    }

    public void setGassgrePaO2(Integer gassgrePaO2) {
        this.gassgrePaO2 = gassgrePaO2;
    }

    public Integer getGassgrePh() {
        return gassgrePh;
    }

    public void setGassgrePh(Integer gassgrePh) {
        this.gassgrePh = gassgrePh;
    }

    public Integer getPotasioSerico() {
        return potasioSerico;
    }

    public void setPotasioSerico(Integer potasioSerico) {
        this.potasioSerico = potasioSerico;
    }

    public Integer getCreaSerica() {
        return creaSerica;
    }

    public void setCreaSerica(Integer creaSerica) {
        this.creaSerica = creaSerica;
    }

    public Integer getHematocrito() {
        return hematocrito;
    }

    public void setHematocrito(Integer hematocrito) {
        this.hematocrito = hematocrito;
    }

    public Integer getSodioSerico() {
        return sodioSerico;
    }

    public void setSodioSerico(Integer sodioSerico) {
        this.sodioSerico = sodioSerico;
    }

    public Integer getLeucocitos() {
        return leucocitos;
    }

    public void setLeucocitos(Integer leucocitos) {
        this.leucocitos = leucocitos;
    }

    public String getValcliquir() {
        return valcliquir;
    }

    public void setValcliquir(String valcliquir) {
        this.valcliquir = valcliquir;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getMortalidad() {
        return mortalidad;
    }

    public void setMortalidad(String mortalidad) {
        this.mortalidad = mortalidad;
    }
}
