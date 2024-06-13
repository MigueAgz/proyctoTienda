package GUI;

import GUI.daoProducto;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraficaBarrasProductoGanancia extends javax.swing.JPanel {
    private GUI.daoProducto daoProducto;
    private ArrayList<String> noms = new ArrayList();
    private ArrayList<Float> gana = new ArrayList();
    private ArrayList<Float> precio = new ArrayList();
    private ArrayList<Integer> stock = new ArrayList();
    
    private ArrayList<Float> array;
    private boolean isSorting;
    
    public GraficaBarrasProductoGanancia(){
    daoProducto = new GUI.daoProducto();
    ArrayList<Producto> prod = daoProducto.Reportes();
    array = gana; 
    isSorting = false;
        
        for(Producto p : prod){
            noms.add(p.getNombre());
        }
        
        for(Producto p : prod){
            precio.add(p.getPrecio());
        }
        
        for(Producto p : prod){
            stock.add(p.getStock());
        }

        for(Producto p : prod){
            gana.add(p.getPrecio() * p.getStock());
        }
        
        Thread sortingThread = new Thread(new InsertionSortRunnable());
                    sortingThread.start();
    }
    
        @Override
        protected void paintComponent(Graphics g) {
        super.paintComponent(g);

                int barWidth = getWidth() / gana.size();
                int maxCantidad = getMaxValue(gana);

                for (int i = 0; i < gana.size(); i++) {
                    int barHeight = (int) (((double) gana.get(i) / maxCantidad) * (getHeight() - 50));
                    int x = i * barWidth;
                    int y = getHeight() - barHeight;

                    g.setColor(new Color(255, 0, 0));
        

            for (Float ed : gana) {
                float c1 = (float) (Math.random()*100);
                float c2 = (float) (Math.random()*100);
                float c3 = (float) (Math.random()*100);
                g.setColor(Color.getHSBColor(c1, c2, c3));
                g.fillRect(x, y, barWidth, barHeight);
            }
                    
                    g.setColor(Color.BLACK);
                    g.drawString("Producto: ", x, getHeight() - 110);
                    g.drawString(noms.get(i), x, getHeight() - 95);
                    g.drawString("Precio: ", x, getHeight() - 80);
                    g.drawString(String.valueOf(precio.get(i)), x, getHeight() - 65);
                    g.drawString("Stock: ", x, getHeight() - 50);
                    g.drawString(String.valueOf(stock.get(i)), x, getHeight() - 35);
                    g.drawString("ganancia: ", x, getHeight() - 20);
                    g.drawString(String.valueOf(gana.get(i)), x, getHeight() - 5);
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
                float yek = precio.get(i);
                int yke = stock.get(i);
                int j = i - 1;

                while (j >= 0 && array.get(j) > key) {
                    array.set(j + 1, array.get(j));
                    noms.set(j + 1, noms.get(j));
                    precio.set(j + 1, precio.get(j));
                    stock.set(j + 1, stock.get(j));
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
                precio.set(j + 1, yek);
                stock.set(j + 1, yke);
                
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
