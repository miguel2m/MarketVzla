/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marketvzla.principal;

//import marketvenezuela.controlador.LoginController;

import marketvzla.Controlador.LoginController;
import marketvzla.Vista.LoginVista;

//import marketvenezuela.modelo.Lugar;

//import marketvenezuela.vista.LoginVista;

/**
 *
 * @author migue
 */
public class MaketVenezuelaPrincipal {
    
    //private static LoginController loginController;
    //private static LoginVista loginVista;
    public static void main(String[] args) {
        
        
      /* try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }*/
            
            PrincipalModel.InicirarPrincipalModel("postgres","1234","marketvenezuela","localhost:5432");
            //Lugar.llenarLugares();
            
            LoginVista loginVista = new LoginVista();
           LoginController loginController = new LoginController(loginVista);
            loginVista.setLoginController(loginController);
            loginVista.MustraLogin();
            
       /* } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
    }
}
