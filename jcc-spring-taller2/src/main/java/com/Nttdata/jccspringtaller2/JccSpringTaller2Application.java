package com.Nttdata.jccspringtaller2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Nttdata.jccspringtaller2.persistence.Pedido;
import com.Nttdata.jccspringtaller2.persistence.Producto;
import com.Nttdata.jccspringtaller2.services.NttDataManejoPedidosNoPeninsulaServiceImpl;
import com.Nttdata.jccspringtaller2.services.NttDataManejoPedidosPeninsulaServiceImpl;

@SpringBootApplication
public class JccSpringTaller2Application implements CommandLineRunner{

	/* Service Peninsula */
	@Autowired
	@Qualifier("peninsula")
	NttDataManejoPedidosPeninsulaServiceImpl peninsula;
	/* Service No Peninsula */
	@Autowired
	@Qualifier("noPeninsula")
	NttDataManejoPedidosNoPeninsulaServiceImpl noPeninsula;
	
	public static void main(String[] args) {
		SpringApplication.run(JccSpringTaller2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Pedido order1 = new Pedido();
		Pedido order2 = new Pedido();
		Pedido order3 = new Pedido();
		Producto p1 = new Producto();
		Producto p2 = new Producto();
		Producto p3 = new Producto();
		
		order1.setID(1);
		order1.setPeninsula(true);
		order1.setDireccion("EnMedio");
		order1.setDestinatario("Javier");
		
		order2.setID(2);
		order2.setPeninsula(false);
		order2.setDireccion("PitufoAldea");
		order2.setDestinatario("Andres");
		
		order3.setID(1);
		order3.setPeninsula(true);
		order3.setDireccion("BitcoinLand");
		order3.setDestinatario("Esmerado");
		
		p1.setID(1);
		p1.setNombre("play6");
		p1.setPrecio(1000);
		
		p2.setID(2);
		p2.setNombre("zbox");
		p2.setPrecio(30);
		
		p3.setID(3);
		p3.setNombre("nintendo2");
		p3.setPrecio(100000);
		
		peninsula.addOrder(order1,p2 );
		peninsula.addOrder(order2, p1);
		noPeninsula.addOrder(order3, p3);
		
		peninsula.buscarPedidos().forEach(System.out::println);
	}

}
