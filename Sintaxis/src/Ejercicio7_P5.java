import java.util.Scanner;

public class Ejercicio7_P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int numero = sc.nextInt();

        int nivel = 1;
        while (nivel <= numero) {
            System.out.print(" ".repeat((numero - nivel) / 2));

            System.out.println("*".repeat(nivel));

            nivel += 2;
        }

    }
}
