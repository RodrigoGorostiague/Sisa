package com.example.demo.entity.schemas.historialInternacion;

import com.example.demo.entity.schemas.paciente.FactorSanguineo;
import com.example.demo.entity.schemas.paciente.GrupoSanguineo;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(schema = "historialinternacion", name = "ingresoneo")
public class IngresoNeo {
    @EmbeddedId
    private IngresoNeoPK id;
    @Column(name = "enfermedadactual")
    private String enfermedadActual;
    @Column(name = "edadmaterna")
    private Integer edadMaterna;
    private Integer partos;
    private Integer abortos;
    @Column(name = "vianacimientos")
    private String viaNacimientos;
    private Boolean forceps;
    @Column(name = "pesoalnacer")
    private Integer pesoAlNacer;
    @Column(name = "edadgestacional")
    private Integer edadGestacional;
    private Integer apgar1min;
    private Integer apgar5min;
    @ManyToOne
    @JoinColumn(name = "gruposanguineomaterno", referencedColumnName = "idgruposanguineo")
    private GrupoSanguineo grupoSanguineoMaterno;
    @ManyToOne
    @JoinColumn(name = "factorsanguineomaterno", referencedColumnName = "idfactorsanguineo")
    private FactorSanguineo factorSanguineoMaterno;
    @Column(name = "controlembarazo")
    private String controlEmbarazo;
    @Column(name = "serologia_hiv_1t")
    private String serologiaHiv1t;
    @Column(name = "serologia_hiv_2t")
    private String serologiaHiv2t;
    @Column(name = "serologia_hiv_3t")
    private String serologiaHiv3t;
    @Column(name = "serologia_toxoplasmo_igg_1t")
    private String serologiaToxoplasmoIgg1t;
    @Column(name = "serologia_toxoplasmo_igg_2t")
    private String serologiaToxoplasmoIgg2t;
    @Column(name = "serologia_toxoplasmo_igg_3t")
    private String serologiaToxoplasmoIgg3t;
    @Column(name = "serologia_toxoplasmo_igm_1t")
    private String serologiaToxoplasmoIgm1t;
    @Column(name = "serologia_toxoplasmo_igm_2t")
    private String serologiaToxoplasmoIgm2t;
    @Column(name = "serologia_toxoplasmo_igm_3t")
    private String serologiaToxoplasmoIgm3t;
    @Column(name = "serologia_chagas_1t")
    private String serologiaChagas1t;
    @Column(name = "serologia_chagas_2t")
    private String serologiaChagas2t;
    @Column(name = "serologia_chagas_3t")
    private String serologiaChagas3t;
    @Column(name = "serologia_rubeola_1t")
    private String serologiaRubeola1t;
    @Column(name = "serologia_rubeola_2t")
    private String serologiaRubeola2t;
    @Column(name = "serologia_rubeola_3t")
    private String serologiaRubeola3t;
    @Column(name = "serologia_cmv_igm_1t")
    private String serologiaCmvIgm1t;
    @Column(name = "serologia_cmv_igm_2t")
    private String serologiaCmvIgm2t;
    @Column(name = "serologia_cmv_igm_3t")
    private String serologiaCmvIgm3t;
    @Column(name = "serologia_vdrl_trat_completo")
    private String serologiaVdrlTratCompleto;
    @Column(name = "serologia_vdrl_1t")
    private String serologiaVdrl1t;
    @Column(name = "serologia_vdrl_2t")
    private String serologiaVdrl2t;
    @Column(name = "serologia_vdrl_3t")
    private String serologiaVdrl3t;
    @Column(name = "serologia_test_avidez")
    private String serologiaTestAvidez;
    @Column(name = "serologia_cmv_igg_1t")
    private String serologiaCmvIgg1t;
    @Column(name = "serologia_cmv_igg_2t")
    private String serologiaCmvIgg2t;
    @Column(name = "serologia_cmv_igg_3t")
    private String serologiaCmvIgg3t;
    @Column(name = "serologia_vhb_1t")
    private String serologiaVhb1t;
    @Column(name = "serologia_vhb_2t")
    private String serologiaVhb2t;
    @Column(name = "serologia_vhb_3t")
    private String serologiaVhb3t;

    public IngresoNeoPK getId() {
        return id;
    }

    public void setId(IngresoNeoPK id) {
        this.id = id;
    }

    public String getEnfermedadActual() {
        return enfermedadActual;
    }

    public void setEnfermedadActual(String enfermedadActual) {
        this.enfermedadActual = enfermedadActual;
    }

    public Integer getEdadMaterna() {
        return edadMaterna;
    }

    public void setEdadMaterna(Integer edadMaterna) {
        this.edadMaterna = edadMaterna;
    }

    public Integer getPartos() {
        return partos;
    }

    public void setPartos(Integer partos) {
        this.partos = partos;
    }

    public Integer getAbortos() {
        return abortos;
    }

    public void setAbortos(Integer abortos) {
        this.abortos = abortos;
    }

    public String getViaNacimientos() {
        return viaNacimientos;
    }

    public void setViaNacimientos(String viaNacimientos) {
        this.viaNacimientos = viaNacimientos;
    }

    public Boolean getForceps() {
        return forceps;
    }

    public void setForceps(Boolean forceps) {
        this.forceps = forceps;
    }

    public Integer getPesoAlNacer() {
        return pesoAlNacer;
    }

    public void setPesoAlNacer(Integer pesoAlNacer) {
        this.pesoAlNacer = pesoAlNacer;
    }

    public Integer getEdadGestacional() {
        return edadGestacional;
    }

    public void setEdadGestacional(Integer edadGestacional) {
        this.edadGestacional = edadGestacional;
    }

    public Integer getApgar1min() {
        return apgar1min;
    }

    public void setApgar1min(Integer apgar1min) {
        this.apgar1min = apgar1min;
    }

    public Integer getApgar5min() {
        return apgar5min;
    }

    public void setApgar5min(Integer apgar5min) {
        this.apgar5min = apgar5min;
    }

    public GrupoSanguineo getGrupoSanguineoMaterno() {
        return grupoSanguineoMaterno;
    }

    public void setGrupoSanguineoMaterno(GrupoSanguineo grupoSanguineoMaterno) {
        this.grupoSanguineoMaterno = grupoSanguineoMaterno;
    }

    public FactorSanguineo getFactorSanguineoMaterno() {
        return factorSanguineoMaterno;
    }

    public void setFactorSanguineoMaterno(FactorSanguineo factorSanguineoMaterno) {
        this.factorSanguineoMaterno = factorSanguineoMaterno;
    }

    public String getControlEmbarazo() {
        return controlEmbarazo;
    }

    public void setControlEmbarazo(String controlEmbarazo) {
        this.controlEmbarazo = controlEmbarazo;
    }

    public String getSerologiaHiv1t() {
        return serologiaHiv1t;
    }

    public void setSerologiaHiv1t(String serologiaHiv1t) {
        this.serologiaHiv1t = serologiaHiv1t;
    }

    public String getSerologiaHiv2t() {
        return serologiaHiv2t;
    }

    public void setSerologiaHiv2t(String serologiaHiv2t) {
        this.serologiaHiv2t = serologiaHiv2t;
    }

    public String getSerologiaHiv3t() {
        return serologiaHiv3t;
    }

    public void setSerologiaHiv3t(String serologiaHiv3t) {
        this.serologiaHiv3t = serologiaHiv3t;
    }

    public String getSerologiaToxoplasmoIgg1t() {
        return serologiaToxoplasmoIgg1t;
    }

    public void setSerologiaToxoplasmoIgg1t(String serologiaToxoplasmoIgg1t) {
        this.serologiaToxoplasmoIgg1t = serologiaToxoplasmoIgg1t;
    }

    public String getSerologiaToxoplasmoIgg2t() {
        return serologiaToxoplasmoIgg2t;
    }

    public void setSerologiaToxoplasmoIgg2t(String serologiaToxoplasmoIgg2t) {
        this.serologiaToxoplasmoIgg2t = serologiaToxoplasmoIgg2t;
    }

    public String getSerologiaToxoplasmoIgg3t() {
        return serologiaToxoplasmoIgg3t;
    }

    public void setSerologiaToxoplasmoIgg3t(String serologiaToxoplasmoIgg3t) {
        this.serologiaToxoplasmoIgg3t = serologiaToxoplasmoIgg3t;
    }

    public String getSerologiaToxoplasmoIgm1t() {
        return serologiaToxoplasmoIgm1t;
    }

    public void setSerologiaToxoplasmoIgm1t(String serologiaToxoplasmoIgm1t) {
        this.serologiaToxoplasmoIgm1t = serologiaToxoplasmoIgm1t;
    }

    public String getSerologiaToxoplasmoIgm2t() {
        return serologiaToxoplasmoIgm2t;
    }

    public void setSerologiaToxoplasmoIgm2t(String serologiaToxoplasmoIgm2t) {
        this.serologiaToxoplasmoIgm2t = serologiaToxoplasmoIgm2t;
    }

    public String getSerologiaToxoplasmoIgm3t() {
        return serologiaToxoplasmoIgm3t;
    }

    public void setSerologiaToxoplasmoIgm3t(String serologiaToxoplasmoIgm3t) {
        this.serologiaToxoplasmoIgm3t = serologiaToxoplasmoIgm3t;
    }

    public String getSerologiaChagas1t() {
        return serologiaChagas1t;
    }

    public void setSerologiaChagas1t(String serologiaChagas1t) {
        this.serologiaChagas1t = serologiaChagas1t;
    }

    public String getSerologiaChagas2t() {
        return serologiaChagas2t;
    }

    public void setSerologiaChagas2t(String serologiaChagas2t) {
        this.serologiaChagas2t = serologiaChagas2t;
    }

    public String getSerologiaChagas3t() {
        return serologiaChagas3t;
    }

    public void setSerologiaChagas3t(String serologiaChagas3t) {
        this.serologiaChagas3t = serologiaChagas3t;
    }

    public String getSerologiaRubeola1t() {
        return serologiaRubeola1t;
    }

    public void setSerologiaRubeola1t(String serologiaRubeola1t) {
        this.serologiaRubeola1t = serologiaRubeola1t;
    }

    public String getSerologiaRubeola2t() {
        return serologiaRubeola2t;
    }

    public void setSerologiaRubeola2t(String serologiaRubeola2t) {
        this.serologiaRubeola2t = serologiaRubeola2t;
    }

    public String getSerologiaRubeola3t() {
        return serologiaRubeola3t;
    }

    public void setSerologiaRubeola3t(String serologiaRubeola3t) {
        this.serologiaRubeola3t = serologiaRubeola3t;
    }

    public String getSerologiaCmvIgm1t() {
        return serologiaCmvIgm1t;
    }

    public void setSerologiaCmvIgm1t(String serologiaCmvIgm1t) {
        this.serologiaCmvIgm1t = serologiaCmvIgm1t;
    }

    public String getSerologiaCmvIgm2t() {
        return serologiaCmvIgm2t;
    }

    public void setSerologiaCmvIgm2t(String serologiaCmvIgm2t) {
        this.serologiaCmvIgm2t = serologiaCmvIgm2t;
    }

    public String getSerologiaCmvIgm3t() {
        return serologiaCmvIgm3t;
    }

    public void setSerologiaCmvIgm3t(String serologiaCmvIgm3t) {
        this.serologiaCmvIgm3t = serologiaCmvIgm3t;
    }

    public String getSerologiaVdrlTratCompleto() {
        return serologiaVdrlTratCompleto;
    }

    public void setSerologiaVdrlTratCompleto(String serologiaVdrlTratCompleto) {
        this.serologiaVdrlTratCompleto = serologiaVdrlTratCompleto;
    }

    public String getSerologiaVdrl1t() {
        return serologiaVdrl1t;
    }

    public void setSerologiaVdrl1t(String serologiaVdrl1t) {
        this.serologiaVdrl1t = serologiaVdrl1t;
    }

    public String getSerologiaVdrl2t() {
        return serologiaVdrl2t;
    }

    public void setSerologiaVdrl2t(String serologiaVdrl2t) {
        this.serologiaVdrl2t = serologiaVdrl2t;
    }

    public String getSerologiaVdrl3t() {
        return serologiaVdrl3t;
    }

    public void setSerologiaVdrl3t(String serologiaVdrl3t) {
        this.serologiaVdrl3t = serologiaVdrl3t;
    }

    public String getSerologiaTestAvidez() {
        return serologiaTestAvidez;
    }

    public void setSerologiaTestAvidez(String serologiaTestAvidez) {
        this.serologiaTestAvidez = serologiaTestAvidez;
    }

    public String getSerologiaCmvIgg1t() {
        return serologiaCmvIgg1t;
    }

    public void setSerologiaCmvIgg1t(String serologiaCmvIgg1t) {
        this.serologiaCmvIgg1t = serologiaCmvIgg1t;
    }

    public String getSerologiaCmvIgg2t() {
        return serologiaCmvIgg2t;
    }

    public void setSerologiaCmvIgg2t(String serologiaCmvIgg2t) {
        this.serologiaCmvIgg2t = serologiaCmvIgg2t;
    }

    public String getSerologiaCmvIgg3t() {
        return serologiaCmvIgg3t;
    }

    public void setSerologiaCmvIgg3t(String serologiaCmvIgg3t) {
        this.serologiaCmvIgg3t = serologiaCmvIgg3t;
    }

    public String getSerologiaVhb1t() {
        return serologiaVhb1t;
    }

    public void setSerologiaVhb1t(String serologiaVhb1t) {
        this.serologiaVhb1t = serologiaVhb1t;
    }

    public String getSerologiaVhb2t() {
        return serologiaVhb2t;
    }

    public void setSerologiaVhb2t(String serologiaVhb2t) {
        this.serologiaVhb2t = serologiaVhb2t;
    }

    public String getSerologiaVhb3t() {
        return serologiaVhb3t;
    }

    public void setSerologiaVhb3t(String serologiaVhb3t) {
        this.serologiaVhb3t = serologiaVhb3t;
    }
}
