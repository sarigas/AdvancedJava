/**
 * 
 */
package fr.tbr.iam;

/**
 * @author tbrou
 *
 */
public class User {
	
	private String firstName;
	private String lastName;
	private String login;
	
	/**
	 * @return the login
	 */
	public final String getLogin() {
		return login;
	}
	/**
	 * @param login the login to set
	 */
	public final void setLogin(String login) {
		this.login = login;
	}
	/**
	 * @return the firstName
	 */
	public final String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public final void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
