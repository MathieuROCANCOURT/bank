/**
 * 
 */
package fr.app.model;

import java.util.Date;

/**
 * 
 */
public class Operation {
	private int id;
	private int accountNumber;
	private String typeOp;
	private float amount;
	private Date dateOp;

	/**
	 * @param id
	 * @param accountNumber
	 * @param typeOp
	 * @param amount
	 * @param dateOp
	 */
	public Operation(int id, int accountNumber, String typeOp, float amount, Date dateOp) {
		this.id = id;
		this.accountNumber = accountNumber;
		this.typeOp = typeOp;
		this.amount = amount;
		this.dateOp = dateOp;
	}

}
