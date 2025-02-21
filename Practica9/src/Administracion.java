import javax.swing.*;

public class Administracion {

    int cuenta;
    String titular;
    int edad;
    String saldo;

    public Object consulta(){
        double saldoFinal = Double.parseDouble(saldo);
        JOptionPane.showMessageDialog(null,  "Cuenta: " + cuenta + "\n"
        + "Titular: " + titular + "\n" + "Edad: " + edad + "\n" + "Saldo: $" + saldoFinal,"Consulta",1);
        return null;
    }//llaves consulta
    public void ingresa() {
        String monto = JOptionPane.showInputDialog(null,
                "Ingrese el monto que desea depositar a su cuenta", "Deposito a su cuenta",
                JOptionPane.QUESTION_MESSAGE);
        double montoFinal = Double.parseDouble(monto);
        double saldoFinal = Double.parseDouble(saldo);
        double total = saldoFinal + montoFinal;
        JOptionPane.showMessageDialog(null,  "Saldo: $" + saldoFinal + "\n"
                + "Monto: $" + montoFinal + "\n" + "Nuevo saldo: $" + total,"Deposito a su Cuenta",1);
    }//llaves ingresar
    public void retirar() {
        String monto = JOptionPane.showInputDialog(null,
                "Ingrese el monto que desea retirar de su cuenta", "Retiro de su cuenta",
                JOptionPane.QUESTION_MESSAGE);
        double montoFinal = Double.parseDouble(monto);
        double saldoFinal = Double.parseDouble(saldo);
        double total = saldoFinal - montoFinal;
        JOptionPane.showMessageDialog(null,  "Saldo: $" + saldoFinal + "\n"
                + "Monto retirado: $" + montoFinal + "\n" + "Saldo restante: $" + total,"Retiro de su Cuenta",1);
    }//llaves retirar
    public void depositoOtro() {
        String cuentaDes = JOptionPane.showInputDialog(null,
                "Ingrese la cuenta del destinatario al que desea depositar", "Deposito a otra Cuenta",
                JOptionPane.QUESTION_MESSAGE);
        String titularDes = JOptionPane.showInputDialog(null,
                "Ingrese el nombre del titular", "Nombre del titular",
                JOptionPane.QUESTION_MESSAGE);
        String monto = JOptionPane.showInputDialog(null,
                "Ingrese el monto que desea depositar a la cuenta", "Deposito a la cuenta" + cuentaDes,
                JOptionPane.QUESTION_MESSAGE);
        double saldoFinal = Double.parseDouble(saldo);
        double montoFinal = Double.parseDouble(monto);
        double total = saldoFinal - montoFinal;
        JOptionPane.showMessageDialog(null,  "Saldo: $" + saldoFinal + "\n"
                + "Monto depositado: $" + montoFinal + "\n" + "Saldo Restante: $" + total,"Deposito a la Cuenta" + cuentaDes,1);

    }
}//llaves de clase
