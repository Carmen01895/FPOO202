import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        String resultado = nombre.replaceAll(" ", "").toUpperCase();

        System.out.println(nombre.toUpperCase());
        System.out.println(resultado.length());


    }
}
