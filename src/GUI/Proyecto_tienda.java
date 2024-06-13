package GUI;

import com.itextpdf.text.DocumentException;
import java.awt.BorderLayout;
import java.awt.Image;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


/**
 *
 * @author 
 */
public class Proyecto_tienda extends javax.swing.JFrame {

    public Proyecto_tienda() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        super.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        super.setTitle("UWU STORE");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Image icon = new ImageIcon(getClass().getResource("/Images/UwUStore.jpg")).getImage();
        setIconImage(icon);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jpnlPrincipal = new javax.swing.JPanel();
        JmebaTienda = new javax.swing.JMenuBar();
        menCatalogo = new javax.swing.JMenu();
        mnProducto = new javax.swing.JMenu();
        mnitAltasProd = new javax.swing.JMenuItem();
        mnitBajasProd = new javax.swing.JMenuItem();
        mnitConsultasProd = new javax.swing.JMenuItem();
        mnitModificarProd = new javax.swing.JMenuItem();
        mnitReportesProd = new javax.swing.JMenuItem();
        mnProvedores = new javax.swing.JMenu();
        mnitAltasProv = new javax.swing.JMenuItem();
        mnitBajasProv = new javax.swing.JMenuItem();
        mnitConsultasProv = new javax.swing.JMenuItem();
        mnitModificarProv = new javax.swing.JMenuItem();
        mnitReportesProv = new javax.swing.JMenuItem();
        mnEmpleados = new javax.swing.JMenu();
        mnitAltasEmp = new javax.swing.JMenuItem();
        mnitBajasEmp = new javax.swing.JMenuItem();
        mnitConsultasEmp = new javax.swing.JMenuItem();
        mnitModificarEmp = new javax.swing.JMenuItem();
        mnitReportesEmp = new javax.swing.JMenuItem();
        mnGraficas = new javax.swing.JMenu();
        mnGraficasEmpleados = new javax.swing.JMenu();
        mnimGraficaEmpleadosEdad = new javax.swing.JMenuItem();
        mnimGraficaEmpleadosHoras = new javax.swing.JMenuItem();
        mnimGraficaEmpleadosPago = new javax.swing.JMenuItem();
        mnimEmpleadoSalario = new javax.swing.JMenuItem();
        mnGraficasProductos = new javax.swing.JMenu();
        mnimGraficaProductoStock = new javax.swing.JMenuItem();
        mnimProductoPrecio = new javax.swing.JMenuItem();
        mnimProductoGanancia = new javax.swing.JMenuItem();
        mnGraficasProvedores = new javax.swing.JMenu();
        mnimProvedorCantidad = new javax.swing.JMenuItem();
        mnimProvedorPago = new javax.swing.JMenuItem();
        mnimProvedorPieza = new javax.swing.JMenuItem();
        mnPDF = new javax.swing.JMenu();
        mnimPDFEmpleado = new javax.swing.JMenuItem();
        mnimPDFProductos = new javax.swing.JMenuItem();
        mnimPDFPovedores = new javax.swing.JMenuItem();
        mnimComprar = new javax.swing.JMenuItem();
        mnimSalir = new javax.swing.JMenuItem();
        menAyuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jpnlPrincipal.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jpnlPrincipalLayout = new javax.swing.GroupLayout(jpnlPrincipal);
        jpnlPrincipal.setLayout(jpnlPrincipalLayout);
        jpnlPrincipalLayout.setHorizontalGroup(
            jpnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jpnlPrincipalLayout.setVerticalGroup(
            jpnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
        );

        menCatalogo.setText("Catalogo");

        mnProducto.setText("PRODUCTO");

        mnitAltasProd.setText("ALTAS");
        mnitAltasProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitAltasProdActionPerformed(evt);
            }
        });
        mnProducto.add(mnitAltasProd);

        mnitBajasProd.setText("BAJAS");
        mnitBajasProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitBajasProdActionPerformed(evt);
            }
        });
        mnProducto.add(mnitBajasProd);

        mnitConsultasProd.setText("CONSULTAS");
        mnitConsultasProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitConsultasProdActionPerformed(evt);
            }
        });
        mnProducto.add(mnitConsultasProd);

        mnitModificarProd.setText("MODIFICAR");
        mnitModificarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitModificarProdActionPerformed(evt);
            }
        });
        mnProducto.add(mnitModificarProd);

        mnitReportesProd.setText("REPORTES");
        mnitReportesProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitReportesProdActionPerformed(evt);
            }
        });
        mnProducto.add(mnitReportesProd);

        menCatalogo.add(mnProducto);

        mnProvedores.setText("PROVEDORES");

        mnitAltasProv.setText("ALTAS");
        mnitAltasProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitAltasProvActionPerformed(evt);
            }
        });
        mnProvedores.add(mnitAltasProv);

        mnitBajasProv.setText("BAJAS");
        mnitBajasProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitBajasProvActionPerformed(evt);
            }
        });
        mnProvedores.add(mnitBajasProv);

        mnitConsultasProv.setText("CONSULTAS");
        mnitConsultasProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitConsultasProvActionPerformed(evt);
            }
        });
        mnProvedores.add(mnitConsultasProv);

        mnitModificarProv.setText("MODIFICAR");
        mnitModificarProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitModificarProvActionPerformed(evt);
            }
        });
        mnProvedores.add(mnitModificarProv);

        mnitReportesProv.setText("REPORTES");
        mnitReportesProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitReportesProvActionPerformed(evt);
            }
        });
        mnProvedores.add(mnitReportesProv);

        menCatalogo.add(mnProvedores);

        mnEmpleados.setText("EMPLEADOS");

        mnitAltasEmp.setText("ALTAS");
        mnitAltasEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitAltasEmpActionPerformed(evt);
            }
        });
        mnEmpleados.add(mnitAltasEmp);

        mnitBajasEmp.setText("BAJAS");
        mnitBajasEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitBajasEmpActionPerformed(evt);
            }
        });
        mnEmpleados.add(mnitBajasEmp);

        mnitConsultasEmp.setText("CONSULTAS");
        mnitConsultasEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitConsultasEmpActionPerformed(evt);
            }
        });
        mnEmpleados.add(mnitConsultasEmp);

        mnitModificarEmp.setText("MODIFICAR");
        mnitModificarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitModificarEmpActionPerformed(evt);
            }
        });
        mnEmpleados.add(mnitModificarEmp);

        mnitReportesEmp.setText("REPORTES");
        mnitReportesEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitReportesEmpActionPerformed(evt);
            }
        });
        mnEmpleados.add(mnitReportesEmp);

        menCatalogo.add(mnEmpleados);

        mnGraficas.setText("GRAFICAS");

        mnGraficasEmpleados.setText("EMPLEADOS");

        mnimGraficaEmpleadosEdad.setText("EMPLEADO-EDAD");
        mnimGraficaEmpleadosEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnimGraficaEmpleadosEdadActionPerformed(evt);
            }
        });
        mnGraficasEmpleados.add(mnimGraficaEmpleadosEdad);

        mnimGraficaEmpleadosHoras.setText("EMPLEADO-HORAS");
        mnimGraficaEmpleadosHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnimGraficaEmpleadosHorasActionPerformed(evt);
            }
        });
        mnGraficasEmpleados.add(mnimGraficaEmpleadosHoras);

        mnimGraficaEmpleadosPago.setText("EMPLEADO-PAGO");
        mnimGraficaEmpleadosPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnimGraficaEmpleadosPagoActionPerformed(evt);
            }
        });
        mnGraficasEmpleados.add(mnimGraficaEmpleadosPago);

        mnimEmpleadoSalario.setText("EPLEADO-SALARIO");
        mnimEmpleadoSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnimEmpleadoSalarioActionPerformed(evt);
            }
        });
        mnGraficasEmpleados.add(mnimEmpleadoSalario);

        mnGraficas.add(mnGraficasEmpleados);

        mnGraficasProductos.setText("PRODUCTOS");

        mnimGraficaProductoStock.setText("PRODUCTO-STOCK");
        mnimGraficaProductoStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnimGraficaProductoStockActionPerformed(evt);
            }
        });
        mnGraficasProductos.add(mnimGraficaProductoStock);

        mnimProductoPrecio.setText("PRODUCTO-PRECIO");
        mnimProductoPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnimProductoPrecioActionPerformed(evt);
            }
        });
        mnGraficasProductos.add(mnimProductoPrecio);

        mnimProductoGanancia.setText("PRODUCTO-GANANCIA");
        mnimProductoGanancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnimProductoGananciaActionPerformed(evt);
            }
        });
        mnGraficasProductos.add(mnimProductoGanancia);

        mnGraficas.add(mnGraficasProductos);

        mnGraficasProvedores.setText("PROVEDORES");

        mnimProvedorCantidad.setText("PROVEDOR-CANTIDAD");
        mnimProvedorCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnimProvedorCantidadActionPerformed(evt);
            }
        });
        mnGraficasProvedores.add(mnimProvedorCantidad);

        mnimProvedorPago.setText("PROVEDOR-PAGO");
        mnimProvedorPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnimProvedorPagoActionPerformed(evt);
            }
        });
        mnGraficasProvedores.add(mnimProvedorPago);

        mnimProvedorPieza.setText("PROVEDOR-PIEZA");
        mnimProvedorPieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnimProvedorPiezaActionPerformed(evt);
            }
        });
        mnGraficasProvedores.add(mnimProvedorPieza);

        mnGraficas.add(mnGraficasProvedores);

        menCatalogo.add(mnGraficas);

        mnPDF.setText("IMPRIMIR PDF");

        mnimPDFEmpleado.setText("EMPLEADOS");
        mnimPDFEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnimPDFEmpleadoActionPerformed(evt);
            }
        });
        mnPDF.add(mnimPDFEmpleado);

        mnimPDFProductos.setText("PRODUCTOS");
        mnimPDFProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnimPDFProductosActionPerformed(evt);
            }
        });
        mnPDF.add(mnimPDFProductos);

        mnimPDFPovedores.setText("PROVEDORES");
        mnimPDFPovedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnimPDFPovedoresActionPerformed(evt);
            }
        });
        mnPDF.add(mnimPDFPovedores);

        menCatalogo.add(mnPDF);

        mnimComprar.setText("COMPRAR");
        mnimComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnimComprarActionPerformed(evt);
            }
        });
        menCatalogo.add(mnimComprar);

        mnimSalir.setText("SALIR");
        mnimSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnimSalirActionPerformed(evt);
            }
        });
        menCatalogo.add(mnimSalir);

        JmebaTienda.add(menCatalogo);

        menAyuda.setText("Ayuda");
        JmebaTienda.add(menAyuda);

        setJMenuBar(JmebaTienda);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }                       

    private void mnitBajasProdActionPerformed(java.awt.event.ActionEvent evt) {                                              
        Bajaspp bp = new Bajaspp();
        bp.setSize(500,400);
        bp.setLocation(0,0);
        
        jpnlPrincipal.removeAll();
        jpnlPrincipal.add(bp, BorderLayout.CENTER);
        jpnlPrincipal.revalidate();
        jpnlPrincipal.repaint();        
    }                                             

    private void mnitAltasProdActionPerformed(java.awt.event.ActionEvent evt) {                                              
        Altaspp ap = new Altaspp();
        ap.setSize(500,400);
        ap.setLocation(0,0);
        
        jpnlPrincipal.removeAll();
        jpnlPrincipal.add(ap, BorderLayout.CENTER);
        jpnlPrincipal.revalidate();
        jpnlPrincipal.repaint();
    }                                             

    private void mnitConsultasProdActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        Consultaspp op = new Consultaspp();
        op.setSize(500,400);
        op.setLocation(0,0);
        
        jpnlPrincipal.removeAll();
        jpnlPrincipal.add(op, BorderLayout.CENTER);
        jpnlPrincipal.revalidate();
        jpnlPrincipal.repaint();
    }                                                 

    private void mnitModificarProdActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        Modificarpp mp = new Modificarpp();
        mp.setSize(500,400);
        mp.setLocation(0,0);
        
        jpnlPrincipal.removeAll();
        jpnlPrincipal.add(mp, BorderLayout.CENTER);
        jpnlPrincipal.revalidate();
        jpnlPrincipal.repaint();
    }                                                 

    private void mnitReportesProdActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        Reportespp rp = new Reportespp();
        rp.setSize(500,400);
        rp.setLocation(0,0);
        
        jpnlPrincipal.removeAll();
        jpnlPrincipal.add(rp, BorderLayout.CENTER);
        jpnlPrincipal.revalidate();
        jpnlPrincipal.repaint();
    }                                                

    private void mnimSalirActionPerformed(java.awt.event.ActionEvent evt) {                                          
        System.exit(0);
    }                                         

    private void mnitAltasProvActionPerformed(java.awt.event.ActionEvent evt) {                                              
        Altaspprov apr = new Altaspprov();
        apr.setSize(500,400);
        apr.setLocation(0,0);
        
        jpnlPrincipal.removeAll();
        jpnlPrincipal.add(apr, BorderLayout.CENTER);
        jpnlPrincipal.revalidate();
        jpnlPrincipal.repaint();
    }                                             

    private void mnitBajasProvActionPerformed(java.awt.event.ActionEvent evt) {                                              
        Bajaspprov bpr = new Bajaspprov();
        bpr.setSize(500,400);
        bpr.setLocation(0,0);
        
        jpnlPrincipal.removeAll();
        jpnlPrincipal.add(bpr, BorderLayout.CENTER);
        jpnlPrincipal.revalidate();
        jpnlPrincipal.repaint();
    }                                             

    private void mnitConsultasProvActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        Consultaspprov opr = new Consultaspprov();
        opr.setSize(500,400);
        opr.setLocation(0,0);
        
        jpnlPrincipal.removeAll();
        jpnlPrincipal.add(opr, BorderLayout.CENTER);
        jpnlPrincipal.revalidate();
        jpnlPrincipal.repaint();
    }                                                 

    private void mnitModificarProvActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        Modificacionespprov mpr = new Modificacionespprov();
        mpr.setSize(500,400);
        mpr.setLocation(0,0);
        
        jpnlPrincipal.removeAll();
        jpnlPrincipal.add(mpr, BorderLayout.CENTER);
        jpnlPrincipal.revalidate();
        jpnlPrincipal.repaint();
    }                                                 

    private void mnitReportesProvActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        Reportespprov rpr = new Reportespprov();
        rpr.setSize(500,400);
        rpr.setLocation(0,0);
        
        jpnlPrincipal.removeAll();
        jpnlPrincipal.add(rpr, BorderLayout.CENTER);
        jpnlPrincipal.revalidate();
        jpnlPrincipal.repaint();
    }                                                

    private void mnitAltasEmpActionPerformed(java.awt.event.ActionEvent evt) {                                             
        Altase ae = new Altase();
        ae.setSize(500,400);
        ae.setLocation(0,0);
        
        jpnlPrincipal.removeAll();
        jpnlPrincipal.add(ae, BorderLayout.CENTER);
        jpnlPrincipal.revalidate();
        jpnlPrincipal.repaint();
    }                                            

    private void mnitBajasEmpActionPerformed(java.awt.event.ActionEvent evt) {                                             
        Bajase be = new Bajase();
        be.setSize(500,400);
        be.setLocation(0,0);
        
        jpnlPrincipal.removeAll();
        jpnlPrincipal.add(be, BorderLayout.CENTER);
        jpnlPrincipal.revalidate();
        jpnlPrincipal.repaint();
    }                                            

    private void mnitConsultasEmpActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        Consultase ce = new Consultase();
        ce.setSize(500,400);
        ce.setLocation(0,0);
        
        jpnlPrincipal.removeAll();
        jpnlPrincipal.add(ce, BorderLayout.CENTER);
        jpnlPrincipal.revalidate();
        jpnlPrincipal.repaint();
    }                                                

    private void mnitModificarEmpActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        Modificacionese me = new Modificacionese();
        me.setSize(500,400);
        me.setLocation(0,0);
        
        jpnlPrincipal.removeAll();
        jpnlPrincipal.add(me, BorderLayout.CENTER);
        jpnlPrincipal.revalidate();
        jpnlPrincipal.repaint();
    }                                                

    private void mnitReportesEmpActionPerformed(java.awt.event.ActionEvent evt) {                                                
        Reportese re = new Reportese();
        re.setSize(500,400);
        re.setLocation(0,0);
        
        jpnlPrincipal.removeAll();
        jpnlPrincipal.add(re, BorderLayout.CENTER);
        jpnlPrincipal.revalidate();
        jpnlPrincipal.repaint();
    }                                               

    private void mnimGraficaEmpleadosEdadActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        GraficaBarrasEmpleadoEdad ins = new GraficaBarrasEmpleadoEdad();
        ins.setSize(500,400);
        ins.setLocation(0,0);
        
        jpnlPrincipal.removeAll();
        jpnlPrincipal.add(ins, BorderLayout.CENTER);
        jpnlPrincipal.revalidate();
        jpnlPrincipal.repaint();
    }                                                        

    private void mnimGraficaEmpleadosHorasActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        GraficaBarrasEmpleadoHoras ins = new GraficaBarrasEmpleadoHoras();
        ins.setSize(500,400);
        ins.setLocation(0,0);
        
        jpnlPrincipal.removeAll();
        jpnlPrincipal.add(ins, BorderLayout.CENTER);
        jpnlPrincipal.revalidate();
        jpnlPrincipal.repaint();
    }                                                         

    private void mnimGraficaEmpleadosPagoActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        GraficaBarrasEmpleadoPago ins = new GraficaBarrasEmpleadoPago();
        ins.setSize(500,400);
        ins.setLocation(0,0);
        
        jpnlPrincipal.removeAll();
        jpnlPrincipal.add(ins, BorderLayout.CENTER);
        jpnlPrincipal.revalidate();
        jpnlPrincipal.repaint();
    }                                                        

    private void mnimEmpleadoSalarioActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        GraficaBarrasEmpleadoSalario ins = new GraficaBarrasEmpleadoSalario();
        ins.setSize(500,400);
        ins.setLocation(0,0);
        
        jpnlPrincipal.removeAll();
        jpnlPrincipal.add(ins, BorderLayout.CENTER);
        jpnlPrincipal.revalidate();
        jpnlPrincipal.repaint();
    }                                                   

    private void mnimPDFEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {                                                
        daoEmpleado pdfe = new daoEmpleado();
        try {
            pdfe.ImprimirRegistrosEmpleadoEnPDF();
        } catch (SQLException ex) {
            Logger.getLogger(Proyecto_tienda.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Proyecto_tienda.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(Proyecto_tienda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                               

    private void mnimPDFPovedoresActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        daoProvedores pdfprov = new daoProvedores();
        try {
            pdfprov.ImprimirRegistrosEmpleadoEnPDF();
        } catch (SQLException ex) {
            Logger.getLogger(Proyecto_tienda.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Proyecto_tienda.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(Proyecto_tienda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                                

    private void mnimPDFProductosActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        daoProducto pdfprod = new daoProducto();
        try {
            pdfprod.ImprimirRegistrosProductosEnPDF();
        } catch (SQLException ex) {
            Logger.getLogger(Proyecto_tienda.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Proyecto_tienda.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(Proyecto_tienda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                                

    private void mnimGraficaProductoStockActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        GraficaBarrasProductoStock ins = new GraficaBarrasProductoStock();
        ins.setSize(500,400);
        ins.setLocation(0,0);
        
        jpnlPrincipal.removeAll();
        jpnlPrincipal.add(ins, BorderLayout.CENTER);
        jpnlPrincipal.revalidate();
        jpnlPrincipal.repaint();
    }                                                        

    private void mnimProductoPrecioActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        GraficaBarrasProductoPrecio ins = new GraficaBarrasProductoPrecio();
        ins.setSize(500,400);
        ins.setLocation(0,0);
        
        jpnlPrincipal.removeAll();
        jpnlPrincipal.add(ins, BorderLayout.CENTER);
        jpnlPrincipal.revalidate();
        jpnlPrincipal.repaint();
    }                                                  

    private void mnimProductoGananciaActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        GraficaBarrasProductoGanancia ins = new GraficaBarrasProductoGanancia();
        ins.setSize(500,400);
        ins.setLocation(0,0);
        
        jpnlPrincipal.removeAll();
        jpnlPrincipal.add(ins, BorderLayout.CENTER);
        jpnlPrincipal.revalidate();
        jpnlPrincipal.repaint();
    }                                                    

    private void mnimProvedorCantidadActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        GraficaBarrasProvedorCantidad ins = new GraficaBarrasProvedorCantidad();
        ins.setSize(500,400);
        ins.setLocation(0,0);
        
        jpnlPrincipal.removeAll();
        jpnlPrincipal.add(ins, BorderLayout.CENTER);
        jpnlPrincipal.revalidate();
        jpnlPrincipal.repaint();
    }                                                    

    private void mnimProvedorPagoActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        GraficaBarrasProvedorPago ins = new GraficaBarrasProvedorPago();
        ins.setSize(500,400);
        ins.setLocation(0,0);
        
        jpnlPrincipal.removeAll();
        jpnlPrincipal.add(ins, BorderLayout.CENTER);
        jpnlPrincipal.revalidate();
        jpnlPrincipal.repaint();
    }                                                

    private void mnimProvedorPiezaActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        GraficaBarrasProvedorPieza ins = new GraficaBarrasProvedorPieza();
        ins.setSize(500,400);
        ins.setLocation(0,0);
        
        jpnlPrincipal.removeAll();
        jpnlPrincipal.add(ins, BorderLayout.CENTER);
        jpnlPrincipal.revalidate();
        jpnlPrincipal.repaint();
    }                                                 

    private void mnimComprarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        Comprar ins = new Comprar();
        ins.setSize(500,400);
        ins.setLocation(0,0);
        
        jpnlPrincipal.removeAll();
        jpnlPrincipal.add(ins, BorderLayout.CENTER);
        jpnlPrincipal.revalidate();
        jpnlPrincipal.repaint();
    }                                           

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Proyecto_tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proyecto_tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proyecto_tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proyecto_tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proyecto_tienda().setVisible(true);
            }
        });
    }

    private javax.swing.JMenuBar JmebaTienda;
    private javax.swing.JPanel jpnlPrincipal;
    private javax.swing.JMenu menAyuda;
    private javax.swing.JMenu menCatalogo;
    private javax.swing.JMenu mnEmpleados;
    private javax.swing.JMenu mnGraficas;
    private javax.swing.JMenu mnGraficasEmpleados;
    private javax.swing.JMenu mnGraficasProductos;
    private javax.swing.JMenu mnGraficasProvedores;
    private javax.swing.JMenu mnPDF;
    private javax.swing.JMenu mnProducto;
    private javax.swing.JMenu mnProvedores;
    private javax.swing.JMenuItem mnimComprar;
    private javax.swing.JMenuItem mnimEmpleadoSalario;
    private javax.swing.JMenuItem mnimGraficaEmpleadosEdad;
    private javax.swing.JMenuItem mnimGraficaEmpleadosHoras;
    private javax.swing.JMenuItem mnimGraficaEmpleadosPago;
    private javax.swing.JMenuItem mnimGraficaProductoStock;
    private javax.swing.JMenuItem mnimPDFEmpleado;
    private javax.swing.JMenuItem mnimPDFPovedores;
    private javax.swing.JMenuItem mnimPDFProductos;
    private javax.swing.JMenuItem mnimProductoGanancia;
    private javax.swing.JMenuItem mnimProductoPrecio;
    private javax.swing.JMenuItem mnimProvedorCantidad;
    private javax.swing.JMenuItem mnimProvedorPago;
    private javax.swing.JMenuItem mnimProvedorPieza;
    private javax.swing.JMenuItem mnimSalir;
    private javax.swing.JMenuItem mnitAltasEmp;
    private javax.swing.JMenuItem mnitAltasProd;
    private javax.swing.JMenuItem mnitAltasProv;
    private javax.swing.JMenuItem mnitBajasEmp;
    private javax.swing.JMenuItem mnitBajasProd;
    private javax.swing.JMenuItem mnitBajasProv;
    private javax.swing.JMenuItem mnitConsultasEmp;
    private javax.swing.JMenuItem mnitConsultasProd;
    private javax.swing.JMenuItem mnitConsultasProv;
    private javax.swing.JMenuItem mnitModificarEmp;
    private javax.swing.JMenuItem mnitModificarProd;
    private javax.swing.JMenuItem mnitModificarProv;
    private javax.swing.JMenuItem mnitReportesEmp;
    private javax.swing.JMenuItem mnitReportesProd;
    private javax.swing.JMenuItem mnitReportesProv;
}