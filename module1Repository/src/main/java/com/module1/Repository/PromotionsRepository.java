package com.module1.Repository;

import com.module1.Domain.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromotionsRepository extends CrudRepository<Client,Long> {
}
