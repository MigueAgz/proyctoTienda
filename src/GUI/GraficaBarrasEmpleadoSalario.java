package GUI;

import GUI.daoEmpleado;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraficaBarrasEmpleadoSalario extends javax.swing.JPanel {
    private GUI.daoEmpleado daoEmpleado;
    private ArrayList<String> noms = new ArrayList();
    private ArrayList<Integer> horas = new ArrayList();
    private ArrayList<Float> pago = new ArrayList();
    private ArrayList<Float> salario = new ArrayList();
    
    private ArrayList<Float> array;
    private boolean isSorting;
    
    public GraficaBarrasEmpleadoSalario(){
    daoEmpleado = new GUI.daoEmpleado();
    ArrayList<Empleado> emps = daoEmpleado.Reportes();
    array = salario; 
    isSorting = false;
        
        for(Empleado e : emps){
            noms.add(e.getNom());
        }
        
        for(Empleado e : emps){
            horas.add(e.gethT());
        }
        
        for(Empleado e : emps){
            pago.add(e.getpH());
        }

        for(Empleado e : emps){
            salario.add(e.gethT() * e.getpH());
        }
        
        Thread sortingThread = new Thread(new InsertionSortRunnable());
                    sortingThread.start();
    }
    
        @Override
        protected void paintComponent(Graphics g) {
        super.paintComponent(g);

                int barWidth = getWidth() / salario.size();
                int maxCantidad = getMaxValue(salario);

                for (int i = 0; i < salario.size(); i++) {
                    int barHeight = (int) (((double) salario.get(i) / maxCantidad) * (getHeight() - 50));
                    int x = i * barWidth;
                    int y = getHeight() - barHeight;

                    g.setColor(new Color(255, 0, 0));
        

            for (Float ed : salario) {
                float c1 = (float) (Math.random()*100);
                float c2 = (float) (Math.random()*100);
                float c3 = (float) (Math.random()*100);
                g.setColor(Color.getHSBColor(c1, c2, c3));
                g.fillRect(x, y, barWidth, barHeight);
            }
                    
                    g.setColor(Color.BLACK);
                    g.drawString("Nombre:", x, getHeight() - 110);
                    g.drawString(noms.get(i), x, getHeight() - 95);
                    g.drawString("Pago:", x, getHeight() - 80);
                    g.drawString(String.valueOf(pago.get(i)), x, getHeight() - 65);
                    g.drawString("Horas:", x, getHeight() - 50);
                    g.drawString(String.valueOf(horas.get(i)), x, getHeight() - 35);
                    g.drawString("Salario:", x, getHeight() - 20);
                    g.drawString(String.valueOf(salario.get(i)), x, getHeight() - 5);
                }
            }
        
    private static int getMaxValue(ArrayList<Float> list) {
        int maxValue = Integer.MIN_VALUE;

        for (float value : list) {
            if (value > maxValue) {
                maxValue = (int) value;
            }
        }

        return maxValue;
    }
    
    private class InsertionSortRunnable implements Runnable {
        @Override
        public void run() {
            int n = array.size();
            for (int i = 1; i < n; i++) {
                float key = array.get(i);
                String kye = noms.get(i);
                int yek = horas.get(i);
                float yke = pago.get(i);
                int j = i - 1;

                while (j >= 0 && array.get(j) > key) {
                    array.set(j + 1, array.get(j));
                    noms.set(j + 1, noms.get(j));
                    horas.set(j + 1, horas.get(j));
                    pago.set(j + 1, pago.get(j));
                    j = j - 1;

                    repaint();

                    try {
                        Thread.sleep(1000); 
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                array.set(j + 1, key);
                noms.set(j + 1, kye);
                horas.set(j + 1, yek);
                pago.set(j + 1, yke);
                
                repaint();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            isSorting = false;
        }
    }
};
