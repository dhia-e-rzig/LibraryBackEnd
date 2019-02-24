package com.module1.Repository;

import com.module1.Domain.CarteBancaire;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartesBancairesRepository extends CrudRepository<CarteBancaire,Long> {
}
