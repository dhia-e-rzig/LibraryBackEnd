package com.module1.Domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

class Promotion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    Date dateinit;
    Date datefinal;
    float facteurRemise; // en pourcentage
    @OneToMany(mappedBy = "promotion")
    List<Livre> livres;

}
