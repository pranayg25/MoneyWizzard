package com.moneywizzard.dao;

import java.util.List;

import com.moneywizzard.model.Person;
 
/**
 * DAO interface for table: Person.
 * @author autogenerated
 */
public interface PersonDao extends GenericDAO<Person,  String>  {

	Person authenticateUser(Person person) throws Exception;
	// constructor only

	List<Person> getByCriteria(Person person) throws Exception;
}
