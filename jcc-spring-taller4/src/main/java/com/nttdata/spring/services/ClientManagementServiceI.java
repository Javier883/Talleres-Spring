package com.nttdata.spring.services;

import java.util.List;

import com.nttdata.spring.persistence.Client;
/**
 * 
 * @author Campos
 *
 */
public interface ClientManagementServiceI {
	
	/**
	 * Insertar nuevo cliente
	 * @param newClient
	 */
	public void insertNewClient(final Client newClient);
	/**
	 * Actualizar cliente
	 * @param updatedClient
	 */
	public void updateClient(final Client updatedClient);
	/**
	 * Borrar cliente
	 * @param deletedClient
	 */
	public void deleteClient(final Client deletedClient);
    /**
     * Buscar por ID
     * @param idClient
     * @return
     */
	public Client searchById(final Long idClient);
	/**
	 * Obtener todos los clientes
	 * @return
	 */
	public List<Client> searchAll();
	/**
	 * Buscar por nombre
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
