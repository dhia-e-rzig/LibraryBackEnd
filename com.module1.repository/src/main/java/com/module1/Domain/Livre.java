package com.module1.Domain;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor


@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
public class Livre {

    @Id
//    @GeneratedValue(strategy=GenerationType.IDENTITY)
    long id;
    String nom;
    String anneedepublication;
    //eliminate circular recursion when sending json

    @ManyToMany

    List<Auteur> auteurs;

    double prix;

    @ManyToOne
    Promotion promotion;


// getter and setter necessary for json , else use lombok
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getNom() {
//        return nom;
//    }
//
//    public void setNom(String nom) {
//        this.nom = nom;
//    }
//
//    public String getAnneedepublication() {
//        return anneedepublication;
//    }
//
//    public void setAnneedepublication(String anneedepublication) {
//        this.anneedepublication = anneedepublication;
//    }
//
//    public Set<Auteur> getAuteurs() {
//        return auteurs;
//    }
//
//    public void setAuteurs(Set<Auteur> auteurs) {
//        this.auteurs = auteurs;
//    }
//
//    public double getPrix() {
//        return prix;
//    }
//
//    public void setPrix(double prix) {
//        this.prix = prix;
//    }
//
//    public Set<Livre> getPromotion() {
//        return promotion;
//    }
//
//    public void setPromotion(Set<Livre> promotion) {
//        this.promotion = promotion;
//    }

    @Override
    public String toString() {
        return ("id--"+this.id+"--nom--"+this.nom+"--annee--"+this.anneedepublication+"--prix--"+this.prix);
    }


}
