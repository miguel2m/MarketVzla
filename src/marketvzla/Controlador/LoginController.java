/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marketvzla.Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import marketvzla.Modelo.LoginModel;
/*import marketvenezuela.modelo.LoginModel;
import marketvenezuela.modelo.PrincipalModel;
import marketvenezuela.modelo.RolPermiso;
*/
import marketvzla.Vista.LoginVista;
//import marketvenezuela.vista.RegistroCliente;


/**
 *
 * @author migue
 */
public class LoginController implements ActionListener{
    
  
   
    private LoginVista vistaLogin;
    

    public LoginController(LoginVista vistaLogin) {
        
        
       
        this.vistaLogin = vistaLogin;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == vistaLogin.jbtnLogin) {
           
           
           if(!vistaLogin.textLoginUsuario.getText().isEmpty())
           {
               String nick=(String)vistaLogin.textLoginUsuario.getText().toUpperCase(),
                       pass=(String)vistaLogin.textLoginPassword.getText().toUpperCase();
             
               LoginModel.ValidarLogin(nick, pass);
                  // RolPermiso.mostrarSession();
               
             
                
           } 
                
        }
        
        if  (e.getSource() == vistaLogin.jbtnRegistrar){
            //Solo NAtural o Juridico
            
            /*RegistroCliente nuevoRegistro = new RegistroCliente ();
            RegistroClienteController nuevoRegistroController = new 
                    RegistroClienteController(nuevoRegistro, vistaLogin);
            nuevoRegistro.setRegistroClienteController(nuevoRegistroController);
            nuevoRegistro.MustraRegisroCliente();
            vistaLogin.setVisible(false);*/
        }
        if(e.getSource() == vistaLogin.jbtnRecuperarPass){
            
        }
        if(e.getSource() == vistaLogin.jbtnSalir){
            LoginModel.SalirLogin();
                vistaLogin.dispose();
		System.exit(0);

        }
    }
    
   
}
