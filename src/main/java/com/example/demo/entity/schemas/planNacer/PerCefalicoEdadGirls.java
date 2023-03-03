package com.example.demo.entity.schemas.planNacer;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "percefalicoedadgirls", schema = "plannacer")
public class PerCefalicoEdadGirls {
    @Id
    private Integer meses;
    private Double z0;
    private Double z_1;

    public Integer getMeses() {
        return meses;
    }

    public void setMeses(Integer meses) {
        this.meses = meses;
    }

    public Double getZ0() {
        return z0;
    }

    public void setZ0(Double z0) {
        this.z0 = z0;
    }

    public Double getZ_1() {
        return z_1;
    }

    public void setZ_1(Double z_1) {
        this.z_1 = z_1;
    }
}
