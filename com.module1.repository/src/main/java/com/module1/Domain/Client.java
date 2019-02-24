package com.module1.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor

public class Client {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    long id;
    String prenom;

    public Client() {
    }

    public Client(String prenom, String nom, String adressee) {
        this.prenom = prenom;
        this.nom = nom;
        this.adressee = adressee;
    }

    String nom;
    String adressee;




    @OneToMany(mappedBy = "client")
    List<Commande> commandes;
    @OneToMany(mappedBy = "client")
    List<CarteBancaire> cartesbancaires;

    @Override
    public String toString(){
        return("--id:--"+this.id+"--nom:--"+this.nom+"--prenom:--"+this.prenom);
    }

}
