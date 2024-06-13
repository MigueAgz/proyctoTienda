package GUI;

import java.util.ArrayList;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 
 */
public class Reportespp extends javax.swing.JPanel {
    private GUI.daoProducto daoProducto;
    
    public Reportespp() {
        initComponents();
        daoProducto = new GUI.daoProducto();
        DefaultTableModel m;
        ArrayList<Producto> prod = daoProducto.Reportes();
        m = (DefaultTableModel)Reportes.getModel();
        Object[] rowData = new Object[6];
        if(m.getRowCount() == 0){
            for(Producto p: prod){
                if(p instanceof Producto){
                    rowData[0] = ((Producto)p).getNumero();
                    rowData[1] = ((Producto)p).getNombre();
                    rowData[2] = ((Producto)p).getCategoria();
                    rowData[3] = ((Producto)p).getStock();
                    rowData[4] = ((Producto)p).getPrecio();
                    rowData[5] = ((Producto)p).getStock()*((Producto)p).getPrecio();
                    m.addRow(rowData);
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Reportes = new javax.swing.JTable();

        Reportes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Nombre", "Categoria", "Stock", "Precio", "Ganacias"
            }
        ));
        jScrollPane1.setViewportView(Reportes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
    }

    private javax.swing.JTable Reportes;
    private javax.swing.JScrollPane jScrollPane1;
}