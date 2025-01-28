import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una frase: ");
        String frase = sc.nextLine();
        StringBuilder sb=new StringBuilder(frase);

        System.out.println(sb.reverse().toString());
    }
}
