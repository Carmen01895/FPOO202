import javax.swing.*;

public class Entrega {

    private String guia;
    private String estado;

    public String getGuia() {
        return guia;
    }

    public void setGuia(String guia) {
        this.guia = guia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Entrega() {
        this.guia = guia;
        this.estado = "Pendiente";
    }

    public void entrega() {
        guia = JOptionPane.showInputDialog(null, "Ingrese el numero de Guia: ", "Entrega", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Estado: " + estado, "Entrega", JOptionPane.PLAIN_MESSAGE);
    }

    public void cambioEstado() {
        String cam = JOptionPane.showInputDialog(null, "Ingrese el numero de Guia: ", "Cambio de Estado", JOptionPane.PLAIN_MESSAGE);
        if (cam.equals(guia)) {
            int opc = Integer.parseInt(String.valueOf(JOptionPane.showConfirmDialog(null, "¿El envio ya fue entregado?", "Cambio de Estado", JOptionPane.YES_NO_OPTION)));
            if (opc == JOptionPane.YES_OPTION) {
                this.estado = "Entregado";
                JOptionPane.showMessageDialog(null, "El estado del envío ha sido cambiado a 'Entregado'.", "Cambio de Estado", JOptionPane.INFORMATION_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "El numero de guia no existe", "Cambio de Estado", JOptionPane.ERROR_MESSAGE);
        }
    }
}
