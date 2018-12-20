package com.module2.Business;

import com.module1.Repository.ClientsRepository;
import org.springframework.stereotype.Service;



@Service
public class ClientsBusiness {
    public ClientsBusiness(ClientsRepository crudHandler) {
        this.crudHandler = crudHandler;
    }

    private ClientsRepository crudHandler;

    public ClientsRepository getCrudHandler() {
        return crudHandler;
    }
}
