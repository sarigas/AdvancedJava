/**
 * 
 */
package fr.tbr.iamcore.services;

import fr.tbr.iam.datamodel.Identity;

/**
 * @author tbrou
 *
 */
public interface DAO {

	/**
	 * @param identity
	 */
	void save(Identity identity);

	/**
	 * @param identity
	 */
	void update(Identity identity);

	/**
	 * @param identity
	 */
	void delete(Identity identity);
	
	

}
