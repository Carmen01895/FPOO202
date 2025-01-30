import java.util.Scanner;

public class Ejercicio3_P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad = 0;
        System.out.println("Bienvenido a la Sala de Juegos");
        System.out.println("Ingrese su edad por favor: ");
        edad = sc.nextInt();

        if (edad < 4) {
            System.out.println("Puede ingresar ¡Gratis!");
        } if (edad >= 4 && edad <= 18) {
            System.out.println("Puede ingresar, su total a pagar es de $110 MXN");
        }if (edad > 18) {
            System.out.println("Puede ingresar, su total a pagar es de $190 MXN");
        }
    }
}
