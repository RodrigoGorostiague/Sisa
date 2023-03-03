package com.example.demo.entity.schemas.paciente;

import com.example.demo.entity.schemas.organizacion.UnidadAtencion;
import com.example.demo.entity.schemas.personal.Personal;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "nutricionaps", schema = "paciente")
public class NutricionAps {
    @EmbeddedId
    private NutricionApsPK id;
    @ManyToOne
    @JoinColumn(name = "codigouniat", referencedColumnName = "codigouniat")
    private UnidadAtencion unidadAtencion;
    @Column(name = "nroconvivientes")
    private Integer nroConvivientes;
    private String embarazada;
    private Integer peso;
    private Integer talla;
    @Column(name = "probcroncancer")
    private String probCronCancer;
    @Column(name = "probcroninfecc")
    private String probCronInfecc;
    @Column(name = "probcronirc")
    private String probCronIrc;
    @Column(name = "probcronhta")
    private String probCronHta;
    @Column(name = "probcrondiabetes")
    private String probCronDiabetes;
    @Column(name = "probcrondissev")
    private String probCronDisSev;
    @Column(name = "probcronotra")
    private String probCronOtra;
    @ManyToOne
    @JoinColumn(name = "profesional", referencedColumnName = "codigopersonal")
    private Personal profesional;
    @Column(name = "necbasinsat")
    private String necBasicInsat;
    @ManyToOne
    @JoinColumn(name = "trabajsocial", referencedColumnName = "codigopersonal")
    private Personal trabajoSocial;
    private String beneficio;
    @Column(name = "fechabaja")
    private Date fechaBaja;
    @OneToOne
    @JoinColumn(name = "estadonutricional", referencedColumnName = "codigo")
    private EstadoNutricional estadoNutricional;

    public NutricionApsPK getId() {
        return id;
    }

    public void setId(NutricionApsPK id) {
        this.id = id;
    }

    public UnidadAtencion getUnidadAtencion() {
        return unidadAtencion;
    }

    public void setUnidadAtencion(UnidadAtencion unidadAtencion) {
        this.unidadAtencion = unidadAtencion;
    }

    public Integer getNroConvivientes() {
        return nroConvivientes;
    }

    public void setNroConvivientes(Integer nroConvivientes) {
        this.nroConvivientes = nroConvivientes;
    }

    public String getEmbarazada() {
        return embarazada;
    }

    public void setEmbarazada(String embarazada) {
        this.embarazada = embarazada;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getTalla() {
        return talla;
    }

    public void setTalla(Integer talla) {
        this.talla = talla;
    }

    public String getProbCronCancer() {
        return probCronCancer;
    }

    public void setProbCronCancer(String probCronCancer) {
        this.probCronCancer = probCronCancer;
    }

    public String getProbCronInfecc() {
        return probCronInfecc;
    }

    public void setProbCronInfecc(String probCronInfecc) {
        this.probCronInfecc = probCronInfecc;
    }

    public String getProbCronIrc() {
        return probCronIrc;
    }

    public void setProbCronIrc(String probCronIrc) {
        this.probCronIrc = probCronIrc;
    }

    public String getProbCronHta() {
        return probCronHta;
    }

    public void setProbCronHta(String probCronHta) {
        this.probCronHta = probCronHta;
    }

    public String getProbCronDiabetes() {
        return probCronDiabetes;
    }

    public void setProbCronDiabetes(String probCronDiabetes) {
        this.probCronDiabetes = probCronDiabetes;
    }

    public String getProbCronDisSev() {
        return probCronDisSev;
    }

    public void setProbCronDisSev(String probCronDisSev) {
        this.probCronDisSev = probCronDisSev;
    }

    public String getProbCronOtra() {
        return probCronOtra;
    }

    public void setProbCronOtra(String probCronOtra) {
        this.probCronOtra = probCronOtra;
    }

    public Personal getProfesional() {
        return profesional;
    }

    public void setProfesional(Personal profesional) {
        this.profesional = profesional;
    }

    public String getNecBasicInsat() {
        return necBasicInsat;
    }

    public void setNecBasicInsat(String necBasicInsat) {
        this.necBasicInsat = necBasicInsat;
    }

    public Personal getTrabajoSocial() {
        return trabajoSocial;
    }

    public void setTrabajoSocial(Personal trabajoSocial) {
        this.trabajoSocial = trabajoSocial;
    }

    public String getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(String beneficio) {
        this.beneficio = beneficio;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public EstadoNutricional getEstadoNutricional() {
        return estadoNutricional;
    }

    public void setEstadoNutricional(EstadoNutricional estadoNutricional) {
        this.estadoNutricional = estadoNutricional;
    }
}
