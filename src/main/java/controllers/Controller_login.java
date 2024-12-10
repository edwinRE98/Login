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
            String consulta = "SELECT * FROM tb_usuarios WHERE tb_usuarios.usuario = (?) AND tb_usuarios.clave = (?)";
            PreparedStatement ps = miConexionBD.EstablecerConexion().prepareStatement(consulta);

            //Convertimos el tipo de dato JPasswordField a cadena de texto.
            String claveCadena = String.valueOf(clave.getPassword());

            //Capturamos los datos obtenidos de los parámetros.
            ps.setString(1, usuario.getText());
            ps.setString(2, claveCadena);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                Main miPrincipal = new Main();
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
