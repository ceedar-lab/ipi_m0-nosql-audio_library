package com.ipi.web.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document("music")
public class Album {

    /** Attributes **/
    @Id
    @Field("_id")
    private ObjectId id;

    @Field("alb_nom")
    private String titre;

    @Field("alb_art")
    private String artiste;

    @Field("alb_annee")
    private Integer annee;

    @Field("alb_prix")
    private Float prix;

    @Field("alb_genre")
    private String genre;

    @Field("alb_pays")
    private String pays;

    @Field("alb_membres")
    public List<Membre> membres;

    @Field("alb_ventes")
    public List<Vente> ventes;

    @Field("alb_image")
    public String image;

    /** Getters / Setters **/
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getArtiste() {
        return artiste;
    }

    public void setArtiste(String artiste) {
        this.artiste = artiste;
    }

    public Integer getAnnee() {
        return annee;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }

    public Float getPrix() {
        return prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public List<Membre> getMembres() {
        return membres;
    }

    public void setMembres(List<Membre> membres) {
        this.membres = membres;
    }

    public List<Vente> getVentes() {
        return ventes;
    }

    public void setVentes(List<Vente> ventes) {
        this.ventes = ventes;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    /** Methods **/
    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", artiste='" + artiste + '\'' +
                ", annee=" + annee +
                ", prix=" + prix +
                ", genre='" + genre + '\'' +
                ", pays='" + pays + '\'' +
                ", membres=" + membres +
                ", ventes=" + ventes +
                ", image='" + image + '\'' +
                '}';
    }
}
