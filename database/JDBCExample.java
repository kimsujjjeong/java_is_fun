package homework;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCExample {


	
	    public static void main(String[] args) {
	        Connection connection = null;
	        Statement statement = null;
	        ResultSet resultSet = null;

	        try {
	            // Registering the JDBC driver
	            Class.forName("oracle.jdbc.driver.OracleDriver");

	            // Establishing the connection
	            
	            String databaseName = "Database_NAME";
	            String userName = "Database_USER";
	            String password = "Database_password";
	            String port = "port number";
	            String host = "database server IP";
	            
	            String url = "jdbc:oracle:thin:@"+host+":"+port+":"+databaseName; // Replace with your URL
	            
	            connection = DriverManager.getConnection(url, userName, password);
	            

	            // Creating a statement
	            statement = connection.createStatement();

	            // Executing a query
	            String sqlQuery = "SELECT * FROM your_table_name";
	            resultSet = statement.executeQuery(sqlQuery);

	            // Processing the result set
	            while (resultSet.next()) {
	                // Retrieve by column name
	                int id = resultSet.getInt("id");
	                String name = resultSet.getString("name");
	                // Print the results
	                System.out.println("ID: " + id + ", Name: " + name);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        } finally {
	            // Closing resources
	            try {
	                if (resultSet != null) resultSet.close();
	                if (statement != null) statement.close();
	                if (connection != null) connection.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}



