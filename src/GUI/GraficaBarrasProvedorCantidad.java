package GUI;

import GUI.daoProvedores;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraficaBarrasProvedorCantidad extends javax.swing.JPanel {
    private GUI.daoProvedores daoProvedores;
    private ArrayList<String> noms = new ArrayList();
    private ArrayList<Integer> cantidad = new ArrayList();
    private ArrayList<String> marca = new ArrayList();
    
    private ArrayList<Integer> array;
    private boolean isSorting;
    
    public GraficaBarrasProvedorCantidad(){
    daoProvedores = new GUI.daoProvedores();
    ArrayList<Provedores> prod = daoProvedores.Reportes();
    array = cantidad; 
    isSorting = false;
        
        for(Provedores p : prod){
            noms.add(p.getNombre());
        }
        
        for(Provedores p : prod){
            marca.add(p.getMarca());
        }

        for(Provedores p : prod){
            cantidad.add(p.getCant());
        }
        
        Thread sortingThread = new Thread(new InsertionSortRunnable());
                    sortingThread.start();
    }
    
        @Override
        protected void paintComponent(Graphics g) {
        super.paintComponent(g);

                int barWidth = getWidth() / cantidad.size();
                int maxCantidad = getMaxValue(cantidad);

                for (int i = 0; i < cantidad.size(); i++) {
                    int barHeight = (int) (((double) cantidad.get(i) / maxCantidad) * (getHeight() - 50));
                    int x = i * barWidth;
                    int y = getHeight() - barHeight;

                    g.setColor(new Color(255, 0, 0));
        

            for (Integer ed : cantidad) {
                float c1 = (float) (Math.random()*100);
                float c2 = (float) (Math.random()*100);
                float c3 = (float) (Math.random()*100);
                g.setColor(Color.getHSBColor(c1, c2, c3));
                g.fillRect(x, y, barWidth, barHeight);
            }
                    
                    g.setColor(Color.BLACK);
                    g.drawString(String.valueOf("Provedor: "), x, getHeight() - 80);
                    g.drawString(noms.get(i), x, getHeight() - 65);
                    g.drawString(String.valueOf("Marca: "), x, getHeight() - 50);
                    g.drawString(marca.get(i), x, getHeight() - 35);
                    g.drawString(String.valueOf("Cantidad: "), x, getHeight() - 20);
                    g.drawString(String.valueOf(cantidad.get(i)), x, getHeight() - 5);
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
                String yek = marca.get(i);
                int j = i - 1;

                while (j >= 0 && array.get(j) > key) {
                    array.set(j + 1, array.get(j));
                    noms.set(j + 1, noms.get(j));
                    marca.set(j + 1, marca.get(j));
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
                marca.set(j + 1, yek);
                
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