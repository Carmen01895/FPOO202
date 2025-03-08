import javax.swing.*;

public class Empleado {

    protected String nombre;
    protected int id;
    protected double salario;


    public Empleado(String nombre, int id, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }

    public void registrarEmpleado() {
        nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado: ", "Registro", JOptionPane.PLAIN_MESSAGE);
        id = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID del empleado: ", "Registro", JOptionPane.PLAIN_MESSAGE));
        salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el salario del empleado: ", "Registro", JOptionPane.PLAIN_MESSAGE));
    }

    public void mostrarInfo() {
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nId: " + id + "\nSalario: " + salario, "Empleado", JOptionPane.INFORMATION_MESSAGE);
    }
    }

