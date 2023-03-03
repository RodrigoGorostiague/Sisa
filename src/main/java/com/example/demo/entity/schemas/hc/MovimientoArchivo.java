package com.example.demo.entity.schemas.hc;

import com.example.demo.entity.schemas.organizacion.Area;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(schema = "hc", name = "movimientoarchivo")
public class MovimientoArchivo {
    @EmbeddedId
    private MovimientoArchivoPK id;
    @Column(name = "fechamovimiento")
    private Date fechaMovimiento;
    @ManyToOne
    @JoinColumn(name = "codigoarea", referencedColumnName = "codigoarea")
    private Area area;

    public MovimientoArchivoPK getId() {
        return id;
    }

    public void setId(MovimientoArchivoPK id) {
        this.id = id;
    }

    public Date getFechaMovimiento() {
        return fechaMovimiento;
    }

    public void setFechaMovimiento(Date fechaMovimiento) {
        this.fechaMovimiento = fechaMovimiento;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }
}
