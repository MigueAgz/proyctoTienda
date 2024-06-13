package GUI;

import GUI.daoProvedores;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraficaBarrasProvedorPieza extends javax.swing.JPanel {
    private GUI.daoProvedores daoProvedores;
    private ArrayList<String> marca = new ArrayList();
    private ArrayList<Float> pieza = new ArrayList();
    private ArrayList<Float> pago = new ArrayList();
    private ArrayList<Integer> cantidad = new ArrayList();
    
    private ArrayList<Float> array;
    private boolean isSorting;
    
    public GraficaBarrasProvedorPieza(){
    daoProvedores = new GUI.daoProvedores();
    ArrayList<Provedores> prod = daoProvedores.Reportes();
    array = pieza; 
    isSorting = false;
        
        for(Provedores p : prod){
            marca.add(p.getMarca());
        }
        
        for(Provedores p : prod){
            pago.add(p.getPago());
        }
        
        for(Provedores p : prod){
            cantidad.add(p.getCant());
        }

        for(Provedores p : prod){
            pieza.add(p.getPago() / p.getCant());
        }
        
        Thread sortingThread = new Thread(new InsertionSortRunnable());
                    sortingThread.start();
    }
    
        @Override
        protected void paintComponent(Graphics g) {
        super.paintComponent(g);

                int barWidth = getWidth() / pieza.size();
                int maxCantidad = getMaxValue(pieza);

                for (int i = 0; i < pieza.size(); i++) {
                    int barHeight = (int) (((double) pieza.get(i) / maxCantidad) * (getHeight() - 50));
                    int x = i * barWidth;
                    int y = getHeight() - barHeight;

                    g.setColor(new Color(255, 0, 0));
        

            for (Float ed : pieza) {
                float c1 = (float) (Math.random()*100);
                float c2 = (float) (Math.random()*100);
                float c3 = (float) (Math.random()*100);
                g.setColor(Color.getHSBColor(c1, c2, c3));
                g.fillRect(x, y, barWidth, barHeight);
            }
                    
                    g.setColor(Color.BLACK);
                    g.drawString("Marca:", x, getHeight() - 110);
                    g.drawString(marca.get(i), x, getHeight() - 95);
                    g.drawString("Cantidad:", x, getHeight() - 80);
                    g.drawString(String.valueOf(cantidad.get(i)), x, getHeight() - 65);
                    g.drawString("Pago:", x, getHeight() - 50);
                    g.drawString(String.valueOf(pago.get(i)), x, getHeight() - 35);
                    g.drawString("Pieza", x, getHeight() - 20);
                    g.drawString(String.valueOf(pieza.get(i)), x, getHeight() - 5);
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
                String kye = marca.get(i);
                float yek = pago.get(i);
                int yke = cantidad.get(i);
                int j = i - 1;

                while (j >= 0 && array.get(j) > key) {
                    array.set(j + 1, array.get(j));
                    marca.set(j + 1, marca.get(j));
                    pago.set(j + 1, pago.get(j));
                    cantidad.set(j + 1, cantidad.get(j));
                    j = j - 1;

                    repaint();

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                array.set(j + 1, key);
                marca.set(j + 1, kye);
                pago.set(j + 1, yek);
                cantidad.set(j + 1, yke);

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