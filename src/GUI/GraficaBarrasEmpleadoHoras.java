package GUI;

import GUI.daoEmpleado;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraficaBarrasEmpleadoHoras extends javax.swing.JPanel {
    private GUI.daoEmpleado daoEmpleado;
    private ArrayList<String> noms = new ArrayList();
    private ArrayList<String> ape = new ArrayList();
    private ArrayList<Integer> horas = new ArrayList();
    
    private ArrayList<Integer> array;
    private boolean isSorting;
    
    public GraficaBarrasEmpleadoHoras(){
    daoEmpleado = new GUI.daoEmpleado();
    ArrayList<Empleado> emps = daoEmpleado.Reportes();
    array = horas; 
    isSorting = false;
        
        for(Empleado e : emps){
            noms.add(e.getNom());
        }
        
        for(Empleado e : emps){
            ape.add(e.getApe());
        }

        for(Empleado e : emps){
            horas.add(e.gethT());
        }
        
        Thread sortingThread = new Thread(new InsertionSortRunnable());
                    sortingThread.start();
    }
    
        @Override
        protected void paintComponent(Graphics g) {
        super.paintComponent(g);

                int barWidth = getWidth() / horas.size();
                int maxCantidad = getMaxValue(horas);

                for (int i = 0; i < horas.size(); i++) {
                    int barHeight = (int) (((double) horas.get(i) / maxCantidad) * (getHeight() - 50));
                    int x = i * barWidth;
                    int y = getHeight() - barHeight;

                    g.setColor(new Color(255, 0, 0));
        

            for (Integer ed : horas) {
                float c1 = (float) (Math.random()*100);
                float c2 = (float) (Math.random()*100);
                float c3 = (float) (Math.random()*100);
                g.setColor(Color.getHSBColor(c1, c2, c3));
                g.fillRect(x, y, barWidth, barHeight);
            }
                    
                    g.setColor(Color.BLACK);
                    g.drawString("Nombre:", x,  getHeight() - 80);
                    g.drawString(noms.get(i), x, getHeight() - 65);
                    g.drawString("Apellido:", x,  getHeight() - 50);
                    g.drawString(ape.get(i), x, getHeight() - 35);
                    g.drawString("Horas:", x,  getHeight() - 20);
                    g.drawString(String.valueOf(horas.get(i)), x, getHeight() - 5);
                }
            }
        
    private static int getMaxValue(ArrayList<Integer> list) {
        int maxValue = Integer.MIN_VALUE;

        for (int value : list) {
            if (value > maxValue) {
                maxValue = value;
            }
        }

        return maxValue;
    }
    
    private class InsertionSortRunnable implements Runnable {
        @Override
        public void run() {
            int n = array.size();
            for (int i = 1; i < n; i++) {
                int key = array.get(i);
                String kye = noms.get(i);
                String yek = ape.get(i);
                int j = i - 1;

                while (j >= 0 && array.get(j) > key) {
                    array.set(j + 1, array.get(j));
                    noms.set(j + 1, noms.get(j));
                    ape.set(j + 1, ape.get(j));
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
                ape.set(j + 1, yek);
                
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