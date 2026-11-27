/**
 * 
 */
package fr.app.model;

/**
 * 
 */
public class User {
	private int id;
	private int account;
	private String password;
	private String firstname;
	private String lastname;

	/**
	 * @param id
	 * @param account
	 * @param password
	 * @param firstname
	 * @param lastname
	 */
	public User(int id, int account, String password, String firstname, String lastname) {
		this.id = id;
		this.account = account;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", account=" + account + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}
}
