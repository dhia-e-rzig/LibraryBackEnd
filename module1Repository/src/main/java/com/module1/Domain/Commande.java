package com.module1.Domain;

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
public class Commande {

    @Id
//    @GeneratedValue(strategy=GenerationType.IDENTITY)
    long id;
    @ManyToMany
    List<Livre> livres;

    @OneToOne
    CarteBancaire cb;
    @ManyToOne
    Client client;

    Boolean commandee;
}
