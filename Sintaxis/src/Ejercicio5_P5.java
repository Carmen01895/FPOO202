import java.util.Scanner;

public class Ejercicio5_P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();

        System.out.println("Ingrese el operador que desea calcular: ");
        String operador = sc.next();

        switch (operador) {
            case "+":
                System.out.println(num + num2);
                break;
            case "-":
                System.out.println(num - num2);
                break;
                case "*":
                    System.out.println(num * num2);
                    break;
                    case "/":
                        System.out.println(num / num2);
                        break;
        }
    }
}
