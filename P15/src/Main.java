import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Empleado empleado = new Empleado(" ", 0, 0);
        Conductor conductor = new Conductor(" ", 0, 0, " ");
        Administrativo administrativo = new Administrativo(" ", 0, 0, " ");

        while (true) {
            Object op = JOptionPane.showInputDialog(null, "¿Que desea realizar?", "Gestión de Empleados", JOptionPane.QUESTION_MESSAGE, null, new Object[]
                    {"Registrar Empleado", "Ver Empleados"}, "Registrar Empleado");

            if (op.equals("Registrar Empleado")) {

                Object opc = JOptionPane.showInputDialog(null, "Seleccione el tipo de empleado", "Registro",
                        JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Conductor", "Administrativo"}, "Conductor");
                if (opc.equals("Conductor")) {
                    conductor.registrarEmpleado();
                } else if (opc.equals("Administrativo")) {
                    administrativo.registrarEmpleado();
                }

            } else if (op.equals("Ver Empleados")) {
                Object opc = JOptionPane.showInputDialog(null, "Seleccione el tipo de empleado ", "Información",
                        JOptionPane.INFORMATION_MESSAGE, null, new Object[]{"Conductor", "Administrativo"}, "Conductor");
                if (opc.equals("Conductor")) {
                    conductor.mostrarInfo();
                } else if (opc.equals("Administrativo")) {
                    administrativo.mostrarInfo();
                }
            }
        }
    }
}