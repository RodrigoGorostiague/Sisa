package com.example.demo.entity.schemas.historialAmbulatorio;

import com.example.demo.entity.schemas.personal.Personal;
import jakarta.persistence.*;

@Entity
@Table(name = "perfilusuario", schema = "historialambulatorio")
public class PerfilUsuarioAmb {
    @Id
    @OneToOne
    @JoinColumn(name = "usuario", referencedColumnName = "codigopersonal")
    private Personal personal;
    @Column(name = "evolunica")
    private String evolUnica;
    @Column(name = "autpiediabetico")
    private String autPieDiabetico;

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public String getEvolUnica() {
        return evolUnica;
    }

    public void setEvolUnica(String evolUnica) {
        this.evolUnica = evolUnica;
    }

    public String getAutPieDiabetico() {
        return autPieDiabetico;
    }

    public void setAutPieDiabetico(String autPieDiabetico) {
        this.autPieDiabetico = autPieDiabetico;
    }
}
