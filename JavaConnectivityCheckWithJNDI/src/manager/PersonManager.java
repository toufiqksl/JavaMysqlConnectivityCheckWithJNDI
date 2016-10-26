/**
 * File : PersonManager.java
 *
 * Copyright (C) 2012 - 2013, KONA I Co.Ltd.
 * All rights reserved.
 *
 * This program is a property of KONA I. you can not redistribute it and/or modify it
 * without any permission of KONA I.
 *
 * @author user11
 */
package manager;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import entity.Person;



/**
 * @author user11
 *
 */
@Stateless
public class PersonManager {
	@PersistenceContext(unitName = "MyTest")
    private EntityManager entityManager;
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void create(Person person) {
		entityManager.persist(person);
    }
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void update(Person person) {
		entityManager.merge(person);
    }
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void delete(Person person) {
		Person toBeRemoved = entityManager.merge(person);
	    entityManager.remove(toBeRemoved);
    }
	
	public List<Person> findAll() {
		Query query = entityManager.createQuery("SELECT pr FROM Person pr");
        return query.getResultList();
    }

}
