package com.nttdata.jccspringtaller1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.jccspringtaller1.persistence.NttdataPersona;
import com.nttdata.jccspringtaller1.services.NttdataManejoEdificioServiceI;



@SpringBootApplication
public class JccSpringTaller1Application implements CommandLineRunner{
	
	@Autowired
	private NttdataManejoEdificioServiceI servicio;

	public static void main(String[] args) {
		SpringApplication.run(JccSpringTaller1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		NttdataPersona p1 = new NttdataPersona();
		NttdataPersona p2 = new NttdataPersona();
		
		p1.setNombre("Andrés");
		p1.setApellido("MedioMetro");
		
		p2.setNombre("Guaka");
		p2.setApellido("Cumple");
		
		servicio.insert(p1);
		servicio.insert(p2);
		
		System.out.println(servicio.showPersonas());
		
		servicio.searchPersona("Andrés", "MedioMetro").forEach(System.out::println);
		servicio.searchPersona("Guaka", "Cumple").forEach(System.out::println);
		
	}

}
