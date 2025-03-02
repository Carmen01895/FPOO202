import javax.swing.JOptionPane;
public class Envio {

    private static String codigoEnvio;
    private static String destino;
    private static double peso;

    public String getCodigoEnvio() {
        return codigoEnvio;
    }

    public void setCodigoEnvio(String codigoEnvio) {
        this.codigoEnvio = codigoEnvio;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    //Constructor Sobrecargado
    public Envio(){
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.peso = peso;
    }

    public Envio(String codigoEnvio, String destino, double peso){
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.peso = 0;
    }

    public static Envio crearEnvio(){
        codigoEnvio = JOptionPane.showInputDialog("Introduce el código del envío:");
        destino = JOptionPane.showInputDialog("Introduce el destino del envío:");
        String pesoInp = JOptionPane.showInputDialog("Introduce el peso del envío (Cancelar si no desea ingresarlo):");

        if (pesoInp != null && !pesoInp.isEmpty()) {
            peso = Double.parseDouble(pesoInp);
            return new Envio();
        } else {
            return new Envio();
        }
    }
}

