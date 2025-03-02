import javax.swing.*;
public class Main {
    public static void main(String[] args) {

        Vehiculo vehiculo = new Vehiculo();
        Conductor conductor = new Conductor();
        Envio envio = new Envio();
        Entrega entrega = new Entrega();

        while (true) {
            String opcion = JOptionPane.showInputDialog(
                    "Seleccione una opción:\n" +
                            "1. Registrar Vehículo\n" +
                            "2. Registrar Conductor\n" +
                            "3. Asignar Conductor a Vehículo\n" +
                            "4. Registrar Envío\n" +
                            "5. Registrar Entrega\n" +
                            "6. Actualizar Estado de Entrega\n" +
                            "7. Mostrar Información\n" +
                            "8. Salir");

            switch (opcion) {
                case "1":
                    JOptionPane.showMessageDialog(null, "Registrar Vehículo");
                    vehiculo.RegistrarVehiculo();
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "Registrar Conductor");
                    conductor.RegistrarConductor();
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Asignar Conductor a Vehículo");
                    vehiculo.AsignarConductor();
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "Registrar Envio");
                    Envio envio1 = Envio.crearEnvio();
                    break;
                case "5":
                    JOptionPane.showMessageDialog(null, "Registrar Entrega");
                    entrega.entrega();
                    break;
                case "6":
                    JOptionPane.showMessageDialog(null, "Actualizar Estado de Entrega");
                    entrega.cambioEstado();
                    break;
                case "7":
                    Object opciones = JOptionPane.showInputDialog(null,
                            "Consultar Información de: ", "Información",
                            JOptionPane.INFORMATION_MESSAGE, null, new Object[]
                                    {"Vehículos","Conductores", "Envios", "Entregas"}, "Femenino");
                    if (opciones == "Vehículos") {
                        JOptionPane.showMessageDialog(null, "Placa: "+ vehiculo.getPlaca() + "\nModelo: " + vehiculo.getModelo() +
                                "\nCapacidad de Carga: "+ vehiculo.getCapacidad() + "\nConductor: " + conductor.getNombre(), "Informacion Vehiculo",
                                JOptionPane.INFORMATION_MESSAGE);
                    }else if (opciones == "Conductores") {
                        JOptionPane.showMessageDialog(null, "Nombre: "+ conductor.getNombre() + "\nIdentificación: " + conductor.getIdentificacion() +
                                        "\nLicencia: "+ conductor.getLicencia(), "Informacion Conductor",
                                JOptionPane.INFORMATION_MESSAGE);
                    } else if (opciones == "Envios") {
                        JOptionPane.showMessageDialog(null, "CodigoEnvio: "+ envio.getCodigoEnvio() + "\nDestino: " + envio.getDestino() +
                                        "\nPeso: "+ envio.getPeso(), "Informacion Vehiculo",
                                JOptionPane.INFORMATION_MESSAGE);
                    }else if (opciones == "Entregas") {
                        JOptionPane.showMessageDialog(null, "Guia: "+ entrega.getGuia() + "\nEstado: " + entrega.getEstado()
                                , "Informacion Vehiculo", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case "8":
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        }
    }
}