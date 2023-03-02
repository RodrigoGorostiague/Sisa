package com.example.demo.entity.schemas.admSistema;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "admsistema", name = "modulohc")
public class ModuloHC {
    @Id
    @Column(name = "modhc")
    private String moduloHc;
    @Column(name = "mombrehc")
    private String mombreHc;
    private String inclestcob;

    public String getModuloHc() {
        return moduloHc;
    }

    public void setModuloHc(String moduloHc) {
        this.moduloHc = moduloHc;
    }

    public String getMombreHc() {
        return mombreHc;
    }

    public void setMombreHc(String mombreHc) {
        this.mombreHc = mombreHc;
    }

    public String getInclestcob() {
        return inclestcob;
    }

    public void setInclestcob(String inclestcob) {
        this.inclestcob = inclestcob;
    }
}
