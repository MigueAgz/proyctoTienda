package GUI;

import java.io.Serializable;

public class Empleado implements Serializable{
    private int numero, hT, edad;
    private float pH;
    private String nom, ape;

    public int getNumero() {
        return numero;
    }

    public int gethT() {
        return hT;
    }

    public int getEdad() {
        return edad;
    }

    public float getpH() {
        return pH;
    }

    public String getNom() {
        return nom;
    }

    public String getApe() {
        return ape;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void sethT(int hT) {
        this.hT = hT;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setpH(float pH) {
        this.pH = pH;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    @Override
    public String toString(){
        return String.format("%-5d %-20s %-20s %-10d %-10d %-10f", numero, nom, ape, edad, hT, pH);
    }
    
    public String[] toArray() {
            return new String[]{String.valueOf(numero),nom , ape, String.valueOf(edad), String.valueOf(hT), String.valueOf(pH)};
     }
}
