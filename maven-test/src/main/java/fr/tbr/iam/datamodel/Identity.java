/**
 * 
 */
package fr.tbr.iam.datamodel;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author tbrou
 *
 */

@Entity
@Table(name="IDENTITIES")
public class Identity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long index;

	private String uid;
	private String displayName;
	private String email;
	private Date birthDate;
	/**
	 * @return the uid
	 */
	public final String getUid() {
		return uid;
	}
	/**
	 * @param uid the uid to set
	 */
	public final void setUid(String uid) {
		this.uid = uid;
	}
	/**
	 * @return the displayName
	 */
	public final String getDisplayName() {
		return displayName;
	}
	/**
	 * @param displayName the displayName to set
	 */
	public final void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	/**
	 * @return the email
	 */
	public final String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public final void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the birthDate
	 */
	public final Date getBirthDate() {
		return birthDate;
	}
	/**
	 * @param birthDate the birthDate to set
	 */
	public final void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	/**
	 * @return the index
	 */
	public final long getIndex() {
		return index;
	}
	/**
	 * @param index the index to set
	 */
	public final void setIndex(long index) {
		this.index = index;
	}
	
	
	

}
