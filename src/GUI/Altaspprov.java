package GUI;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class Altaspprov extends javax.swing.JPanel {

    private GUI.daoProvedores daoProvedores;
    
    public Altaspprov() {
        initComponents();
        daoProvedores = new GUI.daoProvedores();
    }

    
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_No_Provedor = new javax.swing.JTextField();
        txt_Nombre_Prov = new javax.swing.JTextField();
        txt_Apellido = new javax.swing.JTextField();
        txt_Marca = new javax.swing.JTextField();
        txt_Cantidad = new javax.swing.JTextField();
        txt_Top = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Apellido");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cantidad comprada");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total a pagar");

        txt_No_Provedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_No_ProvedorActionPerformed(evt);
            }
        });
        txt_No_Provedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_No_ProvedorKeyTyped(evt);
            }
        });

        txt_Nombre_Prov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Nombre_ProvActionPerformed(evt);
            }
        });
        txt_Nombre_Prov.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_Nombre_ProvKeyTyped(evt);
            }
        });

        txt_Apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ApellidoActionPerformed(evt);
            }
        });
        txt_Apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ApellidoKeyTyped(evt);
            }
        });

        txt_Marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MarcaActionPerformed(evt);
            }
        });
        txt_Marca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_MarcaKeyTyped(evt);
            }
        });

        txt_Cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CantidadActionPerformed(evt);
            }
        });
        txt_Cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_CantidadKeyTyped(evt);
            }
        });

        txt_Top.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TopActionPerformed(evt);
            }
        });
        txt_Top.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_TopKeyTyped(evt);
            }
        });

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("No. Provedor");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Marca");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/13.png"))); 
        jLabel9.setText("jLabel9");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(guardar)
                .addContainerGap(229, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(48, 48, 48)
                            .addComponent(txt_No_Provedor, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(48, 48, 48)
                            .addComponent(txt_Nombre_Prov, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(29, 29, 29)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_Top, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(21, 21, 21)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(311, Short.MAX_VALUE)
                .addComponent(guardar)
                .addGap(68, 68, 68))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_No_Provedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(9, 9, 9)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txt_Nombre_Prov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(2, 2, 2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(15, 15, 15)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(21, 21, 21)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(21, 21, 21)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addComponent(txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(15, 15, 15)
                            .addComponent(txt_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(21, 21, 21)
                            .addComponent(txt_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(21, 21, 21)
                            .addComponent(txt_Top, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 87, Short.MAX_VALUE)))
        );
    }                        

    private void txt_No_ProvedorActionPerformed(java.awt.event.ActionEvent evt) {                                                
    }                                               

    private void txt_No_ProvedorKeyTyped(java.awt.event.KeyEvent evt) {                                         
        int key = evt.getKeyChar();
        boolean num = key >= 48 && key <= 57;

        if(!num && (key != KeyEvent.VK_BACK_SPACE) && (key != KeyEvent.VK_ENTER)){
            evt.consume();
            JOptionPane.showMessageDialog(this, "No puede ingresar letras");
        }

        if(txt_No_Provedor.getText().trim().length() == 7 && (key != KeyEvent.VK_BACK_SPACE) && (key != KeyEvent.VK_ENTER)){
            evt.consume();

            JOptionPane.showMessageDialog(this, "No puede ser mayor a 7 digitos");
        }
    }                                        

    private void txt_Nombre_ProvActionPerformed(java.awt.event.ActionEvent evt) {                                                
    }                                               

    private void txt_Nombre_ProvKeyTyped(java.awt.event.KeyEvent evt) {                                         
        int key = evt.getKeyChar();

        boolean mayus = key >= 65 && key <= 90;
        boolean minus = key >= 97 && key <= 120;
        boolean espac = key == 32;

        if(!(minus || mayus || espac) && (key != KeyEvent.VK_BACK_SPACE) && (key != KeyEvent.VK_ENTER)){
            evt.consume();
            JOptionPane.showMessageDialog(this, "No puede ingresar numeros");
        }
    }                                        

    private void txt_ApellidoActionPerformed(java.awt.event.ActionEvent evt) {                                             
    }                                            

    private void txt_ApellidoKeyTyped(java.awt.event.KeyEvent evt) {                                      
        int key = evt.getKeyChar();

        boolean mayus = key >= 65 && key <= 90;
        boolean minus = key >= 97 && key <= 120;
        boolean espac = key == 32;

        if(!(minus || mayus || espac) && (key != KeyEvent.VK_BACK_SPACE) && (key != KeyEvent.VK_ENTER)){
            evt.consume();
            JOptionPane.showMessageDialog(this, "No puede ingresar numeros");
        }
    }                                     

    private void txt_MarcaActionPerformed(java.awt.event.ActionEvent evt) {                                          
    }                                         

    private void txt_MarcaKeyTyped(java.awt.event.KeyEvent evt) {                                   
        int key = evt.getKeyChar();

        boolean mayus = key >= 65 && key <= 90;
        boolean minus = key >= 97 && key <= 120;
        boolean espac = key == 32;

        if(!(minus || mayus || espac) && (key != KeyEvent.VK_BACK_SPACE) && (key != KeyEvent.VK_ENTER)){
            evt.consume();
            JOptionPane.showMessageDialog(this, "No puede ingresar numeros");
        }
    }                                  

    private void txt_CantidadActionPerformed(java.awt.event.ActionEvent evt) {                                             
    }                                            

    private void txt_CantidadKeyTyped(java.awt.event.KeyEvent evt) {                                      
        int key = evt.getKeyChar();
        boolean num = key >= 48 && key <= 57;

        if(!num && (key != KeyEvent.VK_BACK_SPACE) && (key != KeyEvent.VK_ENTER)){
            evt.consume();
            JOptionPane.showMessageDialog(this, "No puede ingresar letras");
        }

        if(txt_Cantidad.getText().trim().length() == 4 && (key != KeyEvent.VK_BACK_SPACE) && (key != KeyEvent.VK_ENTER)){
            evt.consume();

            JOptionPane.showMessageDialog(this, "No puede ser mayor a 4 digitos");
        }
    }                                     

    private void txt_TopActionPerformed(java.awt.event.ActionEvent evt) {                                        
    }                                       

    private void txt_TopKeyTyped(java.awt.event.KeyEvent evt) {                                 
        int key = evt.getKeyChar();
        boolean num = key >= 48 && key <= 57;

        if(!num && (key != KeyEvent.VK_BACK_SPACE) && (key != KeyEvent.VK_ENTER)){
            evt.consume();
            JOptionPane.showMessageDialog(this, "No puede ingresar letras");
        }

        if(txt_Top.getText().trim().length() == 7 && (key != KeyEvent.VK_BACK_SPACE) && (key != KeyEvent.VK_ENTER)){
            evt.consume();

            JOptionPane.showMessageDialog(this, "No puede ser mayor a 7 digitos");
        }
    }                                

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {                                        
        if(txt_No_Provedor.getText().length() == 0){
            JOptionPane.showMessageDialog(this, "Faltan campos a llenar");
        }
        else if(txt_Nombre_Prov.getText().length() == 0){
            JOptionPane.showMessageDialog(this, "Faltan campos a llenar");
        }
        else if(txt_Apellido.getText().length() == 0){
            JOptionPane.showMessageDialog(this, "Faltan campos a llenar");
        }
        else if(txt_Marca.getText().length() == 0){
            JOptionPane.showMessageDialog(this, "Faltan campos a llenar");
        }
        else if(txt_Cantidad.getText().length() == 0){
            JOptionPane.showMessageDialog(this, "Faltan campos a llenar");
        }
        else if(txt_Top.getText().length() == 0){
            JOptionPane.showMessageDialog(this, "Faltan campos a llenar");
        }
        else{
            Provedores s = new Provedores();

            String nombre, apellido, marca;
            float pago;
            int numero, cantidad;
            nombre = txt_Nombre_Prov.getText();
            apellido = txt_Apellido.getText();
            numero = Integer.parseInt(txt_No_Provedor.getText());
            pago = Float.parseFloat(txt_Top.getText());
            marca = txt_Marca.getText();
            cantidad = Integer.parseInt(txt_Cantidad.getText());

            s.setNumero(numero);
            s.setNombre(nombre);
            s.setApellido(apellido);
            s.setMarca(marca);
            s.setCant(cantidad);
            s.setPago(pago);

            daoProvedores.Altas(s);

            JOptionPane.showMessageDialog(this, "Se ha dado de alta satisfacatoriamente");
        }
    }                                       

    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_Apellido;
    private javax.swing.JTextField txt_Cantidad;
    private javax.swing.JTextField txt_Marca;
    private javax.swing.JTextField txt_No_Provedor;
    private javax.swing.JTextField txt_Nombre_Prov;
    private javax.swing.JTextField txt_Top;
}