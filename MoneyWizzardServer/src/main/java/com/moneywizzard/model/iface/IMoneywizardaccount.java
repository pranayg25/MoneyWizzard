package com.moneywizzard.model.iface;

import com.moneywizzard.model.Person;

/** 
 * Object interface mapping for hibernate-handled table: moneywizardaccount.
 * @author autogenerated
 */

public interface IMoneywizardaccount {



    /**
     * Return the value associated with the column: accountbalance.
	 * @return A Double object (this.accountbalance)
	 */
	Double getAccountbalance();
	

  
    /**  
     * Set the value related to the column: accountbalance.
	 * @param accountbalance the accountbalance value you wish to set
	 */
	void setAccountbalance(final Double accountbalance);

    /**
     * Return the value associated with the column: id.
	 * @return A String object (this.id)
	 */
	String getId();
	

  
    /**  
     * Set the value related to the column: id.
	 * @param id the id value you wish to set
	 */
	void setId(final String id);

    /**
     * Return the value associated with the column: personid.
	 * @return A Person object (this.personid)
	 */
	Person getPersonid();
	

  
    /**  
     * Set the value related to the column: personid.
	 * @param personid the personid value you wish to set
	 */
	void setPersonid(final Person personid);

	// end of interface
}