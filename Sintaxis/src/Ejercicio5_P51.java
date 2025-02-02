import java.util.Scanner;

public class Ejercicio5_P51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = sc.nextLine();

        System.out.println("Ingrese una letra: ");
        String letra = sc.nextLine();

        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra.charAt(0)) {
                contador++;
            }
        }
        System.out.println("La letra: "+letra+"Aparece: "+ contador+ " veces, en la frase: "+ frase);
    }
}
