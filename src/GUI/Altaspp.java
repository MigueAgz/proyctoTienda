package GUI;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class Altaspp extends javax.swing.JPanel {

    private GUI.daoProducto daoProducto;
    
    public Altaspp() {
        initComponents();
        daoProducto = new GUI.daoProducto();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        txt_Nombre_Prod = new javax.swing.JTextField();
        txt_Stock = new javax.swing.JTextField();
        txt_Precio = new javax.swing.JTextField();
        btn_Guardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbx_Categoria = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_No_Prod = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 0, 0));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Stock");

        txt_Nombre_Prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Nombre_ProdActionPerformed(evt);
            }
        });
        txt_Nombre_Prod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_Nombre_ProdKeyTyped(evt);
            }
        });

        txt_Stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_StockActionPerformed(evt);
            }
        });
        txt_Stock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_StockKeyTyped(evt);
            }
        });

        txt_Precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PrecioActionPerformed(evt);
            }
        });
        txt_Precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PrecioKeyTyped(evt);
            }
        });

        btn_Guardar.setText("Guardar");
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("No. Producto");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Precio");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("categoria");

        cbx_Categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "botanas", "bebidas", "abarrotes", "lacteos", "dulces", "harinas", "higiene", "limpieza" }));
        cbx_Categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_CategoriaActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/11.png"))); 
        jLabel8.setText("jLabel8");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/12.png"))); 
        jLabel9.setText("jLabel9");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(txt_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_Stock, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Guardar)
                            .addComponent(cbx_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_Nombre_Prod, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(txt_No_Prod))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_No_Prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Nombre_Prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbx_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel9)))
                .addGap(5, 5, 5)
                .addComponent(btn_Guardar)
                .addContainerGap(101, Short.MAX_VALUE))
        );
    }                       

    private void txt_Nombre_ProdActionPerformed(java.awt.event.ActionEvent evt) {                                                
    }                                               

    private void txt_Nombre_ProdKeyTyped(java.awt.event.KeyEvent evt) {                                         
    int key = evt.getKeyChar();

    boolean mayus = key >= 65 && key <= 90;
    boolean minus = key >= 97 && key <= 120;
    boolean espac = key == 32;

    if(!(minus || mayus || espac) && (key != KeyEvent.VK_BACK_SPACE) && (key != KeyEvent.VK_ENTER)){
        evt.consume();
        JOptionPane.showMessageDialog(this, "No puede ingresar numeros");
    }
    }                                        

    private void txt_StockActionPerformed(java.awt.event.ActionEvent evt) {                                          
    }                                         

    private void txt_StockKeyTyped(java.awt.event.KeyEvent evt) {                                   
        int key = evt.getKeyChar();
        boolean num = key >= 48 && key <= 57;

        if(!num && (key != KeyEvent.VK_BACK_SPACE) && (key != KeyEvent.VK_ENTER)){
            evt.consume();
            JOptionPane.showMessageDialog(this, "No puede ingresar letras");
        }

        if(txt_Stock.getText().trim().length() == 7 && (key != KeyEvent.VK_BACK_SPACE) && (key != KeyEvent.VK_ENTER)){
            evt.consume();

            JOptionPane.showMessageDialog(this, "No puede ser mayor a 7 digitos");
        }
    }                                  

    private void txt_PrecioActionPerformed(java.awt.event.ActionEvent evt) {                                           
    }                                          

    private void txt_PrecioKeyTyped(java.awt.event.KeyEvent evt) {                                    
        int key = evt.getKeyChar();
        boolean num = key >= 48 && key <= 57;

        if(!num && (key != KeyEvent.VK_BACK_SPACE) && (key != KeyEvent.VK_ENTER)){
            evt.consume();
            JOptionPane.showMessageDialog(this, "No puede ingresar letras");
        }

        if(txt_Precio.getText().trim().length() == 7 && (key != KeyEvent.VK_BACK_SPACE) && (key != KeyEvent.VK_ENTER)){
            evt.consume();

            JOptionPane.showMessageDialog(this, "No puede ser mayor a 7 digitos");
        }
    }                                   

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if(txt_No_Prod.getText().length() == 0){
            JOptionPane.showMessageDialog(this, "Faltan campos a llenar");
        }
        else if(txt_Nombre_Prod.getText().length() == 0){
            JOptionPane.showMessageDialog(this, "Faltan campos a llenar");
        }
        else if(txt_Stock.getText().length() == 0){
            JOptionPane.showMessageDialog(this, "Faltan campos a llenar");
        }
        else if(txt_Precio.getText().length() == 0){
            JOptionPane.showMessageDialog(this, "Faltan campos a llenar");
        }
        else{
            Producto p = new Producto();

            String nombre, categoria;
            float precio;
            int numero, stock;

            nombre = txt_Nombre_Prod.getText();
            categoria = (String) cbx_Categoria.getSelectedItem();
            numero = Integer.parseInt(txt_No_Prod.getText());
            precio = Float.parseFloat(txt_Precio.getText());
            stock = Integer.parseInt(txt_Stock.getText());

            p.setNumero(numero);
            p.setNombre(nombre);
            p.setCategoria(categoria);
            p.setStock(stock);
            p.setPrecio(precio);

            daoProducto.Altas(p);
            JOptionPane.showMessageDialog(this, "Se ha dado de alta satisfacatoriamente");
        }
    }                                           

    private void cbx_CategoriaActionPerformed(java.awt.event.ActionEvent evt) {                                              
    }                                             

    private javax.swing.JButton btn_Guardar;
    private javax.swing.JComboBox<String> cbx_Categoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_No_Prod;
    private javax.swing.JTextField txt_Nombre_Prod;
    private javax.swing.JTextField txt_Precio;
    private javax.swing.JTextField txt_Stock;
}