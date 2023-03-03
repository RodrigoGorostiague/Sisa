package com.example.demo.entity.schemas.resapro;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "paciente", schema = "resapro")
public class PacienteResapro {
    @Id
    @Column(name = "id_paciente_local")
    private String idPacienteLocal;
    private String apellido;
    @Column(name = "cod_estable")
    private String codEstable;
    private String nombre;
    @Column(name = "id_sexo")
    private Integer idSexo;
    @Column(name = "id_tipo_documento")
    private Integer idTipoDocumento;
    @Column(name = "nro_documento")
    private String nroDocumento;
    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;
    @Column(name = "clase_documento")
    private String claseDocumento;
    private Integer indigena;
    @Column(name = "fecha_fallecimiento")
    private Date fechaFallecimiento;
    @Column(name = "apellido_2")
    private String apellido2;
    @Column(name = "nombres_2")
    private String nombres2;
    @Column(name = "id_sexo_2")
    private String idSexo2;
    @Column(name = "id_tipo_documento_2")
    private Integer idTipoDocumento2;
    @Column(name = "nro_documento_2")
    private String nroDocumento2;
    @Column(name = "fecha_nacimiento_2")
    private Date fechaNacimiento2;
    @Column(name = "clase_documento_2")
    private String claseDocumento2;
    @Column(name = "indigena_2")
    private Integer indigena2;
    @Column(name = "fecha_fallecimiento_2")
    private Date fechaFallecimiento2;
    @Column(name = "tipo_relacion")
    private String tipoRelacion;
    @Column(name = "fecha_alta")
    private Date fechaAlta;
    @Column(name = "id_nacionalidad")
    private Integer idNacionalidad;
    private String telefeno;
    @Column(name = "nro_celular")
    private String nroCelular;
    private String email;
    @Column(name = "cod_establecimiento_habitual")
    private String codEstablecimientoHabitual;
    @Column(name = "domicilio_calle")
    private String domicilioCalle;
    @Column(name = "domicilio_nro")
    private Integer domicilioNro;
    @Column(name = "domicilio_piso")
    private Integer domicilioPiso;
    @Column(name = "domicilio_dpto")
    private String domicilioDpto;
    @Column(name = "domicilio_manzana")
    private String domicilioManzana;
    @Column(name = "domicilio_entrecalle1")
    private String domicilioEntreCalle1;
    @Column(name = "domicilio_entrecalle2")
    private String domicilioEntreCalle2;
    @Column(name = "domicilio_barrio")
    private String domicilio_barrio;
    @Column(name = "id_localidad")
    private Integer idLocalidad;
    @Column(name = "id_partido")
    private Integer idPartido;
    @Column(name = "id_provincia")
    private Integer idProvincia;
    @Column(name = "id_pais")
    private Integer idPais;
    @Column(name = "codigo_postal")
    private String codigoPostal;
    @Column(name = "id_estudio")
    private Integer idEstudio;
    private String estudio;
    @Column(name = "id_situacion_laboral")
    private Integer idSituacionLaboral;
    @Column(name = "ocupacion_habitual")
    private String ocupacionHabitual;
    @Column(name = "id_cobertura")
    private Integer idCobertura;
    @Column(name = "fecha_diagnostico")
    private Date fechaDiagnostico;
    @Column(name = "fecha_probable_parto")
    private Date fechaProbableParto;

    public String getIdPacienteLocal() {
        return idPacienteLocal;
    }

    public void setIdPacienteLocal(String idPacienteLocal) {
        this.idPacienteLocal = idPacienteLocal;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCodEstable() {
        return codEstable;
    }

    public void setCodEstable(String codEstable) {
        this.codEstable = codEstable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdSexo() {
        return idSexo;
    }

    public void setIdSexo(Integer idSexo) {
        this.idSexo = idSexo;
    }

    public Integer getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(Integer idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getClaseDocumento() {
        return claseDocumento;
    }

    public void setClaseDocumento(String claseDocumento) {
        this.claseDocumento = claseDocumento;
    }

    public Integer getIndigena() {
        return indigena;
    }

    public void setIndigena(Integer indigena) {
        this.indigena = indigena;
    }

    public Date getFechaFallecimiento() {
        return fechaFallecimiento;
    }

    public void setFechaFallecimiento(Date fechaFallecimiento) {
        this.fechaFallecimiento = fechaFallecimiento;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNombres2() {
        return nombres2;
    }

    public void setNombres2(String nombres2) {
        this.nombres2 = nombres2;
    }

    public String getIdSexo2() {
        return idSexo2;
    }

    public void setIdSexo2(String idSexo2) {
        this.idSexo2 = idSexo2;
    }

    public Integer getIdTipoDocumento2() {
        return idTipoDocumento2;
    }

    public void setIdTipoDocumento2(Integer idTipoDocumento2) {
        this.idTipoDocumento2 = idTipoDocumento2;
    }

    public String getNroDocumento2() {
        return nroDocumento2;
    }

    public void setNroDocumento2(String nroDocumento2) {
        this.nroDocumento2 = nroDocumento2;
    }

    public Date getFechaNacimiento2() {
        return fechaNacimiento2;
    }

    public void setFechaNacimiento2(Date fechaNacimiento2) {
        this.fechaNacimiento2 = fechaNacimiento2;
    }

    public String getClaseDocumento2() {
        return claseDocumento2;
    }

    public void setClaseDocumento2(String claseDocumento2) {
        this.claseDocumento2 = claseDocumento2;
    }

    public Integer getIndigena2() {
        return indigena2;
    }

    public void setIndigena2(Integer indigena2) {
        this.indigena2 = indigena2;
    }

    public Date getFechaFallecimiento2() {
        return fechaFallecimiento2;
    }

    public void setFechaFallecimiento2(Date fechaFallecimiento2) {
        this.fechaFallecimiento2 = fechaFallecimiento2;
    }

    public String getTipoRelacion() {
        return tipoRelacion;
    }

    public void setTipoRelacion(String tipoRelacion) {
        this.tipoRelacion = tipoRelacion;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Integer getIdNacionalidad() {
        return idNacionalidad;
    }

    public void setIdNacionalidad(Integer idNacionalidad) {
        this.idNacionalidad = idNacionalidad;
    }

    public String getTelefeno() {
        return telefeno;
    }

    public void setTelefeno(String telefeno) {
        this.telefeno = telefeno;
    }

    public String getNroCelular() {
        return nroCelular;
    }

    public void setNroCelular(String nroCelular) {
        this.nroCelular = nroCelular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCodEstablecimientoHabitual() {
        return codEstablecimientoHabitual;
    }

    public void setCodEstablecimientoHabitual(String codEstablecimientoHabitual) {
        this.codEstablecimientoHabitual = codEstablecimientoHabitual;
    }

    public String getDomicilioCalle() {
        return domicilioCalle;
    }

    public void setDomicilioCalle(String domicilioCalle) {
        this.domicilioCalle = domicilioCalle;
    }

    public Integer getDomicilioNro() {
        return domicilioNro;
    }

    public void setDomicilioNro(Integer domicilioNro) {
        this.domicilioNro = domicilioNro;
    }

    public Integer getDomicilioPiso() {
        return domicilioPiso;
    }

    public void setDomicilioPiso(Integer domicilioPiso) {
        this.domicilioPiso = domicilioPiso;
    }

    public String getDomicilioDpto() {
        return domicilioDpto;
    }

    public void setDomicilioDpto(String domicilioDpto) {
        this.domicilioDpto = domicilioDpto;
    }

    public String getDomicilioManzana() {
        return domicilioManzana;
    }

    public void setDomicilioManzana(String domicilioManzana) {
        this.domicilioManzana = domicilioManzana;
    }

    public String getDomicilioEntreCalle1() {
        return domicilioEntreCalle1;
    }

    public void setDomicilioEntreCalle1(String domicilioEntreCalle1) {
        this.domicilioEntreCalle1 = domicilioEntreCalle1;
    }

    public String getDomicilioEntreCalle2() {
        return domicilioEntreCalle2;
    }

    public void setDomicilioEntreCalle2(String domicilioEntreCalle2) {
        this.domicilioEntreCalle2 = domicilioEntreCalle2;
    }

    public String getDomicilio_barrio() {
        return domicilio_barrio;
    }

    public void setDomicilio_barrio(String domicilio_barrio) {
        this.domicilio_barrio = domicilio_barrio;
    }

    public Integer getIdLocalidad() {
        return idLocalidad;
    }

    public void setIdLocalidad(Integer idLocalidad) {
        this.idLocalidad = idLocalidad;
    }

    public Integer getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(Integer idPartido) {
        this.idPartido = idPartido;
    }

    public Integer getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(Integer idProvincia) {
        this.idProvincia = idProvincia;
    }

    public Integer getIdPais() {
        return idPais;
    }

    public void setIdPais(Integer idPais) {
        this.idPais = idPais;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public Integer getIdEstudio() {
        return idEstudio;
    }

    public void setIdEstudio(Integer idEstudio) {
        this.idEstudio = idEstudio;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public Integer getIdSituacionLaboral() {
        return idSituacionLaboral;
    }

    public void setIdSituacionLaboral(Integer idSituacionLaboral) {
        this.idSituacionLaboral = idSituacionLaboral;
    }

    public String getOcupacionHabitual() {
        return ocupacionHabitual;
    }

    public void setOcupacionHabitual(String ocupacionHabitual) {
        this.ocupacionHabitual = ocupacionHabitual;
    }

    public Integer getIdCobertura() {
        return idCobertura;
    }

    public void setIdCobertura(Integer idCobertura) {
        this.idCobertura = idCobertura;
    }

    public Date getFechaDiagnostico() {
        return fechaDiagnostico;
    }

    public void setFechaDiagnostico(Date fechaDiagnostico) {
        this.fechaDiagnostico = fechaDiagnostico;
    }

    public Date getFechaProbableParto() {
        return fechaProbableParto;
    }

    public void setFechaProbableParto(Date fechaProbableParto) {
        this.fechaProbableParto = fechaProbableParto;
    }
}
