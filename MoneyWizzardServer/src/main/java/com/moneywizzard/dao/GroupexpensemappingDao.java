package com.moneywizzard.dao;

import java.util.List;

import com.moneywizzard.model.Groupexpensemapping;
 
/**
 * DAO interface for table: Groupexpensemapping.
 * @author autogenerated
 */
public interface GroupexpensemappingDao extends GenericDAO<Groupexpensemapping,  String>  {

	List<Groupexpensemapping> getByCriteria(Groupexpensemapping groupexpensemapping) throws Exception;
	// constructor only
}

