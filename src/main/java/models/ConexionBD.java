package models;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionBD {

    Connection conexion;

    public Connection EstablecerConexion() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_login", "root", "");
            JOptionPane.showMessageDialog(null, "correctoS");
        } catch (ClassNotFoundException | SQLException e) {
            
            JOptionPane.showMessageDialog(null, "        Error de conexión " + e);
        }
        return conexion;
    }
    
    public static void main(String[] args) {
        ConexionBD micConexionBD = new ConexionBD();
        micConexionBD.EstablecerConexion();
    }
}
