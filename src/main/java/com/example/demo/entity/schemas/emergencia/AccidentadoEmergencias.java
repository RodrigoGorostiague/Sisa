package com.example.demo.entity.schemas.emergencia;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(schema = "emergencia", name = "accidentado_emergencias")
public class AccidentadoEmergencias {
    @EmbeddedId
    private AccidentadoEmergenciasPK id;
    @ManyToOne
    @JoinColumn(name = "lugar", referencedColumnName = "codigo")
    private AccidentadoLugar accidentadoLugar;
    @ManyToOne
    @JoinColumn(name = "causa", referencedColumnName = "codigo")
    private AccidentadoCausa accidentadoCausa;
    @ManyToOne
    @JoinColumn(name = "efecto", referencedColumnName = "codigo")
    private AccidentadoEfecto accidentadoEfecto;
    private String observaciones;
    @ManyToMany
    @JoinColumn(name = "lesiones", referencedColumnName = "codigo")
    private List<AccidentadoLesiones> accidentadoLesiones;
    @ManyToOne
    @JoinColumn(name = "usaba", referencedColumnName = "codigo")
    private AccidentadoUsaba accidentadoUsaba;
    @Column(name = "resolucionquirurgica")
    private String resolucionQuirurgica;

    public AccidentadoEmergenciasPK getId() {
        return id;
    }

    public void setId(AccidentadoEmergenciasPK id) {
        this.id = id;
    }

    public AccidentadoLugar getAccidentadoLugar() {
        return accidentadoLugar;
    }

    public void setAccidentadoLugar(AccidentadoLugar accidentadoLugar) {
        this.accidentadoLugar = accidentadoLugar;
    }

    public AccidentadoCausa getAccidentadoCausa() {
        return accidentadoCausa;
    }

    public void setAccidentadoCausa(AccidentadoCausa accidentadoCausa) {
        this.accidentadoCausa = accidentadoCausa;
    }

    public AccidentadoEfecto getAccidentadoEfecto() {
        return accidentadoEfecto;
    }

    public void setAccidentadoEfecto(AccidentadoEfecto accidentadoEfecto) {
        this.accidentadoEfecto = accidentadoEfecto;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public List<AccidentadoLesiones> getAccidentadoLesiones() {
        return accidentadoLesiones;
    }

    public void setAccidentadoLesiones(List<AccidentadoLesiones> accidentadoLesiones) {
        this.accidentadoLesiones = accidentadoLesiones;
    }

    public AccidentadoUsaba getAccidentadoUsaba() {
        return accidentadoUsaba;
    }

    public void setAccidentadoUsaba(AccidentadoUsaba accidentadoUsaba) {
        this.accidentadoUsaba = accidentadoUsaba;
    }

    public String getResolucionQuirurgica() {
        return resolucionQuirurgica;
    }

    public void setResolucionQuirurgica(String resolucionQuirurgica) {
        this.resolucionQuirurgica = resolucionQuirurgica;
    }
}
