package com.module2.Business;

import com.module1.Repository.ClientsRepository;
import com.module1.Repository.LivresRepository;
import org.springframework.stereotype.Service;


@Service
public class LivresBusiness {

    public LivresBusiness(LivresRepository crudHandler) {
        this.crudHandler = crudHandler;
    }

    private LivresRepository crudHandler;

    public LivresRepository getCrudHandler() {
        return crudHandler;
    }
}
