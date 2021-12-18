package com.nttdata.spring.persistence;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
/**
 * 
 * @author Campos
 *
 */


@Entity
@Table(name = "CLIENT")
public class Client implements Serializable{

	/* ATRIBUTOS */
	
	/* ID */
	private static final long serialVersionUID = 1L;
	
	private Long idClient;
	private String name, firstName, secondName, dni;
	private Date birthdate;
	/**
	 * @return idClient
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getIdClient() {
		return idClient;
	}
	/**
	 * @param idClient 
	 */
	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}
	/**
	 * @return name
	 */
	@NotNull
	@NotEmpty
	@Column(name = "NAME", nullable = false)
	public String getName() {
		return name;
	}
	/**
	 * @param name 
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return dni
	 */
	@NotNull
	@NotEmpty
	@Size(min=9,max=9)
	@Column(name = "DNI", nullable = false, unique = true, length = 9)
	public String getDni() {
		return dni;
	}
	/**
	 * @param dni 
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	/**
	 * @return birthdate
	 */
	@Temporal(TemporalType.DATE)
	@NotNull
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	@Column(name = "BIRTHDATE", nullable = true)
	public Date getBirthdate() {
		return birthdate;
	}
	/**
	 * @param birthdate
	 */
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	/**
	 * @return firstName
	 */
	@NotNull
	@NotEmpty
	@Column(name = "FIRST_NAME", nullable = false)
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName 
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return secondName
	 */
	@NotNull
	@NotEmpty
	@Column(name = "SECOND_NAME", nullable = false)
	public String getSecondName() {
		return secondName;
	}
	/**
	 * @param secondName 
	 */
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", name=" + name + ", firstName=" + firstName + ", secondName="
				+ secondName + ", dni=" + dni + ", birthdate=" + birthdate + "]";
	}



	
}
