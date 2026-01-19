/*
1.- Ejercicio de adivinar un número:

Escribe un programa que genere un número aleatorio entre 1 y 100.
Luego, solicita al usuario que adivine el número generado.
Utilizando la estructura condicional if-else
Muestra un mensaje indicando si el número ingresado por el usuario es mayor o menor que el número generado
Continúa solicitando al usuario que adivine hasta que lo haga correctamente.
*/

import java.util.Scanner;
import java.util.Random;

/* public class AdivinarNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroRandom = random.nextInt(100) + 1;
        int intentos = 0;
        int numeroIngresado;

        System.out.println("Adivina el número generado (entre 1 y 100)");

        do {
            System.out.print("Ingresa un número: ");
            numeroIngresado = scanner.nextInt();
            intentos++;

            if (numeroIngresado < numeroRandom) {
                System.out.println("El número ingresado es menor que el número generado.");
            } else if (numeroIngresado > numeroRandom){
                System.out.println("El número ingresado es mayor que el número generado. ");
            } else {
                System.out.println("!Felicidades! Adivinaste el número en " + intentos + " Intentos");
            }
        } while (numeroIngresado != numeroRandom);

        scanner.close();
    }
}


 */