import java.util.Scanner;

public class Ejercicio3_P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10;
        System.out.println("Tabla del " + n);
        for(int i = 1; i<=10; i++){
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
}