package com.example.demo.entity.schemas.cistoscopias;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "cistoscopias")
public class AnestesistaCisto {
    @EmbeddedId
    private AnestesistaCistoPK id;

    public AnestesistaCistoPK getId() {
        return id;
    }

    public void setId(AnestesistaCistoPK id) {
        this.id = id;
    }
}
