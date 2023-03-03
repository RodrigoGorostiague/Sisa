package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historialinternacion", name = "itemmenu1")
public class ItemMenu1 {
    @Id
    @Column(name = "codigoitem")
    private String codigoItem;
    private String link;
    private  String url;
    @Column(name = "qryupd")
    private String querryUpdate;

    public String getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(String codigoItem) {
        this.codigoItem = codigoItem;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getQuerryUpdate() {
        return querryUpdate;
    }

    public void setQuerryUpdate(String querryUpdate) {
        this.querryUpdate = querryUpdate;
    }
}
