package GUI;

import java.util.ArrayList;

/**
 *
 * @author 
 */
public interface IProvedores {
    public void Altas(Provedores s);
    public void Bajas(Provedores s);
    public void Modificar(Provedores s);
    public void Consultar(Provedores s);
    ArrayList<Provedores> Reportes();
}
