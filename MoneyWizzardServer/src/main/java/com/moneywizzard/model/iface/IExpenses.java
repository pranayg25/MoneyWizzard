package com.moneywizzard.model.iface;
import com.moneywizzard.model.Expensecategory;
import com.moneywizzard.model.Person;


/** 
 * Object interface mapping for hibernate-handled table: expenses.
 * @author autogenerated
 */

public interface IExpenses {



    /**
     * Return the value associated with the column: amount.
	 * @return A Double object (this.amount)
	 */
	Double getAmount();
	

  
    /**  
     * Set the value related to the column: amount.
	 * @param amount the amount value you wish to set
	 */
	void setAmount(final Double amount);

    /**
     * Return the value associated with the column: expensecategoryid.
	 * @return A Expensecategory object (this.expensecategoryid)
	 */
	Expensecategory getExpensecategoryid();
	

  
    /**  
     * Set the value related to the column: expensecategoryid.
	 * @param expensecategoryid the expensecategoryid value you wish to set
	 */
	void setExpensecategoryid(final Expensecategory expensecategoryid);

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
     * Return the value associated with the column: image.
	 * @return A Byte[] object (this.image)
	 */
	Byte[] getImage();
	

  
    /**  
     * Set the value related to the column: image.
	 * @param image the image value you wish to set
	 */
	void setImage(final Byte[] image);

    /**
     * Return the value associated with the column: location.
	 * @return A String object (this.location)
	 */
	String getLocation();
	

  
    /**  
     * Set the value related to the column: location.
	 * @param location the location value you wish to set
	 */
	void setLocation(final String location);

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