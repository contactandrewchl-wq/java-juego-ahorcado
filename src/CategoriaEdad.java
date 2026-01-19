/*
        Ejercicio de categorías de edad

   Crea un programa que pida al usuario ingresar su edad y muestre un mensaje
   indicando en qué categoría de edad se encuentra (por ejemplo, "niño", "adolescente", "adulto")



import java.util.Scanner;
public class CategoriaEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, ingresa tu edad ");
        int edad = scanner.nextInt();
        String categoria = switch (edad) {
            case 0,1,2,3,4,5,6,7,8,9,10 -> "Niño";
            case 11,12,13,14,15,16,17,18 -> "Adolescente";
            default -> "Adulto";
            };
        System.out.println("Usted se encuentra en la categoría: " + categoria);
        }
    }

     */