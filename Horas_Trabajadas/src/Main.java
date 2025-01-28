import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     Scanner cns = new Scanner(System.in);
     System.out.println("Ingrese las horas que trabajo esta semana: ");
     int horas = Integer.parseInt(cns.nextLine());

     double pagohoras = horas * 39.5;
     System.out.println("La pago es " + "$"+pagohoras);
    }
}