import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre completo: ");
        String nombreCompleto = sc.nextLine();


        System.out.println(nombreCompleto.toLowerCase());
        System.out.println(nombreCompleto.toUpperCase());
        System.out.println(Nombre(nombreCompleto));

    }
    private static String Nombre(String texto) {
        StringBuilder resultado = new StringBuilder();
        for (String palabra : texto.split(" ")) {
            if (!palabra.isEmpty()) {
                resultado.append(palabra.substring(0, 1).toUpperCase())
                        .append(palabra.substring(1).toLowerCase())
                        .append(" ");
            }
        }
        return resultado.toString().trim();
    }
}