package model;
import java.sql.*;
 
public class baza {

	public static final String DRIVER = "org.sqlite.JDBC";
    public static final String DB_URL = "jdbc:sqlite:baza.db";
    Connection conn;
    public Statement stat;

    public baza() {
        try {
            Class.forName(baza.DRIVER);
        } catch (ClassNotFoundException e) {
        	System.err.println("Brak pliku JDBC");
            System.exit(0);
        }
 
        try {
            conn = DriverManager.getConnection(DB_URL);
            stat = conn.createStatement();
        } catch (SQLException e) {
            System.err.println("Problem z otwarciem polaczenia");
            e.printStackTrace();
        }
 
  
        
    }
    

}
