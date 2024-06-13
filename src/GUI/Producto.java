package GUI;

import java.io.Serializable;

public class Producto implements Serializable{
    private int numero, Stock;
    private String Nombre, Categoria;
    private float Precio;

    public int getNumero() {
        return numero;
    }

    public int getStock() {
        return Stock;
    }

    public String getNombre() {
        return Nombre;
    }

    public float getPrecio() {
        return Precio;
    }
    
    public String getCategoria() {
        return Categoria;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }
        
}        

