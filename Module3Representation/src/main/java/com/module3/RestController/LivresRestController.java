package com.module3.RestController;



import com.module1.Domain.Auteur;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import com.module1.Domain.Livre;
import com.module1.Repository.LivresRepository;


@RestController()
@RequestMapping("livres")
public class LivresRestController {

    private LivresRepository repository;

    public LivresRestController(LivresRepository repository) {
        this.repository = repository;
    }


    @GetMapping()
    public List<Livre> tousLesLivres() {
        return (List)repository.findAll();
    }


    @GetMapping(path= "/{id}" )
    public  ResponseEntity<Livre> findById(@PathVariable("id") String id) {
        Optional<Livre> resultat =  repository.findById(Long.valueOf(id));
        if (resultat.isPresent()){
            Livre lt = resultat.get();
            List<Auteur> la =lt.getAuteurs();
            for(Auteur u : la)
            {
                u.getLivres().set(0, null);
            }
            return new ResponseEntity<>(resultat.get(), HttpStatus.OK);
        }

        else
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }



    @PostMapping
    public ResponseEntity<Livre> create(@RequestBody Livre l){
        try {
            repository.save(l);
            return new ResponseEntity<Livre>(l, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<Livre>(HttpStatus.NOT_ACCEPTABLE);
        }
    }

    @PutMapping
    public  ResponseEntity<Livre> update(@RequestBody Livre l){

        try {
            repository.save(l);
            return new ResponseEntity<>(l, HttpStatus.ACCEPTED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }

    }


    @DeleteMapping(path= "/{id}" )
    public  ResponseEntity<Livre> deleteById(@PathVariable("id") String id) {
        Optional<Livre> resultat =  repository.findById(Long.valueOf(id));
        if (resultat.isPresent()) {
            repository.delete(resultat.get());
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        }

        else
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
    }


}
