package com.example.demo.entity.schemas.vacunacion;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;


import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;

@Embeddable
public class RecepcionVacunaLineaPK implements Serializable{
    @Column(name = "fecharemito")
    private Date fecharemito;
    @Column(name = "horaremito")
    private LocalDateTime horaRemito;
    @Column(name = "uniatreceptora")
    private String uniatReceptora;
    @Column(name = "numlinea")
    private Integer numLinea;

    public Date getFecharemito() {
        return fecharemito;
    }

    public void setFecharemito(Date fecharemito) {
        this.fecharemito = fecharemito;
    }

    public LocalDateTime getHoraRemito() {
        return horaRemito;
    }

    public void setHoraRemito(LocalDateTime horaRemito) {
        this.horaRemito = horaRemito;
    }

    public String getUniatReceptora() {
        return uniatReceptora;
    }

    public void setUniatReceptora(String uniatReceptora) {
        this.uniatReceptora = uniatReceptora;
    }

    public Integer getNumLinea() {
        return numLinea;
    }

    public void setNumLinea(Integer numLinea) {
        this.numLinea = numLinea;
    }
}
