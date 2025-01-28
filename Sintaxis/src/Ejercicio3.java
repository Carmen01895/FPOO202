import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();
        int suma = 0;

        for (int i = 0; i <= num; i++) {
             suma +=i;
        }
        System.out.print("La suma total es: " + suma);
    }
}
