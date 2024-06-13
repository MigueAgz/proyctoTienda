package GUI;

import GUI.daoProvedores;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraficaBarrasProvedorPago extends javax.swing.JPanel {
    private GUI.daoProvedores daoProvedores;
    private ArrayList<String> noms = new ArrayList();
    private ArrayList<String> marca = new ArrayList();
    private ArrayList<Float> pago = new ArrayList();
    
    private ArrayList<Float> array;
    private boolean isSorting;
    
    public GraficaBarrasProvedorPago(){
    daoProvedores = new GUI.daoProvedores();
    ArrayList<Provedores> prov = daoProvedores.Reportes();
    array = pago; 
    isSorting = false;
        
        for(Provedores e : prov){
            noms.add(e.getNombre());
        }
        
        for(Provedores e : prov){
            marca.add(e.getMarca());
        }

        for(Provedores e : prov){
            pago.add(e.getPago());
        }
        
        Thread sortingThread = new Thread(new InsertionSortRunnable());
                    sortingThread.start();
    }
    
        @Override
        protected void paintComponent(Graphics g) {
        super.paintComponent(g);

                int barWidth = getWidth() / pago.size();
                int maxCantidad = getMaxValue(pago);

                for (int i = 0; i < pago.size(); i++) {
                    int barHeight = (int) (((double) pago.get(i) / maxCantidad) * (getHeight() - 50));
                    int x = i * barWidth;
                    int y = getHeight() - barHeight;

                    g.setColor(new Color(255, 0, 0));
        

            for (Float ed : pago) {
                float c1 = (float) (Math.random()*100);
                float c2 = (float) (Math.random()*100);
                float c3 = (float) (Math.random()*100);
                g.setColor(Color.getHSBColor(c1, c2, c3));
                g.fillRect(x, y, barWidth, barHeight);
            }
                    
                    g.setColor(Color.BLACK);
                    g.drawString("Nombre:", x, getHeight() - 80);
                    g.drawString(noms.get(i), x, getHeight() - 65);
                    g.drawString("Marca:", x, getHeight() - 50);
                    g.drawString(marca.get(i), x, getHeight() - 35);
                    g.drawString("Pago:", x, getHeight() - 20);
                    g.drawString(String.valueOf(pago.get(i)), x, getHeight() - 5);
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