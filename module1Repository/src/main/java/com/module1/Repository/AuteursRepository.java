package com.module1.Repository;

import com.module1.Domain.Auteur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuteursRepository extends CrudRepository<Auteur,Long> {
}
