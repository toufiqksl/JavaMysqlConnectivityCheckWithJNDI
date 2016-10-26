/**
 * File : PersonController.java
 *
 * Copyright (C) 2012 - 2013, KONA I Co.Ltd.
 * All rights reserved.
 *
 * This program is a property of KONA I. you can not redistribute it and/or modify it
 * without any permission of KONA I.
 *
 * @author user11
 */
package controller;

import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entity.Person;
import manager.PersonManager;

@ManagedBean(name="PersonController")
@SessionScoped

/**
 * @author user11
 *
 */
public class PersonController {
	@EJB
	private PersonManager personManager;
	
	private Person person;
	private List<Person> personList;

	/**
	 * @return the person
	 */
	public Person getPerson() {
		return person;
	}

	/**
	 * @param person the person to set
	 */
	public void setPerson(Person person) {
		this.person = person;
	}

	/**
	 * @return the personList
	 */
	public List<Person> getPersonList() {
		return personList;
	}

	/**
	 * @param personList the personList to set
	 */
	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}
	
	public String createAction() {
		System.out.print("test");
		person = new Person();
		person.setId("4");
		person.setName("jasim");
		person.setDesignation("Test");
		person.setSalary("2000");
		
		System.out.println("Id is :" + person.getId());
		System.out.println("Name is :" + person.getName());
		System.out.println("Designation is :" + person.getDesignation());
		System.out.println("Salary is :" + person.getSalary());
		personManager.create(person);
		return null;
	}

}
