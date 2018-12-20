package com.module1.Domain;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data ;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor


@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
public class Auteur {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    long id;
    String nomcomplet;
    //eliminate circular recursion when sending json

    @ManyToMany(mappedBy = "auteurs")
    List<Livre> livres;

}

