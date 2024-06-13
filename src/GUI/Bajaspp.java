package GUI;

import GUI.daoProducto;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class Bajaspp extends javax.swing.JPanel {

    private GUI.daoProducto daoProducto;
    
    public Bajaspp() {
        initComponents();
        daoProducto = new GUI.daoProducto();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        txt_No_Pro = new javax.swing.JTextField();
        btn_Borrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));

        txt_No_Pro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_No_ProActionPerformed(evt);
            }
        });
        txt_No_Pro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_No_ProKeyTyped(evt);
            }
        });

        btn_Borrar.setText("Borrar");
        btn_Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BorrarActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("No. Producto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(txt_No_Pro, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btn_Borrar)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_No_Pro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Borrar)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(218, Short.MAX_VALUE))
        );
    }                        

    private void txt_No_ProActionPerformed(java.awt.event.ActionEvent evt) {                                           
    }                                          

    private void txt_No_ProKeyTyped(java.awt.event.KeyEvent evt) {                                    
        int key = evt.getKeyChar();
        boolean num = key >= 48 && key <= 57;

        if(!num && (key != KeyEvent.VK_BACK_SPACE) && (key != KeyEvent.VK_ENTER)){
            evt.consume();
            JOptionPane.showMessageDialog(this, "No puede ingresar letras");
        }

        if(txt_No_Pro.getText().trim().length() == 7 && (key != KeyEvent.VK_BACK_SPACE) && (key != KeyEvent.VK_ENTER)){
            evt.consume();

            JOptionPane.showMessageDialog(this, "No puede ser mayor a 7 digitos");
        }
    }                                   

    private void btn_BorrarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if(txt_No_Pro.getText().length() == 0){
            JOptionPane.showMessageDialog(this, "No hay ningun id escrito");
        }
        else{
            Producto p = new Producto();

            int numero = Integer.parseInt(txt_No_Pro.getText());
            p.setNumero(numero);

            daoProducto.Bajas(p);
            JOptionPane.showMessageDialog(null, "Registro eliminado");
            txt_No_Pro.setText(null);
        }
    }                                          

    private javax.swing.JButton btn_Borrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txt_No_Pro;
}