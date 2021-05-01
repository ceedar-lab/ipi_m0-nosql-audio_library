package com.ipi.web.model;

import org.springframework.data.mongodb.core.mapping.Field;

public class Vente {

    /** Attributes **/
    @Field("ven_cli")
    private Integer clientId;

    @Field("ven_date")
    private String date;

    @Field("ven_priv")
    private Integer prix;

    /** Getters / Setters **/
    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getPrix() {
        return prix;
    }

    public void setPrix(Integer prix) {
        this.prix = prix;
    }

    /** Methods **/
    @Override
    public String toString() {
        return "Vente{" +
                "clientId=" + clientId +
                ", date='" + date + '\'' +
                ", prix=" + prix +
                '}';
    }
}
