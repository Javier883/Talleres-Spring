package com.Nttdata.jccspringtaller2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.Nttdata.jccspringtaller2.persistence.Pedido;
import com.Nttdata.jccspringtaller2.persistence.PedidoDaoImpl;
import com.Nttdata.jccspringtaller2.persistence.Producto;

public abstract class NttDataManejoPedidosServiceAbstract implements NttDataManejoPedidosServiceI{
	
	@Autowired
	public PedidoDaoImpl pedidoDataB;
/**
 * Abstract add a new order
 */
	@Override
	public abstract void addOrder(Pedido order, Producto... products);
	
		
	/**
	 * 	Search all order
	 */
	@Override
	public List<Pedido> buscarPedidos() {
	return pedidoDataB.getPedidos();
	}
	
	

}
