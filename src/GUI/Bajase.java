package GUI;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class Bajase extends javax.swing.JPanel {

    private GUI.daoEmpleado daoEmpleado;
    
    public Bajase() {
        initComponents();
        daoEmpleado = new GUI.daoEmpleado();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        btn_Consultar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_Baj_Emp = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 0, 0));

        btn_Consultar.setBackground(new java.awt.Color(153, 153, 153));
        btn_Consultar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Consultar.setText("Borrar");
        btn_Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConsultarActionPerformed(evt);
            }
        });
        btn_Consultar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btn_ConsultarKeyTyped(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("No. Empleado");

        txt_Baj_Emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Baj_EmpActionPerformed(evt);
            }
        });
        txt_Baj_Emp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_Baj_EmpKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(27, 27, 27)
                    .addComponent(txt_Baj_Emp, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(15, 15, 15)
                    .addComponent(btn_Consultar)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_Baj_Emp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_Consultar))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }                        

    private void btn_ConsultarActionPerformed(java.awt.event.ActionEvent evt) {                                              
        if(txt_Baj_Emp.getText().length() == 0){
            JOptionPane.showMessageDialog(this, "No hay ningun id escrito");
        }
        else{
            Empleado e = new Empleado();

            int numero = Integer.parseInt(txt_Baj_Emp.getText());
            e.setNumero(numero);

            daoEmpleado.Bajas(e);
            JOptionPane.showMessageDialog(null, "Registro eliminado");

            txt_Baj_Emp.setText(null);
        }

    }                                             

    private void btn_ConsultarKeyTyped(java.awt.event.KeyEvent evt) {                                       
    }                                      

    private void txt_Baj_EmpActionPerformed(java.awt.event.ActionEvent evt) {                                            
    }                                           

    private void txt_Baj_EmpKeyTyped(java.awt.event.KeyEvent evt) {                                     
        int key = evt.getKeyChar();
        boolean num = key >= 48 && key <= 57;

        if(!num && (key != KeyEvent.VK_BACK_SPACE) && (key != KeyEvent.VK_ENTER)){
            evt.consume();
            JOptionPane.showMessageDialog(this, "No puede ingresar letras");
        }

        if(txt_Baj_Emp.getText().trim().length() == 7 && (key != KeyEvent.VK_BACK_SPACE) && (key != KeyEvent.VK_ENTER)){
            evt.consume();

            JOptionPane.showMessageDialog(this, "No puede ser mayor a 7 digitos");
        }
    }                                    

    private javax.swing.JButton btn_Consultar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txt_Baj_Emp;
}