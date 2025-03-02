import javax.swing.*;

public class Vehiculo {

    private String placa;
    private String modelo;
    private double capacidad;

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
    }

    public void RegistrarVehiculo() {
        placa = JOptionPane.showInputDialog(null, "Ingrese la Placa del Vehiculo: ", "Vehiculo", JOptionPane.INFORMATION_MESSAGE);
        modelo = JOptionPane.showInputDialog(null, "Ingrese el modelo del Vehiculo: ", "Vehiculo", JOptionPane.INFORMATION_MESSAGE);
        capacidad = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la capacidad de carga del Vihiculo: ", "Vehiculo", JOptionPane.INFORMATION_MESSAGE));
    }
}
