package com.module2.Business;


import com.module1.Repository.AuteursRepository;
import org.springframework.stereotype.Service;


@Service
public class AuteursBusiness {

    public AuteursBusiness(AuteursRepository crudHandler) {
        this.crudHandler = crudHandler;
    }

    private AuteursRepository crudHandler;

    public AuteursRepository getCrudHandler() {
        return crudHandler;
    }
}
