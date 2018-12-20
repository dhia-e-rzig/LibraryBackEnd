package com.boot.start;


import com.module2.Business.AuteursBusiness;
import com.module2.Business.ClientsBusiness;
import com.module2.Business.LivresBusiness;
import com.module1.Domain.*;
import com.module1.Repository.ClientsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

import java.util.HashSet;

@SpringBootApplication
@EntityScan("com.module1.Domain")
@EnableJpaRepositories("com.module1.Repository")
@ComponentScan("com.module2.Business")
@ComponentScan("com.module3.RestController")
public class Act1Application {

	public static void main(String[] args) {
		SpringApplication.run(Act1Application.class, args);
	}


	@Bean
	public CommandLineRunner demo(ClientsBusiness cb, LivresBusiness lb, AuteursBusiness ab) {
		return (args) -> {
//            cb.getCrudHandler().save(new Client(12,"dhia", "rzig", "somewhere"));
//			Auteur temp = new Auteur(2, "Amdoun", null);
//			ab.getCrudHandler().save(temp);
//			HashSet<Auteur> aa  = new HashSet<>();
//			aa.add(temp);
//
//            lb.getCrudHandler().save(new Livre(45,"Less", "1881",aa, 20.5,null));

            System.out.println(cb.getCrudHandler().findAll());
            System.out.println(lb.getCrudHandler().findAll());
		};
	}
}