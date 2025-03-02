import javax.swing.*;

public class Vehiculo {

    private String placa;
    private String modelo;
    private double capacidad;
    private Conductor conductor;

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public Vehiculo() {
        this.placa = placa;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.conductor = conductor;
    }

    public void RegistrarVehiculo() {
        placa = JOptionPane.showInputDialog(null, "Ingrese la Placa del Vehiculo: ", "Vehiculo", JOptionPane.PLAIN_MESSAGE);
        modelo = JOptionPane.showInputDialog(null, "Ingrese el modelo del Vehiculo: ", "Vehiculo", JOptionPane.PLAIN_MESSAGE);
        capacidad = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la capacidad de carga del Vihiculo: ", "Vehiculo", JOptionPane.PLAIN_MESSAGE));
    }

    public void AsignarConductor() {
         JOptionPane.showInputDialog(null, "Ingrese el nombre de su Conductor: " , "Asignar Conductor", JOptionPane.PLAIN_MESSAGE);
    }
}
