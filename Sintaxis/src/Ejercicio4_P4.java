import java.util.Scanner;
public class Ejercicio4_P4 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese una cadena:");
            String cad = scanner.nextLine();

            String rev = "";

            for (int i = cad.length() - 1; i >= 0; i--) {
                rev += cad.charAt(i);
            }

            if (cad.equals(rev)) {
                System.out.println("Su cadena es un palíndromo");
            }else {
                System.out.println("Su cadena no es palíndromo"); }
    }
}
