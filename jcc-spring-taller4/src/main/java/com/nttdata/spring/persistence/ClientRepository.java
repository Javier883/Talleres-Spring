package com.nttdata.spring.persistence;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * Repositorio Cliente con todos los métodos que se piden
 * @author Campos
 *
 */
@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{
	/**
	 * Buscar cliente por ID
	 * @param idClient
	 * @return Client
	 */
	public Client findByIdClient(Long idClient);
	/**
	 * 
	 * Buscar cliente por Nombre
	 * @param name
	 * @return List<Client>
	 */
	public List<Client> findByName(String name);
	/**
	 * Buscar cliente por nombre y apellidos
	 * @param name
	 * @param firstName
	 * @param secondName
	 * @return List<Client>
	 */
	public List<Client> findByNameAndFirstNameAndSecondName(String name, String firstName, String secondName);
	
}
