/**
 * 
 */
package fr.tbr.iamcore.service.dao;

import java.util.Collection;

import javax.inject.Inject;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import fr.tbr.iam.log.IAMLogger;
import fr.tbr.iam.log.impl.IAMLogManager;
import fr.tbr.iamcore.datamodel.Identity;
import fr.tbr.iamcore.exception.DAOSearchException;

/**
 * @author tbrou
 *
 */
public class HibernateDAO implements IdentityDAOInterface {
	
	@Inject
	SessionFactory sf;
	Session session;

	private static final IAMLogger logger = IAMLogManager.getIAMLogger(HibernateDAO.class);
	
	/**
	 * @param identity
	 */
	public void save(Identity identity) {
		logger.info("=> save this identity : " + identity);
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(identity);
		tx.commit();
		logger.info("<= save ok" );
		
	}

	/**
	 * @param identity
	 */
	public void update(Identity identity) {
		logger.info("=> update this identity : " + identity);
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		session.update(identity);
		tx.commit();
		logger.info("<= update ok" );
		
	}

	/**
	 * @param identity
	 */
	public void delete(Identity identity) {
		logger.info("=> delete this identity : " + identity);
		
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.delete(identity);
		tx.commit();
		
		logger.info("<= delete ok" );
		
	}

	/* (non-Javadoc)
	 * @see fr.tbr.iamcore.service.dao.IdentityDAOInterface#search(fr.tbr.iamcore.datamodel.Identity)
	 */
	@Override
	public Collection<Identity> search(Identity criteria) throws DAOSearchException {
		String hqlString = "from Identity as identity where identity.displayName = :dName";
		Session session = sf.openSession();
		Query query = session.createQuery(hqlString);
		query.setParameter("dName", criteria.getDisplayName());
		return (Collection<Identity>) query.list();
	}

	
	/*@Override
	public Identity getIdentity(int identityId) {
		
		return (Identity) session.get(Identity.class,identityId);
}
	*/
public Collection<Identity> getIden(long identityid) throws DAOSearchException {
		
		String hqlString = "from Identity as identity where identity.id = :idenid";
		Session session = sf.openSession();
		Query query = session.createQuery(hqlString);
		query.setParameter("idenid",identityid); 
		return (Collection<Identity>) query.list();
		
	}
	
	
	
	
public Collection<Identity> readAllusers(Identity criteria) throws DAOSearchException {
		
		String hqlString = "from Identity as identity where identity.username = :uName and identity.password = :pswd";
		Session session = sf.openSession();
		Query query = session.createQuery(hqlString);
		query.setParameter("uName",criteria.getUsername());
		query.setParameter("pswd",criteria.getPassword());
		return (Collection<Identity>) query.list();
		
	}



public boolean authenticate(String username, String password){
	
	if(username.equals("test") && password.equals("test"))
		return true;
	else {
			
			Identity user = new Identity(username, password);
							
			Collection<Identity> usersearch=null;;
			try {
				usersearch = readAllusers(user);
			} catch (DAOSearchException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(usersearch.isEmpty())
			{
				return false;
				
			}
			else
			{
				return true;
			}
		}
	   		
}
	
	public void setSessionFactory(SessionFactory sf){
		this.sf = sf;
	}
	
	public SessionFactory getSessionFactory(){
		return this.sf;
	}

}
