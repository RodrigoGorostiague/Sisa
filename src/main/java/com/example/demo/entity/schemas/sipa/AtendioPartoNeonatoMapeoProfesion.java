package com.example.demo.entity.schemas.sipa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "atendiopartoneonatomapeoprofesion", schema = "sipa")
public class AtendioPartoNeonatoMapeoProfesion {
    @Id
    private String codigo;
    @Column(name = "codigoprofesion")
    private Integer codigoProfesion;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigoProfesion() {
        return codigoProfesion;
    }

    public void setCodigoProfesion(Integer codigoProfesion) {
        this.codigoProfesion = codigoProfesion;
    }
}
