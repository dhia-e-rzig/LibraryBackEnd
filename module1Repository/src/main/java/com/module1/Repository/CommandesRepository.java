package com.module1.Repository;

import com.module1.Domain.Commande;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandesRepository extends CrudRepository<Commande,Long> {
}
