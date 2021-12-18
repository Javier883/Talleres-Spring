package com.nttdata.spring;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.spring.persistence.Client;
import com.nttdata.spring.services.ClientManagementServiceI;

/**
 * Clase Main
 * @author Campos
 *
 */
@SpringBootApplication
public class NttDataSpringMain implements CommandLineRunner {

	@Autowired
	private ClientManagementServiceI clientService;
	
	public static void main(String[] args) {
		SpringApplication.run(NttDataSpringMain.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		/** Instanciación objetos cliente*/
		Client client1 = new Client();
		Client client2 = new Client();
		Client client3 = new Client();
		
		/** Setters de atributos*/
		client1.setIdClient(1L);
		client1.setName("María");
		client1.setFirstName("Buena");
		client1.setSecondName("Buenisima");
		client1.setDni("34568210P");
		client1.setBirthdate(new Date(2002,07,07));
		
		client2.setIdClient(2L);
		client2.setName("Andres");
		client2.setFirstName("Ruiz");
		client2.setSecondName("MedioMetro");
		client2.setDni("47562710K");
		client2.setBirthdate(new Date(2021,12,02));
		
		client3.setIdClient(3L);
		client3.setName("D");
		client3.setFirstName("Yei");
		client3.setSecondName("Crus");
		client3.setDni("28984179Q");
		client3.setBirthdate(new Date(1889,04,10));
		
		
		/** Inserción clientes en la BBDD */
		clientService.insertNewClient(client1);
		clientService.insertNewClient(client2);
		clientService.insertNewClient(client3);
		
		
		/** Actualización de los clientes */
		clientService.updateClient(client1);
		clientService.updateClient(client2);
		clientService.updateClient(client3);
		
		
		/** Llamada a los métodos */ 
		System.out.println("\n  INICIO METODOS  \n ");
		
		System.out.println("\n  BUSCAR POR NOMBRE COMPLETO  \n ");
		clientService.searchByFullName("D", "Yei", "Crus").forEach(System.out::println);
		System.out.println("\n  BUSCAR POR ID  \n ");
		System.out.println(clientService.searchById(1L));
		System.out.println("\n  BUSCAR POR NOMBRE  \n ");
		clientService.searchByName("Andres").forEach(System.out::println);
		System.out.println("\n  BUSCAR TODO  \n ");
		clientService.searchAll().forEach(System.out::println);
		
		System.out.println("\n  FIN METODOS  \n ");
	}

}
