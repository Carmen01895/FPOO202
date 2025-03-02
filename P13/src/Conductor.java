import javax.swing.*;

public class Conductor {

    private String nombre;
    private String licencia;
    private String identificacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public Conductor() {
        this.nombre = nombre;
        this.licencia = licencia;
        this.identificacion = identificacion;
    }

    public void RegistrarConductor() {
        nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del conductor", "Conductor", JOptionPane.PLAIN_MESSAGE);
        identificacion = JOptionPane.showInputDialog(null, "Ingrese la identificación del conductor", "Conductor", JOptionPane.PLAIN_MESSAGE);
        licencia = JOptionPane.showInputDialog(null, "Ingrese la licencia del conductor", "Conductor", JOptionPane.PLAIN_MESSAGE);
    }
}
