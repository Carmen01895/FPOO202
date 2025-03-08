import javax.swing.*;

public class Conductor extends Empleado{

    private String Licencia;

    public Conductor(String nombre, int id, double salario, String licencia) {
        super(nombre, id, salario);
        Licencia = Licencia;
    }
    @Override
    public void registrarEmpleado(){
        super.registrarEmpleado();
        Licencia = JOptionPane.showInputDialog(null, "Ingrese la licencia del Conductor", "Registro", JOptionPane.PLAIN_MESSAGE);
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        JOptionPane.showMessageDialog(null, "\nLicencia: "+ Licencia);
    }
}
