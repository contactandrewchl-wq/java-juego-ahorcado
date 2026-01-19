
/*

        Ejercicio de conversión de temperaturas

    Escribe un programa que solicite al usuario ingresar una temperatura en grados Celsius.
    Utilizando la estructura condicional if-else, convierte la temperatura a grados fahrenheit
    si es mayor o igual a o, o a grados kelvin si es menor a 0 y muestra el resultado.



import java.util.Scanner;

public class TemperaturaConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la temperatura en Grados Celsius: ");
        double temperaturaCelsius = scanner.nextDouble();

        if (temperaturaCelsius >= 0) {
            double fahrenheit = (1.8 * temperaturaCelsius) + 32;
            System.out.println("La Temperatura en Fahrenheit es de: " + fahrenheit + " Fahrenheit");
        } else {
            double kelvin = (temperaturaCelsius + 273.15);
            System.out.println("La temperatura en Kelvin es de: " + kelvin + " Kelvin");
        }
        scanner.close();
    }

}

 */
