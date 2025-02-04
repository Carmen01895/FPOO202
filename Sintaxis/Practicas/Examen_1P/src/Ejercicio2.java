import java.util.Scanner;

public class Ejercicio2 {
public static void main(String[] args) {
    System.out.println("f. De centigrados a farenheit");
    System.out.println("k. De centigrados a Kelvin");
    System.out.println("c. De Farenheit a centigrados");

    System.out.println("Ingrese la opción con la que desea trabajar: ");
    Scanner sc = new Scanner(System.in);

    String opcion = sc.nextLine();

    switch (opcion) {
        case "f":
            System.out.println("Ingrese los centigrados que desea convertir en farenheit: ");
            double centigrados = sc.nextDouble();
            double farenheit = (centigrados * 9/5) + 32;
            System.out.println("El farenheit es: " + farenheit);
            break;
        case "k":
            System.out.println("Ingrese los centigrados que desea convertir en kelvin: ");
            double centigrado = sc.nextDouble();
            double kelvin = (centigrado + 273.15);
            System.out.println("El kelvin es: " + kelvin);
            break;
        case "c":
            System.out.println("Ingrese los Farenheit que desea convertir en centigrados: ");
            double far = sc.nextDouble();
            double cent = (far - 32) * 5/9;
            System.out.println("Los farenheit son: " + cent);

    }
}
}
