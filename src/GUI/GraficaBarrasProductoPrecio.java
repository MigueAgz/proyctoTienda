package GUI;

import GUI.daoProducto;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraficaBarrasProductoPrecio extends javax.swing.JPanel {
    private GUI.daoProducto daoProducto;
    private ArrayList<String> noms = new ArrayList();
    private ArrayList<Float> precio = new ArrayList();
    private ArrayList<String> cat = new ArrayList();
    
    private ArrayList<Float> array;
    private boolean isSorting;
    
    public GraficaBarrasProductoPrecio(){
    daoProducto = new GUI.daoProducto();
    ArrayList<Producto> prod = daoProducto.Reportes();
    array = precio; 
    isSorting = false;
        
        for(Producto p : prod){
            noms.add(p.getNombre());
        }
        
        for(Producto p : prod){
            cat.add(p.getCategoria());
        }

        for(Producto p : prod){
            precio.add(p.getPrecio());
        }
        
        Thread sortingThread = new Thread(new InsertionSortRunnable());
                    sortingThread.start();
    }
    
        @Override
        protected void paintComponent(Graphics g) {
        super.paintComponent(g);

                int barWidth = getWidth() / precio.size();
                int maxCantidad = getMaxValue(precio);

                for (int i = 0; i < precio.size(); i++) {
                    int barHeight = (int) (((double) precio.get(i) / maxCantidad) * (getHeight() - 50));
                    int x = i * barWidth;
                    int y = getHeight() - barHeight;

                    g.setColor(new Color(255, 0, 0));
        

            for (Float ed : precio) {
                float c1 = (float) (Math.random()*100);
                float c2 = (float) (Math.random()*100);
                float c3 = (float) (Math.random()*100);
                g.setColor(Color.getHSBColor(c1, c2, c3));
                g.fillRect(x, y, barWidth, barHeight);
            }
                    
                    g.setColor(Color.BLACK);
                    g.drawString(String.valueOf("Producto: "), x, getHeight() - 80);
                    g.drawString(noms.get(i), x, getHeight() - 65);
                    g.drawString(String.valueOf("Categoria: "), x, getHeight() - 50);
                    g.drawString(cat.get(i), x, getHeight() - 35);
                    g.drawString(String.valueOf("precio: "), x, getHeight() - 20);
                    g.drawString(String.valueOf(precio.get(i)), x, getHeight() - 5);
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
                String yek = cat.get(i);
                int j = i - 1;

                while (j >= 0 && array.get(j) > key) {
                    array.set(j + 1, array.get(j));
                    noms.set(j + 1, noms.get(j));
                    cat.set(j + 1, cat.get(j));
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
                cat.set(j + 1, yek);
                
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
