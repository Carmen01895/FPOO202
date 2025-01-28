import java.util.Scanner;

public class Ejercicio1{

    public static void main(String[] args) {
        Scanner cns = new Scanner(System.in);
        System.out.println("Ingrese las horas que trabajo esta semana: ");
        int horas = Integer.parseInt(cns.nextLine());
        double pagohoras = (double)horas * (double)39.5F;
        System.out.println("La pago es $" + pagohoras);
    }
}