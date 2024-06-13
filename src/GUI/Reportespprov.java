package GUI;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 
 */
public class Reportespprov extends javax.swing.JPanel {
    private GUI.daoProvedores daoProvedores; 
    
    public Reportespprov() {
        initComponents();
        daoProvedores = new GUI.daoProvedores();
        DefaultTableModel m;
        ArrayList<Provedores> prov = daoProvedores.Reportes();
        m = (DefaultTableModel)tblReportes.getModel();
        Object[] rowData = new Object[7];
        if(m.getRowCount() == 0){
            for(Provedores pr: prov){
                if(pr instanceof Provedores){
                    rowData[0] = ((Provedores)pr).getNumero();
                    rowData[1] = ((Provedores)pr).getNombre();
                    rowData[2] = ((Provedores)pr).getApellido();
                    rowData[3] = ((Provedores)pr).getMarca();
                    rowData[4] = ((Provedores)pr).getCant();
                    rowData[5] = ((Provedores)pr).getPago();
                    rowData[6] = ((Provedores)pr).getPago() / ((Provedores)pr).getCant();
                    m.addRow(rowData);
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblReportes = new javax.swing.JTable();

        tblReportes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Nombre", "Apellido", "Marca", "Cantidad", "Pago", "Precio individual"
            }
        ));
        jScrollPane1.setViewportView(tblReportes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
    }

    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblReportes;
}