package com.boot.start;


import com.module1.Domain.CarteBancaire;
import com.module1.Domain.Commande;
import com.module1.Domain.Livre;
import com.module1.Repository.CartesBancairesRepository;
import com.module1.Repository.CommandesRepository;
import com.module1.Repository.LivresRepository;
import com.module2.Business.CommandesBusiness;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommandesBusinessTest {
    @Autowired
    CommandesRepository comr;
    @Autowired
    CartesBancairesRepository cbr;
    @Autowired
    LivresRepository lr;
    @Autowired
    CommandesBusiness comb;
    Commande commande;
    CarteBancaire cb;
    Livre tempL;
    @Before
    public void setUp(){
         tempL = new Livre(66L, "bookish", "0", null, 15, null);
        lr.save(tempL);
        ArrayList<Livre> arl = new ArrayList<>();
        arl.add(tempL);
        cb = new CarteBancaire(5L, "444", "0", "Nowhere", null, 20);
        cbr.save(cb);
        commande = new Commande(55L, arl,  cb, null, false);
        comr.save(commande);
    }

    @Test
    public void commandini() {
        assertThat(comb.passerCommande(commande)).isTrue();
        System.out.println(cbr.findById(5L).get().getSolde());
        assertThat(cbr.findById(5L).get().getSolde()).isEqualTo(5);

    }

    @After
    public void shutDown(){
        comr.delete(commande);
        cbr.delete(cb);
        lr.delete(tempL);
    }

}
