package com.Nttdata.jccspringtaller2.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.Nttdata.jccspringtaller2.persistence.Pedido;
import com.Nttdata.jccspringtaller2.persistence.Producto;



@Service
@Qualifier("noPeninsula")
public class NttDataManejoPedidosNoPeninsulaServiceImpl extends NttDataManejoPedidosServiceAbstract{

	@Override
	public void addOrder(Pedido order, Producto... products) {
		List<Producto> productList = Arrays.asList(products);
		productList.forEach(product	-> product.setPrecioPVP(product.getPrecio() * (1 + 0.04)));
		order.setProducto(productList);
		pedidoDataB.insert(order);
		
	}
	
	
	
	

}
