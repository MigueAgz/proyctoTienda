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
public class daoProducto implements GUI.IProducto{

    private Connection cnx;
    
    @Override
    public void Altas(Producto p) {
        try {
            crearProductoMySQl(p);
        } catch (SQLException ex) {
            Logger.getLogger(daoProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Bajas(Producto p) {
        try {
            BorrarProductoMySQL(p);
        } catch (SQLException ex) {
            Logger.getLogger(daoProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Modificar(Producto p) {
        try {
            ModificarProductoMySQL(p);
        } catch (SQLException ex) {
            Logger.getLogger(daoProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Consultar(Producto p) {
        try {
            ConsultarProductoMySQL(p);
        } catch (SQLException ex) {
            Logger.getLogger(daoProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<Producto> Reportes() {
        ArrayList<Producto> p = new ArrayList();
        
        try {
            p = readEmpleadosMySQL();
        } catch (SQLException ex) {
            Logger.getLogger(daoProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return p;
    }
    
    private void crearProductoMySQl(Producto p) throws SQLException{
        Conexion con = new Conexion();
        cnx = con.getConexion();
        
        String Altas = "INSERT INTO Producto(NUMERO, NOMBRE, CATEGORIA, STOCK, PRECIO) VALUES(?,?,?,?,?)";
        PreparedStatement ps;
        
        ps = cnx.prepareStatement(Altas);
        ps.setInt(1, p.getNumero());
        ps.setString(2, p.getNombre());
        ps.setString(3, p.getCategoria());
        ps.setInt(4, p.getStock());
        ps.setFloat(5, p.getPrecio());
        ps.executeUpdate();
        ps.close();
    }
    
    private void BorrarProductoMySQL(Producto p) throws SQLException{
        Conexion con = new Conexion();
        cnx = con.getConexion();
        
        String borrar = "DELETE FROM Producto WHERE NUMERO=?";
        PreparedStatement ps;
        
        ps = cnx.prepareStatement(borrar);
        ps.setInt(1, p.getNumero());
        ps.executeUpdate();
    }
    
    private void ModificarProductoMySQL(Producto p) throws SQLException{
        Conexion con = new Conexion();
        cnx = con.getConexion();
        
        String modificar = "UPDATE Producto SET NUMERO=?, NOMBRE=?, CATEGORIA=?, STOCK=?, PRECIO=? WHERE NUMERO = ?";
        PreparedStatement ps;
        
        ps = cnx.prepareStatement(modificar);
        ps.setInt(1, p.getNumero());
        ps.setString(2, p.getNombre());
        ps.setString(3, p.getCategoria());
        ps.setInt(4, p.getStock());
        ps.setFloat(5, p.getPrecio());
        ps.setInt(6, p.getNumero());
        ps.executeUpdate();
        ps.close();   
    }
    
    private void ConsultarProductoMySQL(Producto p) throws SQLException{
        Conexion con = new Conexion();
        cnx = con.getConexion();
        
        String buscar = "SELECT * FROM Producto WHERE NUMERO=?";
        PreparedStatement ps;
        
        ps = cnx.prepareStatement(buscar);
        ps.setInt(1, p.getNumero());
        ResultSet consulta = ps.executeQuery();
        
        if(consulta.next()){
            p.setNumero(Integer.parseInt(consulta.getString("NUMERO")));
            p.setNombre(consulta.getString("NOMBRE"));
            p.setCategoria(consulta.getString("CATEGORIA"));
            p.setStock(Integer.parseInt(consulta.getString("STOCK")));
            p.setPrecio(Float.parseFloat(consulta.getString("PRECIO")));
        }
        ps.close();
    }
    
    private ArrayList<Producto> readEmpleadosMySQL() throws SQLException {
        ArrayList<Producto> prod = new ArrayList();
        Producto p;

        Conexion con = new Conexion();
        cnx = con.getConexion();

        String sql = "SELECT * FROM Producto;";
        Statement sta = cnx.createStatement();
        ResultSet rs = sta.executeQuery(sql);

        while (rs.next()) {
            p = new Producto();
            p.setNumero(Integer.parseInt(rs.getString("NUMERO")));
            p.setNombre(rs.getString("NOMBRE"));
            p.setCategoria(rs.getString("CATEGORIA"));
            p.setStock(Integer.parseInt(rs.getString("STOCK")));
            p.setPrecio(Float.parseFloat(rs.getString("PRECIO")));
            prod.add(p);
        }
        cnx.close();
        return prod;
    }
    
    public void ImprimirRegistrosProductosEnPDF() throws SQLException, FileNotFoundException, DocumentException {
        
        Conexion con = new Conexion();
        cnx = con.getConexion();
        
            // Consulta SQL para obtener los registros
            String consulta = "SELECT * FROM Producto";

            Statement stmt = cnx.createStatement();
            ResultSet rs = stmt.executeQuery(consulta);

            // Crear el documento PDF
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("Registros Productos.pdf"));
            document.open();

            // Agregar los registros al documento
            while (rs.next()) {
                String campo1 = rs.getString("ID");
                String campo2 = rs.getString("NUMERO");
                String campo3 = rs.getString("NOMBRE");
                String campo4 = rs.getString("CATEGORIA");
                String campo5 = rs.getString("STOCK");
                String campo6 = rs.getString("PRECIO");
//                Paragraph paragraph = new Paragraph("------------------------------------------------------------");
                Paragraph paragraph1 = new Paragraph("|" + " ID: " + campo1 + " | " + " Numero: " + campo2 + " | " 
                        + " Nombre: " + campo3 + " | " + " Categoria: " + campo4 + " | " + " Stock: " + campo5 + " | " 
                        + " Precio: " + campo6 + " | " + "\n\n");
                Paragraph paragraph2 = new Paragraph("--------------------------------------------------------------------------------------------------------------------------------");
//                document.add(paragraph);
                document.add(paragraph1);
                document.add(paragraph2);
            }

            document.close();
            rs.close();
            stmt.close();
            cnx.close();

            JOptionPane.showMessageDialog(null, "Los registros se han guardado en Registros Productos.pdf");
    }
}
