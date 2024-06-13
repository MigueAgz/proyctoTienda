package GUI;

import java.io.Serializable;

public class Provedores implements Serializable{
    private int numero, cant;
    private String nombre, apellido, marca;
    private float pago;

    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getMarca() {
        return marca;
    }

    public int getCant() {
        return cant;
    }
    
    public float getPago() {
        return pago;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
    
    public void setPago(float pago) {
        this.pago = pago;
    }

    public Object getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getcT() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object gettot() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
