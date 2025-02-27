import javax.swing.*;

public class Administracion {

    private int cuenta;
    private String titular;
    private int edad;
    private String saldo;

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public Administracion() {
        this.cuenta = cuenta;
        this.titular = titular;
        this.edad = edad;
        this.saldo = saldo;
    }

    public void consulta(){
        double saldoFinal = Double.parseDouble(saldo);
        JOptionPane.showMessageDialog(null,  "Cuenta: " + cuenta + "\n"
        + "Titular: " + titular + "\n" + "Edad: " + edad + "\n" + "Saldo: $" + saldoFinal,"Consulta", JOptionPane.INFORMATION_MESSAGE);
    }//llaves consulta
    public void ingresa() {
        String monto = JOptionPane.showInputDialog(null,
                "Ingrese el monto que desea depositar a su cuenta", "Deposito a su cuenta",
                JOptionPane.QUESTION_MESSAGE);
        double montoFinal = Double.parseDouble(monto);
        double saldoFinal = Double.parseDouble(saldo);
        double total = saldoFinal + montoFinal;
        JOptionPane.showMessageDialog(null,  "Saldo: $" + saldoFinal + "\n"
                + "Monto: $" + montoFinal + "\n" + "Nuevo saldo: $" + total,"Deposito a su Cuenta", JOptionPane.INFORMATION_MESSAGE);
    }//llaves ingresar
    public void retirar() {
        String monto = JOptionPane.showInputDialog(null,
                "Ingrese el monto que desea retirar de su cuenta", "Retiro de su cuenta",
                JOptionPane.QUESTION_MESSAGE);
        double montoFinal = Double.parseDouble(monto);
        double saldoFinal = Double.parseDouble(saldo);
        double total = saldoFinal - montoFinal;
        JOptionPane.showMessageDialog(null,  "Saldo: $" + saldoFinal + "\n"
                + "Monto retirado: $" + montoFinal + "\n" + "Saldo restante: $" + total,"Retiro de su Cuenta", JOptionPane.INFORMATION_MESSAGE);
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
                + "Monto depositado: $" + montoFinal + "\n" + "Saldo Restante: $" + total,"Deposito a la Cuenta" + cuentaDes, JOptionPane.INFORMATION_MESSAGE);

    }
}//llaves de clase
