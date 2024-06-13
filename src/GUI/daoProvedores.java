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
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 
 */
public class daoProvedores implements GUI.IProvedores{

    private Connection cnx;
    
    @Override
    public void Altas(Provedores s) {
        try {
            crearProvedorMySQl(s);
        } catch (SQLException ex) {
            Logger.getLogger(daoProvedores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Bajas(Provedores s) {
        try {
            BorrarProvedorMySQL(s);
        } catch (SQLException ex) {
            Logger.getLogger(daoProvedores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Modificar(Provedores s) {
        try {
            ModificarProvedorMySQL(s);
        } catch (SQLException ex) {
            Logger.getLogger(daoProvedores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Consultar(Provedores s) {
        try {
            ConsultarProvedorMySQL(s);
        } catch (SQLException ex) {
            Logger.getLogger(daoProvedores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<Provedores> Reportes() {
       ArrayList<Provedores> pr = new ArrayList();
        try {
            pr = ReportesprovedorMySQL();
        } catch (SQLException ex) {
            Logger.getLogger(daoProvedores.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       return pr;
    }
    
    private void crearProvedorMySQl(Provedores s) throws SQLException {
        Conexion con = new Conexion();
        cnx = con.getConexion();
        
        String Altas = "INSERT INTO Provedores(NUMERO, NOMBRE, APELLIDO, MARCA, CANTIDAD, PAGO) VALUES(?,?,?,?,?,?)";
        PreparedStatement ps;
        
        ps = cnx.prepareStatement(Altas);
        ps.setInt(1, s.getNumero());
        ps.setString(2, s.getNombre());
        ps.setString(3, s.getApellido());
        ps.setString(4, s.getMarca());
        ps.setInt(5, s.getCant());
        ps.setFloat(6, s.getPago());
        ps.executeUpdate();
        ps.close();
    }
    
    private void BorrarProvedorMySQL(Provedores s) throws SQLException{
        Conexion con = new Conexion();
        cnx = con.getConexion();
        
        String borrar = "DELETE FROM Provedores WHERE NUMERO=?";
        PreparedStatement ps;
        
        ps = cnx.prepareStatement(borrar);
        ps.setInt(1, s.getNumero());
        ps.executeUpdate();
    }
    
    private void ModificarProvedorMySQL(Provedores s) throws SQLException{
        Conexion con = new Conexion();
        cnx = con.getConexion();
        
        String modificar = "UPDATE Provedores SET NUMERO=?, NOMBRE=?, APELLIDO=?, MARCA=?, CANTIDAD=?, PAGO=? WHERE NUMERO = ?";
        PreparedStatement ps;
        
        ps = cnx.prepareStatement(modificar);
        ps.setInt(1, s.getNumero());
        ps.setString(2, s.getNombre());
        ps.setString(3, s.getApellido());
        ps.setString(4, s.getMarca());
        ps.setInt(5, s.getCant());
        ps.setFloat(6, s.getPago());
        ps.setInt(7, s.getNumero());
        ps.executeUpdate();
        ps.close();   
    }
    
    private void ConsultarProvedorMySQL(Provedores s) throws SQLException{
        Conexion con = new Conexion();
        cnx = con.getConexion();
        
        String buscar = "SELECT * FROM Provedores WHERE NUMERO=?";
        PreparedStatement ps;
        
        ps = cnx.prepareStatement(buscar);
        ps.setInt(1, s.getNumero());
        ResultSet consulta = ps.executeQuery();
        
        if(consulta.next()){
            s.setNumero(Integer.parseInt(consulta.getString("NUMERO")));
            s.setNombre(consulta.getString("NOMBRE"));
            s.setApellido(consulta.getString("APELLIDO"));
            s.setMarca(consulta.getString("MARCA"));
            s.setCant(Integer.parseInt(consulta.getString("CANTIDAD")));
            s.setPago(Float.parseFloat(consulta.getString("PAGO")));
        }
        ps.close();
    }
    
    private ArrayList ReportesprovedorMySQL()throws SQLException{
        ArrayList<Provedores> prov = new ArrayList();
        Provedores pr;

        Conexion con = new Conexion();
        cnx = con.getConexion();

        String sql = "SELECT * FROM Provedores;";
        Statement sta = cnx.createStatement();
        ResultSet rs = sta.executeQuery(sql);

        while (rs.next()) {
            pr = new Provedores();
            pr.setNumero(Integer.parseInt(rs.getString("NUMERO")));
            pr.setNombre(rs.getString("NOMBRE"));
            pr.setApellido(rs.getString("APELLIDO"));
            pr.setMarca(rs.getString("MARCA"));
            pr.setCant(Integer.parseInt(rs.getString("CANTIDAD")));
            pr.setPago(Float.parseFloat(rs.getString("PAGO")));
            prov.add(pr);
        }
        cnx.close();
        return prov;

    }
        
    public void ImprimirRegistrosEmpleadoEnPDF() throws SQLException, FileNotFoundException, DocumentException {
        
        Conexion con = new Conexion();
        cnx = con.getConexion();
        
            // Consulta SQL para obtener los registros
            String consulta = "SELECT * FROM Provedores";

            Statement stmt = cnx.createStatement();
            ResultSet rs = stmt.executeQuery(consulta);

            // Crear el documento PDF
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("Registros Provedores.pdf"));
            document.open();

            // Agregar los registros al documento
            while (rs.next()) {
                String campo1 = rs.getString("ID");
                String campo2 = rs.getString("NUMERO");
                String campo3 = rs.getString("NOMBRE");
                String campo4 = rs.getString("APELLIDO");
                String campo5 = rs.getString("MARCA");
                String campo6 = rs.getString("CANTIDAD");
                String campo7 = rs.getString("PAGO");
//                Paragraph paragraph = new Paragraph("------------------------------------------------------------");
                Paragraph paragraph1 = new Paragraph("|" + " ID: " + campo1 + " | " + " Numero: " + campo2 + " | " 
                        + " Nombre: " + campo3 + " | " + " Apellido: " + campo4 + " | " + " Marca: " + campo5 + " | " 
                        + " Cantidad: " + campo6 + " | " + " Pago: " + campo7 + " |" + "\n\n");
                Paragraph paragraph2 = new Paragraph("--------------------------------------------------------------------------------------------------------------------------------");
//                document.add(paragraph);
                document.add(paragraph1);
                document.add(paragraph2);
            }

            document.close();
            rs.close();
            stmt.close();
            cnx.close();

            JOptionPane.showMessageDialog(null, "Los registros se han guardado en Registros Provedores.pdf");
    }
    
}
