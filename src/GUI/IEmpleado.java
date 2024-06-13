package GUI;

import java.util.ArrayList;

/**
 *
 * @author 
 */
public interface IEmpleado {
    public void Altas(Empleado e);
    public void Bajas(Empleado e);
    public void Modificar(Empleado e);
    public void Consultar(Empleado e);
    ArrayList<Empleado> Reportes();
}
