/**
 * 
 */
package fr.tbr.iamcore.service.dao;

import java.util.Collection;

import fr.tbr.iamcore.datamodel.Identity;
import fr.tbr.iamcore.exception.DAOSaveException;
import fr.tbr.iamcore.exception.DAOSearchException;
import fr.tbr.iamcore.exception.DAOUpdateException;

/**
 * @author tbrou
 *
 */
public interface IdentityDAOInterface {
	
	/**
	 * This method is able to save an identity into a file
	 * 
	 * @param identity
	 * @throws DAOSaveException 
	 */
	public void save(Identity identity) throws DAOSaveException;

	public Collection<Identity> search(Identity criteria)  throws DAOSearchException ;


	public void update(Identity identityToUpdate)  throws  DAOUpdateException;

	public void delete(Identity identityToDelete)  throws DAODeleteException;
	
	
	
//	public Identity getIdentity(int identityId);
	 
	public Collection<Identity> readAllusers(Identity criteria)  throws DAOSearchException ;
	
	public boolean authenticate(String username, String password);
	
	public Collection<Identity> getIden(long Identityid)  throws DAOSearchException ;
	


}
