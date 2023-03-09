package com.example.demo.entity.schemas.admSistema;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name = "arbolmenuraiz", schema = "admsistema")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class ArbolMenuRaiz extends ArbolMenu{
}
