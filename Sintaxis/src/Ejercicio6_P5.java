import java.util.Scanner;
public class Ejercicio6_P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el registro de su operacion: ");

        do {
            String operacion = sc.nextLine();
            int monto, resultado;
            monto = 1400;


            switch (operacion) {
                case "D":
                    resultado = monto + 100;
                    System.out.println("Su monto total más su deposito de $100 MXN es: $  " + resultado);
                    break;
                    case "R":
                        resultado = monto - 50;
                        System.out.println("Su monto total más su retiro de $50 MXN es: $  " + resultado);
                        break;
            }
        }while(false);
    }
}