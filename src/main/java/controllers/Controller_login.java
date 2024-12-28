package controllers;

import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import models.ConexionBD;
import views.Bienvenida;
import views.Main;

public class Controller_login {

    public void ValidarUsuario(JTextField usuario, JPasswordField clave) {
        try {
            ConexionBD miConexionBD = new ConexionBD();
            
            //Unimos la consulta con la conexión
            PreparedStatement cn = miConexionBD.EstablecerConexion().prepareStatement("SELECT * FROM tb_usuarios WHERE tb_usuarios.usuario = (?) AND tb_usuarios.clave = (?)");

            //Convertimos el tipo de dato JPasswordField a cadena de texto.
            String claveEnCadena = String.valueOf(clave.getPassword());

            //Capturamos los datos obtenidos de los parámetros.
            cn.setString(1, usuario.getText());
            cn.setString(2, claveEnCadena);

            ResultSet ejecucionSQL = cn.executeQuery();

            if (ejecucionSQL.next()) {
                Bienvenida miBienvenida = new Bienvenida();
                miBienvenida.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "       Usuario incorrecto");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error, " + e);
        }
    }
}
