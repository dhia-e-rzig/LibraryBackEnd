package com.module1.Repository;

import com.module1.Domain.Livre;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivresRepository extends CrudRepository<Livre,Long> {

}
