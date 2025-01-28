import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int PESO_PAYASO = 112;
        int PESO_MUNECA = 75;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de payasos vendidos: ");
        int cantidadPayasos = scanner.nextInt();

        System.out.print("Ingrese el número de muñecas vendidas: ");
        int cantidadMunecas = scanner.nextInt();

        int pesoTotal = (cantidadPayasos * PESO_PAYASO) + (cantidadMunecas * PESO_MUNECA);


        System.out.println("El peso total del paquete es de " + pesoTotal + " gramos.");

    }
}


