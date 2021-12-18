package com.Nttdata.jccspringtaller2.persistence;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;



@Repository
public class PedidoDaoImpl implements PedidoDaoI {
	
private List<Pedido> pedidos;
	
	public PedidoDaoImpl() {
		pedidos = new ArrayList<Pedido>();
	}

	@Override
	public void insert(Pedido pedido) {
		pedidos.add(pedido);
		
	}
	
	public List<Pedido> getPedidos(){
		return pedidos;
	}

}
