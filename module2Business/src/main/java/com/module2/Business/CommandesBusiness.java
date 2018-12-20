package com.module2.Business;

import com.module1.Domain.CarteBancaire;
import com.module1.Domain.Commande;
import com.module1.Domain.Livre;
import com.module1.Repository.CartesBancairesRepository;
import com.module1.Repository.CommandesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CommandesBusiness {

    public CommandesBusiness(CommandesRepository crudHandler) {
        this.crudHandler = crudHandler;
    }

    private CommandesRepository crudHandler;

    public CommandesRepository getCrudHandler() {
        return crudHandler;
    }
    @Autowired
    CartesBancairesRepository cbr;

    public boolean passerCommande(Commande commande)
    {   //TODO  Test
        float soldeTotal=0;
        for(Livre l : commande.getLivres())
            if (l.getPromotion() != null)
            {soldeTotal += l.getPrix() * l.getPromotion().getFacteurRemise();}
            else
                {soldeTotal += l.getPrix();}

        if(commande.getCb().getSolde()> soldeTotal){
            CarteBancaire cbtemp = commande.getCb() ;
            cbtemp.setSolde(commande.getCb().getSolde()-soldeTotal);
            cbr.save(cbtemp);
            commande.setCommandee(Boolean.TRUE);
            return true;
        }
        else {
            return false;
        }


    }
}
