/**
 * 
 */
package fr.app.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

/**
 * Create a connection with 'bank' database with MariaDB.
 * 
 * @author RocancourtM
 */
public class DatabaseConnection {
	private static DatabaseConnection instance;
	private final Connection connection;
	/**
	 * URL used to connect to the 'training_sales' database.
	 */
	private static final String URL = "jdbc:mariadb://localhost:3306/bank";
	/**
	 * User used to connect to database.
	 */
	private static final String USER = "root";
	/**
	 * Password used to connect to database.
	 */
	private static final String PASSWORD = System.getProperty("database.password");

	/**
	 * DatabaseConnection Constructor.
	 */
	private DatabaseConnection() throws SQLException, ClassNotFoundException {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			Logger logger = Logger.getAnonymousLogger();
			logger.severe(e.getLocalizedMessage());
		}

		this.connection = DriverManager.getConnection(URL, USER, PASSWORD);
	}

	// point d'accès unique
	public static synchronized DatabaseConnection getInstance() throws ClassNotFoundException, SQLException {
		if (instance == null) {
			instance = new DatabaseConnection();
		}
		return instance;
	}

	/**
	 * Create a connection to 'bank' database.
	 * 
	 * @return A connection with a 'bank' database. SQL statements are
	 *         executed and results are returned within the context of a connection.
	 * @throws SQLException           Error SQL Request or Timeout connection.
	 * @throws ClassNotFoundException The Driver Class isn't found.
	 */
	public Connection getConnection() {
		return this.connection;
	}

	/**
	 * Close connection to 'bank' database.
	 * 
	 * @throws SQLException Error SQL Request or Timeout connection.
	 */
	public void closeConnection() throws SQLException {
		try {
			this.getConnection().close();
		} catch (SQLException e) {
			Logger logger = Logger.getAnonymousLogger();
			logger.severe("Error close connection: " + e.getLocalizedMessage());
		}
	}
}