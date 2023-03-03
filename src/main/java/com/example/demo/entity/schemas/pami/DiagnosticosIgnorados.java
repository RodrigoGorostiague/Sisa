package com.example.demo.entity.schemas.pami;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "diagnosticos_ignorados", schema = "pami")
public class DiagnosticosIgnorados {
    @Id
    private String codigo;
    @Column(name = "tiponomenclador")
    private String tipoNomenclador;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipoNomenclador() {
        return tipoNomenclador;
    }

    public void setTipoNomenclador(String tipoNomenclador) {
        this.tipoNomenclador = tipoNomenclador;
    }
}
