import java.util.Scanner;

public class Ejercicio2_P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();

        for (int i = 0; i <= num; i++) {
            System.out.print(i + ",");
        }
    }
}
