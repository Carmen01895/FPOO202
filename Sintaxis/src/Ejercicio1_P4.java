import java.util.Objects;
import java.util.Scanner;

public class Ejercicio1_P4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String contraseña, verificador;

        System.out.print("Introduzca una contraseña: ");
        contraseña = sc.nextLine();

        System.out.print("Verifique su contraseña: ");
        verificador = sc.nextLine();

        if (verificador.equalsIgnoreCase(contraseña)) {
            System.out.println("Su contraseñmaa es correcta");
        } else if (verificador != contraseña){
            System.out.println("Su contraseña es incorrecta");

        }
    }
}
