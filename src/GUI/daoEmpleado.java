package GUI;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import BD.Conexion;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author 
 */
public class daoEmpleado implements GUI.IEmpleado{
    
    private Connection cnx;

    @Override
    public void Altas(Empleado e) {
        try {
            crearEmpleadoMySQl(e);
        } catch (SQLException ex) {
            Logger.getLogger(daoEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Bajas(Empleado e) {
        try {
            BorrarEmpleadoMySQL(e);
        } catch (SQLException ex) {
            Logger.getLogger(daoEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Modificar(Empleado e) {
        try {
            ModificarEmpleadoMySQL(e);
        } catch (SQLException ex) {
            Logger.getLogger(daoEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Consultar(Empleado e) {
        try {
            ConsultarEmpleadoMySQL(e);
        } catch (SQLException ex) {
            Logger.getLogger(daoEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<Empleado> Reportes() {
        ArrayList<Empleado> e = new ArrayList();
        try {   
            e = readEmpleadosMySQL();
                    } catch (SQLException ex) {
            Logger.getLogger(daoEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return e;
    }
    
    private void crearEmpleadoMySQl(Empleado e) throws SQLException {
        Conexion con = new Conexion();
        cnx = con.getConexion();
        
        String Altas = "INSERT INTO Empleado(NUMERO, NOMBRE, APELLIDO, EDAD, HORAS, PAGO) VALUES(?,?,?,?,?,?)";
        PreparedStatement ps;
        
        ps = cnx.prepareStatement(Altas);
        ps.setInt(1, e.getNumero());
        ps.setString(2, e.getNom());
        ps.setString(3, e.getApe());
        ps.setInt(4, e.getEdad());
        ps.setInt(5, e.gethT());
        ps.setFloat(6, e.getpH());
        ps.executeUpdate();
        ps.close();
    }
    
    private void BorrarEmpleadoMySQL(Empleado e) throws SQLException{
        Conexion con = new Conexion();
        cnx = con.getConexion();
        
        String borrar = "DELETE FROM Empleado WHERE NUMERO=?";
        PreparedStatement ps;
        
        ps = cnx.prepareStatement(borrar);
        ps.setInt(1, e.getNumero());
        ps.executeUpdate();
    }
    
    private void ModificarEmpleadoMySQL(Empleado e) throws SQLException{
        Conexion con = new Conexion();
        cnx = con.getConexion();
        
        String modificar = "UPDATE Empleado SET NUMERO=?, NOMBRE=?, APELLIDO=?, EDAD=?, HORAS=?, PAGO=? WHERE NUMERO = ?";
        PreparedStatement ps;
        
        ps = cnx.prepareStatement(modificar);
        ps.setInt(1, e.getNumero());
        ps.setString(2, e.getNom());
        ps.setString(3, e.getApe());
        ps.setInt(4, e.getEdad());
        ps.setInt(5, e.gethT());
        ps.setFloat(6, e.getpH());
        ps.setInt(7, e.getNumero());
        ps.executeUpdate();
        ps.close();   
    }
    
    private void ConsultarEmpleadoMySQL(Empleado e) throws SQLException{
        Conexion con = new Conexion();
        cnx = con.getConexion();
        
        String buscar = "SELECT * FROM Empleado WHERE NUMERO=?";
        PreparedStatement ps;
        
        ps = cnx.prepareStatement(buscar);
        ps.setInt(1, e.getNumero());
        ResultSet consulta = ps.executeQuery();
        
        if(consulta.next()){
            e.setNumero(Integer.parseInt(consulta.getString("NUMERO")));
            e.setNom(consulta.getString("NOMBRE"));
            e.setApe(consulta.getString("APELLIDO"));
            e.setEdad(Integer.parseInt(consulta.getString("EDAD")));
            e.sethT(Integer.parseInt(consulta.getString("HORAS")));
            e.setpH(Float.parseFloat(consulta.getString("PAGO")));
        }
        ps.close();
    }
    
    private ArrayList<Empleado> readEmpleadosMySQL() throws SQLException {
        ArrayList<Empleado> emps = new ArrayList();
        Empleado e;

        Conexion con = new Conexion();
        cnx = con.getConexion();

        String sql = "SELECT * FROM Empleado;";
        Statement sta = cnx.createStatement();
        ResultSet rs = sta.executeQuery(sql);

        while (rs.next()) {
            e = new Empleado();
            e.setNumero(Integer.parseInt(rs.getString("NUMERO")));
            e.setNom(rs.getString("NOMBRE"));
            e.setApe(rs.getString("APELLIDO"));
            e.setEdad(Integer.parseInt(rs.getString("EDAD")));
            e.sethT(Integer.parseInt(rs.getString("HORAS")));
            e.setpH(Float.parseFloat(rs.getString("PAGO")));
            emps.add(e);
        }
        cnx.close();
        return emps;
    }
    
    public void ImprimirRegistrosEmpleadoEnPDF() throws SQLException, FileNotFoundException, DocumentException {
        
        Conexion con = new Conexion();
        cnx = con.getConexion();
        
            // Consulta SQL para obtener los registros
            String consulta = "SELECT * FROM Empleado";

            Statement stmt = cnx.createStatement();
            ResultSet rs = stmt.executeQuery(consulta);

            // Crear el documento PDF
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("Registros Empleados.pdf"));
            document.open();

            // Agregar los registros al documento
            while (rs.next()) {
                String campo1 = rs.getString("ID");
                String campo2 = rs.getString("NUMERO");
                String campo3 = rs.getString("NOMBRE");
                String campo4 = rs.getString("APELLIDO");
                String campo5 = rs.getString("EDAD");
                String campo6 = rs.getString("HORAS");
                String campo7 = rs.getString("PAGO");
//                Paragraph paragraph = new Paragraph("------------------------------------------------------------");
                Paragraph paragraph1 = new Paragraph("|" + " ID: " + campo1 + " | " + " Numero: " + campo2 + " | " 
                        + " Nombre: " + campo3 + " | " + " Apellido: " + campo4 + " | " + " Edad: " + campo5 + " | " 
                        + " Horas: " + campo6 + " | " + " Pago: " + campo7 + " |" + "\n\n");
                Paragraph paragraph2 = new Paragraph("--------------------------------------------------------------------------------------------------------------------------------");
//                document.add(paragraph);
                document.add(paragraph1);
                document.add(paragraph2);
            }

            document.close();
            rs.close();
            stmt.close();
            cnx.close();

            JOptionPane.showMessageDialog(null, "Los registros se han guardado en Registros Empleados.pdf");
    }

}
