package com.ipi.web.model;

import org.springframework.data.mongodb.core.mapping.Field;

public class Membre {

    /** Attributes **/
    @Field("mem_nom")
    private String nom;

    @Field("mem_prenom")
    private String prenom;

    @Field("mem_pays")
    private String nationalite;

    @Field("mem_inst")
    private String instrument;

    @Field("mem_debut")
    private String debut;

    @Field("mem_fin")
    private String fin;

    /** Getters / Setters **/
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

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public String getDebut() {
        return debut;
    }

    public void setDebut(String debut) {
        this.debut = debut;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    /** Methods **/
    @Override
    public String toString() {
        return "Membre{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nationalite='" + nationalite + '\'' +
                ", instrument='" + instrument + '\'' +
                ", debut='" + debut + '\'' +
                ", fin='" + fin + '\'' +
                '}';
    }
}
