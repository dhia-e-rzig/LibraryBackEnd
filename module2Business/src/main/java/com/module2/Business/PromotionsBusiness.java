package com.module2.Business;

import com.module1.Repository.AuteursRepository;
import com.module1.Repository.PromotionsRepository;
import org.springframework.stereotype.Service;


@Service
public class PromotionsBusiness {

    public PromotionsBusiness(PromotionsRepository crudHandler) {
        this.crudHandler = crudHandler;
    }

    private PromotionsRepository crudHandler;

    public PromotionsRepository getCrudHandler() {
        return crudHandler;
    }
}
