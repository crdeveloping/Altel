/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntonaranja;

import java.awt.print.PrinterException;
import static java.lang.Integer.parseInt;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.text.AbstractDocument;
import org.w3c.dom.Document;
import utils.Message;
import utils.MyDocumentFilter;
import utils.Static;
import utils.TextPrinter;
import utils.Utilities;
import utils.auth;

/**
 *
 * @author Marlon
 */
public class ConfirmaRecarga extends javax.swing.JFrame {

    /**
     * Creates new form ConfirmaRecarga
     */
    String operador,mont,num,tipo,consecutivoRecibo,zonaSoloCabletica;
    public ConfirmaRecarga(String mont,String num,String operador,String tipo,String consecutivoRecibo,String zonaSoloCabletica) {
        initComponents();
        setLocationRelativeTo(null);
        ImageIcon img = new ImageIcon("src/puntonaranja/resurces/naranja.png");
        setIconImage(img.getImage());
        this.operador=operador;
        this.mont=mont;
        this.num=num;
        lblOperador.setText(operador);
        lblMonto.setText(mont);
        lblNum.setText(num);
        this.tipo=tipo;
        
        switch (tipo) {
                case "Recargas":
                    jLabel4.setText("Numero:");
                    jLabel4.setVisible(true);
                    lblNum.setVisible(true);
                    txtPagar.setVisible(false);
                    lblPagar.setVisible(false);
                break;
                    
                case "Pines":
                    jLabel4.setVisible(false);
                    lblNum.setVisible(false);
                    txtPagar.setVisible(false);
                    lblPagar.setVisible(false);
                break;
                    
                case "Servicios":
                    jLabel3.setText("Cobro:");
                    jLabel4.setText("Identificador:");
                    jLabel4.setVisible(true);
                    lblNum.setVisible(true);
                break;
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

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblNum = new javax.swing.JLabel();
        lblMonto = new javax.swing.JLabel();
        lblOperador = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lblPagar = new javax.swing.JLabel();
        txtPagar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Confirmación");
        setAlwaysOnTop(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Confirme los datos");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setText("Numero:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("Monto:");

        lblNum.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N

        lblMonto.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N

        lblOperador.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        lblOperador.setMaximumSize(new java.awt.Dimension(450, 90));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setText("Operador:");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton3.setText("Aceptar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        lblPagar.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblPagar.setText("Monto a pagar:");

        txtPagar.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        txtPagar.setText("0");
        txtPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(lblPagar))
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblMonto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 284, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(81, 81, 81))
                            .addComponent(jLabel4))
                        .addGap(37, 37, 37)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(lblNum, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(lblMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPagar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked
        
    public static String consultaSaldo(){
        String resp="";
        try {
            // TODO add your handling code here:
            Utilities util = new Utilities();
            Message msg = new Message();
            msg.consultaSaldo();
            Map<String, String> response = util.SendToServer(msg.buildString());
            msg.setMap(response);
            resp = msg.getMsgResponse();
            if(resp.equals("Transacción aprobada en forma exitosa")){
                Static.setSaldo((Float.parseFloat(msg.getMsgMonto())/100)+"");
                return (Float.parseFloat(msg.getMsgMonto())/100)+"";
            }
        } catch (Exception ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }
            return resp;
    }
    
    private void recargas(){
        try {
            // TODO add your handling code here:
            String selected = operador;
            String operador = "";
            String producto = "";
            String proceso = "";
            String monto = mont;
            String celular = num;
                            switch (selected) {
                                case "Recarga Kolbi":
                                operador = "200";
                                producto = "11";
                                proceso = "680000";
                                break;

                                case "Recarga TUYO MOVIL":
                                operador = "18";
                                producto = "12";
                                proceso = "690000";
                                break;

                                case "Recarga FULLMOVIL":
                                operador = "24";
                                producto = "16";
                                proceso = "240000";
                                break;
                            }
                            Utilities util = new Utilities();
                            Message msg = new Message();
                            msg.recargaTiempoAire(monto, operador, producto, proceso, celular);
                            Map<String, String> response = util.SendToServer(msg.buildString());
                            msg.setMap(response);
                            String resp = msg.getMsgResponse();
                            if(resp != null){
                                if(resp.equals("Transacción aprobada en forma exitosa")){
                                    new auth().escribeFicheroPrint(monto,celular,selected,tipo);
                                    consultaSaldo();
                                    this.setVisible(false);
                                    new ventanaReporte().setVisible(true);
                                }else {
                                    this.setVisible(false);
                                    JOptionPane.showMessageDialog(null, resp+", se ha cancelado la transaccion");
                                }
                            }else{
                                    this.setVisible(false);
                                    consultaErronea(response.get("39"));
                            }
            } catch (Exception ex) {
            Logger.getLogger(Recargas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void consultaErronea(String cod){
        JOptionPane.showMessageDialog(null, "Codigo de respuesta erronea: "+cod+", consulte con su proveedor");
                            
    }
    private void pines(){
        try {
            // TODO add your handling code here:
            String selected = operador;
            String selected2 = mont;
            String operador = "";
            String producto = "";
            String proceso = "";
            //String monto = cmpMonto.getSelectedItem().toString();
                            switch (selected) {
                                case "Prepago Movil":
                                    operador = "150";
                                    switch (selected2) {
                                        case "2500":
                                        producto = "6";
                                        break;

                                        case "5000":
                                        producto = "3";
                                        break;

                                        case "10000":
                                        producto = "4";
                                        break;
                                    }
                                break;

                                case "Viajera":
                                    operador = "199";
                                    switch (selected2) {
                                        case "1000":
                                        producto = "1";
                                        break;

                                        case "3000":
                                        producto = "2";
                                        break;

                                        case "5000":
                                        producto = "3";
                                        break;
                                            
                                        case "10000":
                                        producto = "4";
                                        break;
                                            
                                        case "500":
                                        producto = "5";
                                        break;
                                    }
                                break;

                                case "Teletica":
                                    operador = "18";
                                    switch (selected2) {
                                        case "500":
                                        producto = "5";
                                        break;
                                            
                                        case "1000":
                                        producto = "1";
                                        break;

                                        case "2000":
                                        producto = "13";
                                        break;

                                        case "5000":
                                        producto = "3";
                                        break;
                                            
                                        case "10000":
                                        producto = "4";
                                        break;
                                    }
                            }
                            Utilities util = new Utilities();
                            Message msg = new Message();
                            msg.ventaPines(mont, operador, producto);
                            Map<String, String> response = util.SendToServer(msg.buildString());
                            msg.setMap(response);
                            String resp = msg.getMsgResponse();
                            if(resp!=null){
                                if(resp.equals("Transacción aprobada en forma exitosa")){
                                    new auth().escribeFicheroPrint(selected2,msg.getMsgPin(),selected,"Pines");
                                    consultaSaldo();
                                    this.setVisible(false);
                                    new ventanaReporte().setVisible(true);
                                }else {
                                    this.setVisible(false);
                                    JOptionPane.showMessageDialog(null, resp+", se ha cancelado la transaccion");
                                }
                            
                            }else{
                                    this.setVisible(false);
                                    consultaErronea(response.get("39"));
                            }
        } catch (Exception ex) {
            Logger.getLogger(Recargas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String name="";
        Boolean pass=false;
        if(Boolean.parseBoolean(new auth().leerArchivo("Sesion\\archivoPidePassword.txt"))||Boolean.parseBoolean(new auth().leerArchivo("Sesion/archivoPidePassword.txt"))){
            this.hide();
            while(!pass){
                //if(!pass)JOptionPane.showMessageDialog(null,"Contraseña incorrecta", "Error", JOptionPane.WARNING_MESSAGE );
                //name = JOptionPane.showInputDialog(null, "Digite la contraseña para realizar la venta");
                JPanel panel = new JPanel();
                JLabel label = new JLabel("Digite la contraseña:");
                JPasswordField psw = new JPasswordField(10);
                panel.add(label);
                panel.add(psw);
                String[] options = new String[]{"Aceptar", "Cancelar"};
                int option = JOptionPane.showOptionDialog(null, panel, "Digite la contraseña",
                JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, options[1]);
                if(option == 0) // pressing OK button
                {
                    char[] password = psw.getPassword();
                    name=new String(password);
                }else{
                    JOptionPane.showMessageDialog(null,"Compra Cancelada", "Error", JOptionPane.WARNING_MESSAGE );
                    pass=true;
                }
                if(name.equals(Static.getPassword()))pass=true;
            }   
            this.setVisible(true);
        }else{
            name=Static.getPassword();
            pass=true;
        }
        if(pass && name.equals(Static.getPassword())){
        switch (tipo) {
                case "Recargas":
                    recargas();
                break;
                    
                case "Pines":
                    pines();
                break;
                    
                case "Servicios":
                    servicios();
                break;
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing

    private void txtPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPagarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        ((AbstractDocument) txtPagar.getDocument()).setDocumentFilter(new MyDocumentFilter());
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(ConfirmaRecarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfirmaRecarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfirmaRecarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfirmaRecarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfirmaRecarga("","","","","","").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JLabel lblNum;
    private javax.swing.JLabel lblOperador;
    private javax.swing.JLabel lblPagar;
    private javax.swing.JTextField txtPagar;
    // End of variables declaration//GEN-END:variables

    private void servicios() {
        try {
            if(Integer.parseInt(txtPagar.getText())>=Integer.parseInt(mont)){
                Utilities util = new Utilities();
                Message msg = new Message();
                msg.pagarServiciosPublicos(mont,consecutivoRecibo, zonaSoloCabletica);
                Map<String, String> response = util.SendToServer(msg.buildString());
                msg.setMap(response);
                String resp = msg.getMsgResponse();
             if(resp!=null){   
                if(resp.equals("Transacción aprobada en forma exitosa")){
                    new auth().escribeFicheroPrint(mont,num,operador,"Servicios");
                    consultaSaldo();
                    this.setVisible(false);
                    new ventanaReporte().setVisible(true);
                }else {
                    this.setVisible(false);
                    JOptionPane.showMessageDialog(null, resp+", se ha cancelado la transaccion");
                }
              
              }else{
               this.setVisible(false);
               consultaErronea(response.get("39"));
              }
            }
            else{
                JOptionPane.showMessageDialog(null, "Por favor inserte un monto mayor o igual al cobro");
            }
        } catch (Exception ex) {
            Logger.getLogger(ConfirmaRecarga.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
