package GUI;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class Bajaspprov extends javax.swing.JPanel {

    private GUI.daoProvedores daoProvedores;
    
    public Bajaspprov() {
        initComponents();
        daoProvedores = new GUI.daoProvedores();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        btn_Borrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_Baja_Prov = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));

        btn_Borrar.setText("Borrar");
        btn_Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BorrarActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("No. Provedor");

        txt_Baja_Prov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Baja_ProvActionPerformed(evt);
            }
        });
        txt_Baja_Prov.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_Baja_ProvKeyTyped(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/14.png")));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(txt_Baja_Prov, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btn_Borrar)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Baja_Prov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Borrar))
                .addContainerGap(176, Short.MAX_VALUE))
        );
    }                        

    private void btn_BorrarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if(txt_Baja_Prov.getText().length() == 0){
            JOptionPane.showMessageDialog(this, "No hay ningun id escrito");
        }
        else{
            Provedores s = new Provedores();

            int numero = Integer.parseInt(txt_Baja_Prov.getText());
            s.setNumero(numero);

            daoProvedores.Bajas(s);
            JOptionPane.showMessageDialog(null, "Registro eliminado");

            txt_Baja_Prov.setText(null);
        }
    }                                          

    private void txt_Baja_ProvActionPerformed(java.awt.event.ActionEvent evt) {                                              
    }                                             

    private void txt_Baja_ProvKeyTyped(java.awt.event.KeyEvent evt) {                                       
        int key = evt.getKeyChar();
        boolean num = key >= 48 && key <= 57;

        if(!num && (key != KeyEvent.VK_BACK_SPACE) && (key != KeyEvent.VK_ENTER)){
            evt.consume();
            JOptionPane.showMessageDialog(this, "No puede ingresar letras");
        }

        if(txt_Baja_Prov.getText().trim().length() == 7 && (key != KeyEvent.VK_BACK_SPACE) && (key != KeyEvent.VK_ENTER)){
            evt.consume();

            JOptionPane.showMessageDialog(this, "No puede ser mayor a 7 digitos");
        }
    }                                      

    private javax.swing.JButton btn_Borrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txt_Baja_Prov;
}