package com.example.demo.entity.schemas.personal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "aux_matricula", schema = "personal")
public class AuxMatricula {
    @Id
    @Column(name = "codigopersonal")
    private String codigoPersonal;
    @Column(name = "nro_matricula_prov")
    private Integer nroMatriculaProv;

    public String getCodigoPersonal() {
        return codigoPersonal;
    }

    public void setCodigoPersonal(String codigoPersonal) {
        this.codigoPersonal = codigoPersonal;
    }

    public Integer getNroMatriculaProv() {
        return nroMatriculaProv;
    }

    public void setNroMatriculaProv(Integer nroMatriculaProv) {
        this.nroMatriculaProv = nroMatriculaProv;
    }
}
