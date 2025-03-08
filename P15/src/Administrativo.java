import javax.swing.*;

public class Administrativo extends Empleado {

    private String departamento;

    public Administrativo(String nombre, int id, double salario, String departamento) {
        super(nombre, id, salario);
        this.departamento = departamento;
    }

    @Override
    public void registrarEmpleado() {
        super.registrarEmpleado();
        departamento = JOptionPane.showInputDialog(null, "Ingrese el departamento de la empleado", "Registro", JOptionPane.PLAIN_MESSAGE);
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        JOptionPane.showMessageDialog(null, "\n Departamento: " + this.departamento);
    }
}
