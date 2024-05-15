package lk.garment.JBC.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static DBConnection dbConnection;
    private Connection connection;

    public DBConnection() throws ClassNotFoundException, SQLException {
       Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost/garment", "root", "1234");
    }
    public Connection getConnection(){
        return connection;
    }
    public DBConnection getDbConnection() throws SQLException, ClassNotFoundException {
        if (dbConnection==null){
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }
}