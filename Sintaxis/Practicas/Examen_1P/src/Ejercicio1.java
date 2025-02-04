import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero par entre 200 y 400: ");
        int a = sc.nextInt();

        if (a % 2 == 0) {
            if (a >= 200 && a <= 400) {

                for (int i = a; i <= 400; i += 2) {
                    System.out.println(i + " ");
                }
            } else {
                System.out.println("El numero no es valido");
            }
        }else{
            System.out.println("El numero no es valido");
        }
    }
}

