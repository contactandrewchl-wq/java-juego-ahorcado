/*
        Ejercicio de conversión de unidades

    Desarrolla un programa que convierta una temperatura ingresada por el usuario en grados celsius
    a una escala seleccionada (Por ejemplo Celsios a Fahrenheit o Celsius a kelvin).
    Utiliza una estructura de control switch para manejar las diferentes opciones de conversión.




import java.util.Scanner;
public class ConversionUnidades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Conversión de unidades");
        System.out.print("Ingresa temperatura: ");
        double grados = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Ingresa conversión de Celsius a (Fahrenheit o Kelvin): ");
        String conversion = scanner.nextLine().toLowerCase();

        double resultado = switch (conversion) {
            case "fahrenheit" -> grados * 1.8 + 32;
            case "kelvin" -> grados + 273.15;
            default -> {
                System.out.println("Conversión no valida");
                yield 0;
            }
        };
        System.out.println("La Temperatura es: " + resultado);
    }
}
*/