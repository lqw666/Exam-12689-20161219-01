package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DatabaseConn {
	public String DBDRIVER = "com.mysql.jdbc.Driver";
	public String DBURL = "jdbc:mysql://localhost/sakila";
	public String DBUSER = "root";
	public String DBPASS = "123456";

private Connection conn = null;


public DatabaseConn(){
	try {
		Class.forName(DBDRIVER);
	} catch (ClassNotFoundException e) {
	}
}


public Connection getConnection(){
	try {
		conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
	} catch (SQLException e) {
	}
	return conn;
}


}

