/*
        Ejercicio de verificación de un triángulo

    Escribe un programa que solicite al usuario ingresar longitudes de tres lados
    de un triángulo. Utilizando la estructura condicional if-else, verifica si es
    posible formar un triángulo con esas longitudes y muestra un mensaje
    correspondiente.


import java.util.Scanner;
public class VerificarTriangulo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la Longitud A: ");
        int a = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingresa la Longitud B: ");
        int b = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingresa la Longitud C: ");
        int c = scanner.nextInt();

        if (((a + b) > c) && ((a + c) > b ) && ((b + c) > a)) {
            System.out.println("Si se puede formar un triangulo con estas longitudes");
            if (a == b && b == c){
                System.out.println("Es un triángulo Equilátero");
            } else if ((a == b) || (a == c) || (b == c)) {
                System.out.println("Es un triángulo Isósceles");
            } else {
                System.out.println("Es un triángulo Escaleno");
            }
        } else {
            System.out.println("Lo siento, no se puede formar un triángulo con estas longitudes");
        }

        scanner.close();

    }
}
 */