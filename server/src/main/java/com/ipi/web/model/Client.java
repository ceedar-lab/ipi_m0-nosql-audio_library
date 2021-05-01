package com.ipi.web.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Arrays;

@Document("music")
public class Client {

    /** Attributes **/
    @Id
    @Field("_id")
    private ObjectId id;

    @Field("cli_id")
    private Integer clientId;

    @Field("cli_nom")
    private String nom;

    @Field("cli_prenom")
    private String prenom;

    @Field("cli_adr")
    private String adresse;

    @Field("cli_cps")
    private String codePostal;

    @Field("cli_ville")
    private String ville;

    @Field("cli_email")
    private String mail;

    @Field("cli_dnai")
    private String naissance;

    @Field("cli_albums")
    private Integer[] albums;

    @Field("cli_ca")
    private Integer budget;

    /** Getters / Setters **/
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNaissance() {
        return naissance;
    }

    public void setNaissance(String naissance) {
        this.naissance = naissance;
    }

    public Integer[] getAlbums() {
        return albums;
    }

    public void setAlbums(Integer[] albums) {
        this.albums = albums;
    }

    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    /** Methods **/
    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", clientId=" + clientId +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", codePostal='" + codePostal + '\'' +
                ", ville='" + ville + '\'' +
                ", mail='" + mail + '\'' +
                ", naissance='" + naissance + '\'' +
                ", albums=" + Arrays.toString(albums) +
                ", budget=" + budget +
                '}';
    }
}
