/*
    Ejercicio de cálculo de descuento:

Escribe un programa que solicite al usuario ingresar el precio de un producto.
Si el precio supera los $100, aplica un descuento del 10% y muestra el precio final;
de lo contrario, muestra el precio sin descuento


import java.util.Scanner;
public class CalculoDescuento {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el precio de un producto: ");
        double precioIngresado = scanner.nextDouble();

        if (precioIngresado > 100.0) {
            double descuento = precioIngresado * 0.10;
            double precioFinal = precioIngresado - descuento;
            System.out.println("Se aplico un descuento del 10%: $" + descuento);
            System.out.println("El precio final es: $" + precioFinal);
        } else {
            System.out.println("Precio final: $" + precioIngresado);
        }
        scanner.close();
    }
}
 */