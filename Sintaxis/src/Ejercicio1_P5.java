import java.util.Scanner;

public class Ejercicio1_P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();

        System.out.print ("Los numeros impares anteriores al numero son: ");
        for(int i = 1; i < num; i += 2){
            System.out.print( i + ",");
        }

    }
}
