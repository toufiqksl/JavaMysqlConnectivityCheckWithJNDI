/**
 * File : Person.java
 *
 * Copyright (C) 2012 - 2013, KONA I Co.Ltd.
 * All rights reserved.
 *
 * This program is a property of KONA I. you can not redistribute it and/or modify it
 * without any permission of KONA I.
 *
 * @author user11
 */
package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author user11
 *
 */
@Entity

@Table(name="PERSON")
public class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID", nullable=false, length=50)
	private String id;
	
	@Column(name="CLIENTNAME", nullable=false, length=255)
	private String name;
	
	@Column(name="DESIGNATION", nullable=false, length=255)
	private String designation;
	
	@Column(name="SALARY", nullable=false, length=255)
	private String salary;
	
	public Person(){
		
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * @return the salary
	 */
	public String getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	
}
