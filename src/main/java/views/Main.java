/*
 *Este es un login básico conectado a una base de datos,
  donde si este evalúa que si el usuario y la contraseña
  que están en la base de datos son correctas,
  entonces nos mostrará una ventana de bienvenida.
 */
package views;

import models.ConexionBD;
/**
 *
 * @author Edwin Ropain Espinosa
 */
public class Main {

    public static void main(String[] args) {
        
        Login miLogin = new Login();
        miLogin.setVisible(true);
        
    }
}