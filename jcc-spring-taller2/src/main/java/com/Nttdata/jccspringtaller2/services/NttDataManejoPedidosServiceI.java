package com.Nttdata.jccspringtaller2.services;

import java.util.List;

import com.Nttdata.jccspringtaller2.persistence.Pedido;
import com.Nttdata.jccspringtaller2.persistence.Producto;

public interface NttDataManejoPedidosServiceI {
	
	public void addOrder(Pedido order, Producto... products);

	public List<Pedido> buscarPedidos();

}
