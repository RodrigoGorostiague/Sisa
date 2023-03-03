package com.example.demo.entity.schemas.historialInternacion;

import com.example.demo.entity.schemas.resapro.CodServicio;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(schema = "hisotrialinternacion", name = "filtromedicamentos")
public class FiltroMedicamentos {
    @Id
    @Column(name = "id_filtro")
    private Integer idFiltro;
    @Column(name = "codigouniat")
    private String codigoUniat;
    @ManyToOne
    @JoinColumn(name = "codigoservicio", referencedColumnName = "cod_servicio")
    private CodServicio codServicio;
    @Column(name = "codigoclase")
    private Integer codigoClase;
    private Integer item;

    public Integer getIdFiltro() {
        return idFiltro;
    }

    public void setIdFiltro(Integer idFiltro) {
        this.idFiltro = idFiltro;
    }

    public String getCodigoUniat() {
        return codigoUniat;
    }

    public void setCodigoUniat(String codigoUniat) {
        this.codigoUniat = codigoUniat;
    }

    public CodServicio getCodServicio() {
        return codServicio;
    }

    public void setCodServicio(CodServicio codServicio) {
        this.codServicio = codServicio;
    }

    public Integer getCodigoClase() {
        return codigoClase;
    }

    public void setCodigoClase(Integer codigoClase) {
        this.codigoClase = codigoClase;
    }

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }
}
