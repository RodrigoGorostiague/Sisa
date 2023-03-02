package com.example.demo.entity.schemas.facturacion;
import jakarta.persistence.*;

@Entity
@Table(name = "aseguradora", schema = "facturacion")
public class Aseguradora {
    @Id
    @Column(name = "codigoart")
    private Integer codigoArt;
    @Column(name = "nombrecorto")
    private String nombreCorto;
    private String nombre;
    private String habilitado;
    private String cuit;
    @Column(name = "direccion_corr")
    private String direccionCorr;
    @Column(name = "localidad_corr")
    private String localidadCorr;
    private String telefono;
    private String responsable;
    private String globaliza;
    @Column(name = "cpostal_corr")
    private String cpostalCorr;
    private String mail;
    @ManyToOne
    @JoinColumn(name = "iva", referencedColumnName = "idtipoiva")
    private TipoIva iva;
    @Column(name = "paginaweb")
    private String paginaWeb;
    private String usuario;
    private String passw;
    @Column(name = "nroprestador")
    private String nroPrestador;
    @Column(name = "direccionlegal")
    private String direccionLegal;
    @Column(name = "localidadlegal")
    private String localidadLegal;
    @Column(name = "cpostallegal")
    private String cpostalLegal;
    @Column(name = "ingr_brutos")
    private Integer ingrBrutos;
    @Column(name = "formadepago")
    private Integer formaDePago;
    @Column(name = "provincia_leg")
    private Integer provinciaLeg;
    @Column(name = "provincia_corr")
    private Integer provinciaCorr;
    @Column(name = "telefono_corr")
    private String telefonoCorr;
    @Column(name = "telefono_legal")
    private String telefonoLegal;
    private String observaciones;
    @Column(name = "convmult")
    private String convMult;

    public Integer getCodigoArt() {
        return codigoArt;
    }

    public void setCodigoArt(Integer codigoArt) {
        this.codigoArt = codigoArt;
    }

    public String getNombreCorto() {
        return nombreCorto;
    }

    public void setNombreCorto(String nombreCorto) {
        this.nombreCorto = nombreCorto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(String habilitado) {
        this.habilitado = habilitado;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getDireccionCorr() {
        return direccionCorr;
    }

    public void setDireccionCorr(String direccionCorr) {
        this.direccionCorr = direccionCorr;
    }

    public String getLocalidadCorr() {
        return localidadCorr;
    }

    public void setLocalidadCorr(String localidadCorr) {
        this.localidadCorr = localidadCorr;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getGlobaliza() {
        return globaliza;
    }

    public void setGlobaliza(String globaliza) {
        this.globaliza = globaliza;
    }

    public String getCpostalCorr() {
        return cpostalCorr;
    }

    public void setCpostalCorr(String cpostalCorr) {
        this.cpostalCorr = cpostalCorr;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public TipoIva getIva() {
        return iva;
    }

    public void setIva(TipoIva iva) {
        this.iva = iva;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassw() {
        return passw;
    }

    public void setPassw(String passw) {
        this.passw = passw;
    }

    public String getNroPrestador() {
        return nroPrestador;
    }

    public void setNroPrestador(String nroPrestador) {
        this.nroPrestador = nroPrestador;
    }

    public String getDireccionLegal() {
        return direccionLegal;
    }

    public void setDireccionLegal(String direccionLegal) {
        this.direccionLegal = direccionLegal;
    }

    public String getLocalidadLegal() {
        return localidadLegal;
    }

    public void setLocalidadLegal(String localidadLegal) {
        this.localidadLegal = localidadLegal;
    }

    public String getCpostalLegal() {
        return cpostalLegal;
    }

    public void setCpostalLegal(String cpostalLegal) {
        this.cpostalLegal = cpostalLegal;
    }

    public Integer getIngrBrutos() {
        return ingrBrutos;
    }

    public void setIngrBrutos(Integer ingrBrutos) {
        this.ingrBrutos = ingrBrutos;
    }

    public Integer getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(Integer formaDePago) {
        this.formaDePago = formaDePago;
    }

    public Integer getProvinciaLeg() {
        return provinciaLeg;
    }

    public void setProvinciaLeg(Integer provinciaLeg) {
        this.provinciaLeg = provinciaLeg;
    }

    public Integer getProvinciaCorr() {
        return provinciaCorr;
    }

    public void setProvinciaCorr(Integer provinciaCorr) {
        this.provinciaCorr = provinciaCorr;
    }

    public String getTelefonoCorr() {
        return telefonoCorr;
    }

    public void setTelefonoCorr(String telefonoCorr) {
        this.telefonoCorr = telefonoCorr;
    }

    public String getTelefonoLegal() {
        return telefonoLegal;
    }

    public void setTelefonoLegal(String telefonoLegal) {
        this.telefonoLegal = telefonoLegal;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getConvMult() {
        return convMult;
    }

    public void setConvMult(String convMult) {
        this.convMult = convMult;
    }
}
