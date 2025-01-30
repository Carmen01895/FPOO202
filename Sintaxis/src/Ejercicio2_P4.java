import java.util.Scanner;

public class Ejercicio2_P4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("El numero " + num + " es par");
        } else if (num % 2 != 0) {
            System.out.println("El numero " + num + " es impar");

        }
    }
}
