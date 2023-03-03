package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historialinternacion", name = "evoluciondiarianeo")
public class EvolucionDiariaNeo {
    @EmbeddedId
    private EvolucionDiariaNeoPK id;
    @Column(name = "incubadoracuna")
    private String incubadoraCuna;
    @Column(name = "aspecto_respiratorio")
    private String aspectoRespiratorio;
    @Column(name = "aspecto_cardiovascular")
    private String aspectoCardiovascular;
    @Column(name = "aspecto_abdominal")
    private String aspectoAbdominal;
    @Column(name = "aspecto_neurologico")
    private String aspectoNeurologico;
    @Column(name = "aspecto_infectologico")
    private String aspectoInfectologico;
    @Column(name = "accesovascular")
    private String accesoVascular;
    @Column(name = "tipoaporte")
    private String tipoAporte;
    @Column(name = "acceso_vascular_percutaneo")
    private Boolean accesoVascularPrcutaneo;
    @Column(name = "dias_acceso_vascular")
    private Integer diasAccesoVascular;
    @Column(name = "aporte_enteral")
    private Boolean aporteEnteral;

    public EvolucionDiariaNeoPK getId() {
        return id;
    }

    public void setId(EvolucionDiariaNeoPK id) {
        this.id = id;
    }

    public String getIncubadoraCuna() {
        return incubadoraCuna;
    }

    public void setIncubadoraCuna(String incubadoraCuna) {
        this.incubadoraCuna = incubadoraCuna;
    }

    public String getAspectoRespiratorio() {
        return aspectoRespiratorio;
    }

    public void setAspectoRespiratorio(String aspectoRespiratorio) {
        this.aspectoRespiratorio = aspectoRespiratorio;
    }

    public String getAspectoCardiovascular() {
        return aspectoCardiovascular;
    }

    public void setAspectoCardiovascular(String aspectoCardiovascular) {
        this.aspectoCardiovascular = aspectoCardiovascular;
    }

    public String getAspectoAbdominal() {
        return aspectoAbdominal;
    }

    public void setAspectoAbdominal(String aspectoAbdominal) {
        this.aspectoAbdominal = aspectoAbdominal;
    }

    public String getAspectoNeurologico() {
        return aspectoNeurologico;
    }

    public void setAspectoNeurologico(String aspectoNeurologico) {
        this.aspectoNeurologico = aspectoNeurologico;
    }

    public String getAspectoInfectologico() {
        return aspectoInfectologico;
    }

    public void setAspectoInfectologico(String aspectoInfectologico) {
        this.aspectoInfectologico = aspectoInfectologico;
    }

    public String getAccesoVascular() {
        return accesoVascular;
    }

    public void setAccesoVascular(String accesoVascular) {
        this.accesoVascular = accesoVascular;
    }

    public String getTipoAporte() {
        return tipoAporte;
    }

    public void setTipoAporte(String tipoAporte) {
        this.tipoAporte = tipoAporte;
    }

    public Boolean getAccesoVascularPrcutaneo() {
        return accesoVascularPrcutaneo;
    }

    public void setAccesoVascularPrcutaneo(Boolean accesoVascularPrcutaneo) {
        this.accesoVascularPrcutaneo = accesoVascularPrcutaneo;
    }

    public Integer getDiasAccesoVascular() {
        return diasAccesoVascular;
    }

    public void setDiasAccesoVascular(Integer diasAccesoVascular) {
        this.diasAccesoVascular = diasAccesoVascular;
    }

    public Boolean getAporteEnteral() {
        return aporteEnteral;
    }

    public void setAporteEnteral(Boolean aporteEnteral) {
        this.aporteEnteral = aporteEnteral;
    }
}
