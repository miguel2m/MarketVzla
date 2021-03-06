/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marketvzla.Vista;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo
 */
public class ModificarTienda extends javax.swing.JFrame {

    public ArrayList<String> estados;
    public ArrayList<String> municipios;
    public ArrayList<String> parroquias;
    private static SimpleDateFormat simpleDateFormat;
    
    /**
     * Creates new form ModificarTienda
     */
    public ModificarTienda() {
        initComponents();
        simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        llenarComboBoxDeLugar();
        
    }

    public void llenarComboBoxDeLugar(){
        jComboBox_lugarmunicipio.removeAllItems();
        jComboBox_lugarparroquia.removeAllItems();
        estados = Controlador.ControladorLugar.ConsultarEstados(1);
        int i=1;
        while(i<estados.size())
        {
            jComboBox_lugarestado.addItem(estados.get(i));
            i=i+2;
        }
        i=1;
        while(i<municipios.size())
        {
            jComboBox_lugarmunicipio.addItem(municipios.get(i));
            i=i+2;
        }
        i=1;
        while(i<parroquias.size())
        {
            jComboBox_lugarparroquia.addItem(parroquias.get(i));
            i=i+2;
        }
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_tiendas = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_nombretienda = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox_lugarestado = new javax.swing.JComboBox();
        jComboBox_lugarmunicipio = new javax.swing.JComboBox();
        jComboBox_lugarparroquia = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_valorpuntostienda = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jDateChooser_fechatienda = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_tiendas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_tiendas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_tiendas.setText("Tiendas");

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Modificacion");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nombre :");

        jTextField_nombretienda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_nombretiendaKeyTyped(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Dirección :");

        jComboBox_lugarestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_lugarestadoActionPerformed(evt);
            }
        });

        jComboBox_lugarmunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_lugarmunicipioActionPerformed(evt);
            }
        });

        jComboBox_lugarparroquia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_lugarparroquiaActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Fecha :");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Valor Puntos :");

        jTextField_valorpuntostienda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_valorpuntostiendaKeyTyped(evt);
            }
        });

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Volver");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(96, 96, 96))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel_tiendas, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField_nombretienda, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jComboBox_lugarestado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox_lugarmunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox_lugarparroquia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField_valorpuntostienda, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser_fechatienda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel1))
                .addContainerGap(174, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_tiendas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_nombretienda)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_lugarestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_lugarmunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_lugarparroquia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooser_fechatienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_valorpuntostienda)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_lugarestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_lugarestadoActionPerformed
        // TODO add your handling code here:
        jComboBox_lugarmunicipio.removeAllItems();
        jComboBox_lugarparroquia.removeAllItems();
        int estado=0;
        for(int i=0;i<estados.size();i++)
        {
            if(estados.get(i).equals(jComboBox_lugarestado.getSelectedItem()))
            {
                estado=Integer.parseInt(estados.get(i-1));
                break;
            }
        }
        municipios = Controlador.ControladorLugar.ConsultarMunicipios(estado);

        int i=1;

        while(i<municipios.size())
        {
            jComboBox_lugarmunicipio.addItem(municipios.get(i));
            i=i+2;
        }
    }//GEN-LAST:event_jComboBox_lugarestadoActionPerformed

    private void jComboBox_lugarmunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_lugarmunicipioActionPerformed
        // TODO add your handling code here:
        jComboBox_lugarparroquia.removeAllItems();
        int parroquia=0;
        for(int i=0;i<municipios.size();i++)
        {
            if(municipios.get(i).equals(jComboBox_lugarmunicipio.getSelectedItem()))
            {
                parroquia=Integer.parseInt(municipios.get(i-1));
                break;
            }
        }
        parroquias = Controlador.ControladorLugar.ConsultarParroquias(parroquia);

        int i=1;

        while(i<parroquias.size())
        {
            jComboBox_lugarparroquia.addItem(parroquias.get(i));
            i=i+2;
        }
    }//GEN-LAST:event_jComboBox_lugarmunicipioActionPerformed

    private void jComboBox_lugarparroquiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_lugarparroquiaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBox_lugarparroquiaActionPerformed

    private void jTextField_valorpuntostiendaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_valorpuntostiendaKeyTyped
        // TODO add your handling code here:

        if(!(evt.getKeyChar()>='0' && evt.getKeyChar()<='9' || evt.getKeyChar()=='.'))
        {
            evt.consume();
        }

    }//GEN-LAST:event_jTextField_valorpuntostiendaKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(!jTextField_nombretienda.getText().equals(""))
        {
            if(!jComboBox_lugarestado.getSelectedItem().equals("   "))
            {
                if(jDateChooser_fechatienda.getDate()!=null)
                {
                    if(!jTextField_valorpuntostienda.getText().equals(""))
                    {
                        String fecha="";
                        try {
                            fecha = jDateChooser_fechatienda.getCalendar().get(Calendar.DATE)+"/"+(jDateChooser_fechatienda.getCalendar().get(Calendar.MONTH)+1)+"/"+jDateChooser_fechatienda.getCalendar().get(Calendar.YEAR);
                        } catch (Exception e) {
                            fecha="";
                        }

                        int parroquia=0;
                        for(int i=0;i<parroquias.size();i++)
                        {
                            if(parroquias.get(i).equals(jComboBox_lugarparroquia.getSelectedItem()))
                            {
                                parroquia=Integer.parseInt(parroquias.get(i-1));
                                break;
                            }
                        }
                        if(Controlador.ControladorTienda.RegistrarTienda(jTextField_nombretienda.getText(), fecha, Double.parseDouble(jTextField_valorpuntostienda.getText()), parroquia))
                        {
                            JOptionPane.showMessageDialog(rootPane, "Usuario Registrado", "Registro", JOptionPane.INFORMATION_MESSAGE);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(rootPane, "Error al Registrar", "Registro", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField_nombretiendaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_nombretiendaKeyTyped
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_jTextField_nombretiendaKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ModificarTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarTienda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox_lugarestado;
    private javax.swing.JComboBox jComboBox_lugarmunicipio;
    private javax.swing.JComboBox jComboBox_lugarparroquia;
    private com.toedter.calendar.JDateChooser jDateChooser_fechatienda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_tiendas;
    private javax.swing.JTextField jTextField_nombretienda;
    private javax.swing.JTextField jTextField_valorpuntostienda;
    // End of variables declaration//GEN-END:variables
}
