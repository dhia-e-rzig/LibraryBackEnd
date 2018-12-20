package com.module2.Business;

import com.module1.Repository.*;
import org.springframework.stereotype.Service;


@Service
public class CartesBancairesBusiness {

    public CartesBancairesBusiness(CartesBancairesRepository crudHandler) {
        this.crudHandler = crudHandler;
    }

    private CartesBancairesRepository crudHandler;

    public CartesBancairesRepository getCrudHandler() {
        return crudHandler;
    }
}
