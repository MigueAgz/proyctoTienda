package GUI;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class Consultase extends javax.swing.JPanel {

    private GUI.daoEmpleado daoEmpleado;
    
    public Consultase() {
        initComponents();
        daoEmpleado = new GUI.daoEmpleado();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_Buscar = new javax.swing.JTextField();
        btn_Buscar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtHoras = new javax.swing.JTextField();
        txtPago = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("No. Empleado a buscar");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("APELLIDO");

        txt_Buscar.setBackground(new java.awt.Color(204, 204, 204));
        txt_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_BuscarActionPerformed(evt);
            }
        });
        txt_Buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_BuscarKeyTyped(evt);
            }
        });

        btn_Buscar.setBackground(new java.awt.Color(153, 153, 153));
        btn_Buscar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Buscar.setText("Buscar");
        btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/19.png"))); 

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EDAD");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NOMBRE");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("HORAS");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Pago por hora");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Pago total");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(txt_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(21, 21, 21)
                            .addComponent(btn_Buscar))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(50, 50, 50)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(jLabel9))
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(30, 30, 30)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPago, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(30, 30, 30)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(42, 42, 42)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(txt_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_Buscar))
                    .addGap(19, 19, 19)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(11, 11, 11)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(14, 14, 14)
                            .addComponent(jLabel1)
                            .addGap(14, 14, 14)
                            .addComponent(jLabel9)
                            .addGap(14, 14, 14)
                            .addComponent(jLabel10))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(11, 11, 11)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(11, 11, 11)
                            .addComponent(txtHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(11, 11, 11)
                            .addComponent(txtPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }                        

    private void txt_BuscarActionPerformed(java.awt.event.ActionEvent evt) {                                           
    }                                          

    private void txt_BuscarKeyTyped(java.awt.event.KeyEvent evt) {                                    
        int key = evt.getKeyChar();
        boolean num = key >= 48 && key <= 57;

        if(!num && (key != KeyEvent.VK_BACK_SPACE) && (key != KeyEvent.VK_ENTER)){
            evt.consume();
            JOptionPane.showMessageDialog(this, "No puede ingresar letras");
        }

        if(txt_Buscar.getText().trim().length() == 7 && (key != KeyEvent.VK_BACK_SPACE) && (key != KeyEvent.VK_ENTER)){
            evt.consume();

            JOptionPane.showMessageDialog(this, "No puede ser mayor a 7 digitos");
        }
    }                                   

    private void btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if(txt_Buscar.getText().length() == 0){
            JOptionPane.showMessageDialog(this, "No hay ningun id escrito");
        }
        else{
            txtNombre.setEditable(false);
            txtApellido.setEditable(false);
            txtEdad.setEditable(false);
            txtHoras.setEditable(false);
            txtPago.setEditable(false);
            txtTotal.setEditable(false);

            Empleado e = new Empleado();

            int numero = Integer.parseInt(txt_Buscar.getText());
            e.setNumero(numero);
            daoEmpleado.Consultar(e);

            txt_Buscar.setText(String.valueOf(e.getNumero()));
            txtNombre.setText(String.valueOf(e.getNom()));
            txtApellido.setText(String.valueOf(e.getApe()));
            txtEdad.setText(String.valueOf(e.getEdad()));
            txtHoras.setText(String.valueOf(e.gethT()));
            txtPago.setText(String.valueOf(e.getpH()));
            txtTotal.setText(String.valueOf(e.gethT()*e.getpH()));

            JOptionPane.showMessageDialog(null, "Registro Encontrado");
        }
    }                                          

    private javax.swing.JButton btn_Buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtHoras;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPago;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txt_Buscar;
}