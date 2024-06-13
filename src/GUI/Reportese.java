package GUI;

import java.util.ArrayList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 
 */
public class Reportese extends javax.swing.JPanel {
    private GUI.daoEmpleado daoEmpleado;

    public Reportese() {
        initComponents();
        daoEmpleado = new GUI.daoEmpleado();
        DefaultTableModel m;
        ArrayList<Empleado> emps = daoEmpleado.Reportes();
        m = (DefaultTableModel)Reportes.getModel();
        Object[] rowData = new Object[7];
        if(m.getRowCount() == 0){
            for(Empleado e: emps){
                if(e instanceof Empleado){
                    rowData[0] = ((Empleado)e).getNumero();
                    rowData[1] = ((Empleado)e).getNom();
                    rowData[2] = ((Empleado)e).getApe();
                    rowData[3] = ((Empleado)e).getEdad();
                    rowData[4] = ((Empleado)e).gethT();
                    rowData[5] = ((Empleado)e).getpH();
                    rowData[6] = ((Empleado)e).gethT()*((Empleado)e).getpH();
                    m.addRow(rowData);
                }
            }
        }      
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        j = new javax.swing.JScrollPane();
        Reportes = new javax.swing.JTable();

        j.setBackground(new java.awt.Color(153, 153, 153));

        Reportes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido", "Edad", "horastrab", "pagohora", "sueldo"
            }
        ));
        j.setViewportView(Reportes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(j, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(j, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
    }

    private javax.swing.JTable Reportes;
    private javax.swing.JScrollPane j;
}