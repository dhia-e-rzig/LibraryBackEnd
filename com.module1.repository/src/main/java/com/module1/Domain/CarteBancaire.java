package com.module1.Domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldNameConstants;

import javax.persistence.*;

@Entity
@Data

@AllArgsConstructor
@NoArgsConstructor
public class CarteBancaire {
    @Id
//    @GeneratedValue(strategy=GenerationType.IDENTITY)
    long id;

    String Numero;
    String CCV;
    String adresse;

    @ManyToOne
    Client client;

    double solde;
}
