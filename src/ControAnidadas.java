/*
        Estructuras de control anidadas

  Este ejercicio solicita al usuario que ingrese su edad y género. Utilizando
  estructuras de control anidadas, el programa verifica si la edad ingresada es mayor o igual
  a 18 y luego verifica el género para mostrar un mensaje de bienvenida adecuado.




import java.util.Scanner;
public class ControAnidadas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Porfavor, ingrese su edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ahora porfavor, ingrese su género (H/M): ");
        char genero = scanner.next().charAt(0);

        if (edad >= 18) {
            if (genero == 'H') {
                System.out.println("¡Bienvenido estimado!");
            } else if (genero == 'M'){
                System.out.println("¡Bienvenida estimada!");
            } else {
                System.out.println("Genero mal ingresado");
            }
        } else {
            System.out.println("¡No eres mayor de edad!");
        }
        scanner.close();
    }
}
*/