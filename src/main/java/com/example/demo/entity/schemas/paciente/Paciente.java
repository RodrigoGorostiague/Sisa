package com.example.demo.entity.schemas.paciente;

import com.example.demo.entity.schemas.hc.HistoriaClinica;
import com.example.demo.entity.schemas.domicilio.Pais;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "paciente",schema = "paciente")
public class Paciente {
    @Id
    @Column(name = "idpaciente")
    private Integer idPaciente;
    private String nombre;
    private String apellido;
    @Column(name = "apellidomaterno")
    private String apellidoMaterno;
    @ManyToOne
    @JoinColumn(name = "idtipodocumento", referencedColumnName = "idtipodocumento")
    private TipoDocumento tipoDocumento;
    @Column(name = "numerodocumento")
    private String numeroDocumento;
    @ManyToOne
    @JoinColumn(name = "nacionalidad", referencedColumnName = "codigopais")
    private Pais nacionalidad;
    private String sexo;
    @Column(name = "fechanacimiento")
    private Date fechaNacimiento;
    @Column(name = "lugarnacimiento")
    private String lugarNacimiento;
    @ManyToOne
    @JoinColumn(name = "paisnacimiento", referencedColumnName = "codigopais")
    private Pais paisNacimiento;
    private Boolean defunsion;
    @Column(name = "fechadefuncion")
    private Date fechaDefuncion;
    @Column(name = "lugardefuncion")
    private String lugarDefuncion;
    @ManyToOne
    @JoinColumn(name = "idgruposanguineo", referencedColumnName = "idgruposanguineo")
    private GrupoSanguineo grupoSanguineo;
    @ManyToOne
    @JoinColumn(name = "idfactorsanguineo", referencedColumnName = "idfactorsanguineo")
    private FactorSanguineo factorSanguineo;
    private String observaciones;
    @ManyToOne
    @JoinColumn(name = "idpacientemadretutor", referencedColumnName = "idpaciente")
    private Paciente pacienteMadreTutor;
    @OneToOne
    @JoinColumn(name = "historiaclinica", referencedColumnName = "historiaclinica")
    private HistoriaClinica historiaClinica;
    private Date empadronamiento;
    @Column(name = "paclab")
    private Integer pacLab;
    @ManyToOne
    @JoinColumn(name = "idpacientepadre", referencedColumnName = "idpaciente")
    private Paciente pacientePadre;
    @Column(name = "mostrarapellidoinvertido")
    private String mostrarApellidoInvertido;
    @Column(name = "cambiosexo")
    private String cambioSexo;
    @Column(name = "fechaultdecljursincob")
    private Date fechaUltDeclarJuraSinCob;
    @Column(name = "nombre_nodocumentado")
    private String nombreNoDocumentado;
    private String email;
    @Column(name = "infimportante")
    private String infoImportante;
    @Column(name = "estado_mpi")
    private String estadoMpi;
    @Column(name = "id_federador")
    private String idFederador;
    private Integer cuil;
    @Column(name = "sexo_nac")
    private String sexoNac;
    private Integer genero;

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Pais getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(Pais nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public Pais getPaisNacimiento() {
        return paisNacimiento;
    }

    public void setPaisNacimiento(Pais paisNacimiento) {
        this.paisNacimiento = paisNacimiento;
    }

    public Boolean getDefunsion() {
        return defunsion;
    }

    public void setDefunsion(Boolean defunsion) {
        this.defunsion = defunsion;
    }

    public Date getFechaDefuncion() {
        return fechaDefuncion;
    }

    public void setFechaDefuncion(Date fechaDefuncion) {
        this.fechaDefuncion = fechaDefuncion;
    }

    public String getLugarDefuncion() {
        return lugarDefuncion;
    }

    public void setLugarDefuncion(String lugarDefuncion) {
        this.lugarDefuncion = lugarDefuncion;
    }

    public GrupoSanguineo getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(GrupoSanguineo grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public FactorSanguineo getFactorSanguineo() {
        return factorSanguineo;
    }

    public void setFactorSanguineo(FactorSanguineo factorSanguineo) {
        this.factorSanguineo = factorSanguineo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Paciente getPacienteMadreTutor() {
        return pacienteMadreTutor;
    }

    public void setPacienteMadreTutor(Paciente pacienteMadreTutor) {
        this.pacienteMadreTutor = pacienteMadreTutor;
    }

    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(HistoriaClinica historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    public Date getEmpadronamiento() {
        return empadronamiento;
    }

    public void setEmpadronamiento(Date empadronamiento) {
        this.empadronamiento = empadronamiento;
    }

    public Integer getPacLab() {
        return pacLab;
    }

    public void setPacLab(Integer pacLab) {
        this.pacLab = pacLab;
    }

    public Paciente getPacientePadre() {
        return pacientePadre;
    }

    public void setPacientePadre(Paciente pacientePadre) {
        this.pacientePadre = pacientePadre;
    }

    public String getMostrarApellidoInvertido() {
        return mostrarApellidoInvertido;
    }

    public void setMostrarApellidoInvertido(String mostrarApellidoInvertido) {
        this.mostrarApellidoInvertido = mostrarApellidoInvertido;
    }

    public String getCambioSexo() {
        return cambioSexo;
    }

    public void setCambioSexo(String cambioSexo) {
        this.cambioSexo = cambioSexo;
    }

    public Date getFechaUltDeclarJuraSinCob() {
        return fechaUltDeclarJuraSinCob;
    }

    public void setFechaUltDeclarJuraSinCob(Date fechaUltDeclarJuraSinCob) {
        this.fechaUltDeclarJuraSinCob = fechaUltDeclarJuraSinCob;
    }

    public String getNombreNoDocumentado() {
        return nombreNoDocumentado;
    }

    public void setNombreNoDocumentado(String nombreNoDocumentado) {
        this.nombreNoDocumentado = nombreNoDocumentado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInfoImportante() {
        return infoImportante;
    }

    public void setInfoImportante(String infoImportante) {
        this.infoImportante = infoImportante;
    }

    public String getEstadoMpi() {
        return estadoMpi;
    }

    public void setEstadoMpi(String estadoMpi) {
        this.estadoMpi = estadoMpi;
    }

    public String getIdFederador() {
        return idFederador;
    }

    public void setIdFederador(String idFederador) {
        this.idFederador = idFederador;
    }

    public Integer getCuil() {
        return cuil;
    }

    public void setCuil(Integer cuil) {
        this.cuil = cuil;
    }

    public String getSexoNac() {
        return sexoNac;
    }

    public void setSexoNac(String sexoNac) {
        this.sexoNac = sexoNac;
    }

    public Integer getGenero() {
        return genero;
    }

    public void setGenero(Integer genero) {
        this.genero = genero;
    }
}
