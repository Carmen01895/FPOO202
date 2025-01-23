//Zona de Importation para librerias
import java.util.Scanner;

//Class principal
public class Main {
    public static void main(String[] args) { //metodo principal main

       /* System.out.println("Hello, Carmen Atilano");
        System.out.println("Hello, Carmen Atilano");
        System.out.println("Hello, Carmen Atilano");*/

        System.out.println("Hello, Carmen Atilano");
//        2. cadenas

        String cadena= "carmen" + "atilano" + "garcia";
        System.out.println(cadena); //imprimir lo que tenemos en la cadena

        System.out.println(cadena.length()); //contar la longitud de la cadena

        //Extraccion de caracteres en base a parametros
        System.out.println(cadena.substring(2,5));
        System.out.println(cadena.substring(2));
        System.out.println(cadena.substring(0,5));

        // 3. Variables

        String cadena2 = "333", cadena3, cadena4;
        int entero = 3, entero2, entero3;
        double decimal = 3.3, decimal2, decimal3;

        //Convertir cadena a int

        entero2 = Integer.parseInt(cadena2); //conversion de una cadena a entero
        System.out.println(entero2);

        //Convertir double a int

        entero3 = (int) decimal;
        System.out.println(entero3);

        //Convertir double a cadena
        cadena3 = String.valueOf(decimal);
        System.out.println(cadena3);

        //Cnvertir int a double
        decimal2 = Double.valueOf(entero);
        System.out.println(decimal2);

        //Conversion implicita
        int i = 12;
        double numd = i;
        System.out.println(numd);

        //4. Solicitud de informacion

        Scanner scn = new Scanner(System.in);
        System.out.println("Escribe una cadena: ");
        String cadena5 = scn.nextLine();

        System.out.println("Escribe un numero entero: ");
        int entero4 = scn.nextInt();

        System.out.println("Escribe un numero decimal: ");
        double decimal5 = scn.nextDouble();

        System.out.println("cadena guardada: "+ cadena5);
        System.out.println("Numero entero guardado: " + entero4);
        System.out.println("Numero decimal guardado: " + decimal5);

        //5. boolean, operadores logicos y de comparacion


        // operadores de comparacion siempre devuelven 1 boolean
        System.out.println(10 > 9);
        System.out.println(10 == 9);
        System.out.println(10 < 9);
        System.out.println(10 >= 9);
        System.out.println(10 <= 9);
        System.out.println(10 != 9);

        //operadores logicos
        int x = 3;
        System.out.println(x<5 && x>10);
        System.out.println(x<5 || x>10);
        System.out.println(!(x>10 && x<10));
        System.out.println(!(x>10 || x<10));

    }
}