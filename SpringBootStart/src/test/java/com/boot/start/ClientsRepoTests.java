//package com.boot.start;
//
//import com.module1.Domain.Client;
//import com.module1.Repository.ClientsRepository;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class ClientsRepoTests {
//
//
//    @Autowired
//	private ClientsRepository cr;
//    Client c1;
//    Client c2;
//    @Before
//    public void setUp(){
//        c1 = new Client("salah", "ben salah", "Beja");
//        c2 = new Client("sarah", "ben samara", "Monastir");
//        cr.save(c1);
//        cr.save(c2);
//    }
//	@Test
//	public void contextLoads() {
//        assertThat(cr.findByNomAndPrenom("ben salah","salah")).isNotNull();
//        assertThat(cr.findByNomAndPrenom("ben samara","sarah")).isNotNull();
//
//	}
//
//	@After
//    public void shutDown(){
//	    cr.delete(c1);
//        cr.delete(c2);
//    }
//}
