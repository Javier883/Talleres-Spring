package com.nttdata.spring.services;

import java.util.List;

import com.nttdata.spring.persistence.Client;
/**
 * Clase Servicio que controla instancias de Client
 * @author DarknessYamii
 *
 */
public interface ClientManagementServiceI {
	
	
	/**
	 * Insertar nuevo client
	 * @param newClient
	 */
	public void insertNewClient(final Client newClient);
	
	
	/**
	 * Actualizar clientes
	 * @param updatedClient
	 */
	public void updateClient(final Client updatedClient);
	
	/**
	 * Delete client
	 * @param deletedClient
	 */
	public void deleteClient(final Client deletedClient);
	
   /**
    * Buscar cliente ID
    * @param idClient
    * @return
    */
	public Client searchById(final Long idClient);
	 
	/**
	 * Busca todos los clientes
	 * @return
	 */
	public List<Client> searchAll();
	
	/**
	 * Buscar cliente por nombre
	 * @param name
	 * @return
	 */
	public List<Client> searchByName(final String name);
	
	
	/**
	 * Buscar por nombre completo
	 * @param name
	 * @param firstName
	 * @param secondName
	 * @return
	 */
	public List<Client> searchByFullName(String name, String firstName, String secondName);

}
