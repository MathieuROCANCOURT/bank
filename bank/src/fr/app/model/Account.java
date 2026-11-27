/**
 * 
 */
package fr.app.model;

/**
 * 
 */
public class Account {
	private int id;
	private int number;
	private float amount;
	private boolean saving;

	/**
	 * @param id
	 * @param number
	 * @param amount
	 * @param saving
	 */
	public Account(int id, int number, float amount, boolean saving) {
		this.id = id;
		this.number = number;
		this.amount = amount;
		this.saving = saving;
	}

	@Override
	public String toString() {
		return "Account [number=" + number + ", amount=" + amount + ", saving=" + saving + "]";
	}
}