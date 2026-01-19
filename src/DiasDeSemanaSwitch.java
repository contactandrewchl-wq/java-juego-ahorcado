/*
        Ejercicios de días de la semana

     Escribe un programa que solicite al usuario un número del 1 al 7 y muestre
     el día de la semana correspondiente.



import java.util.Scanner;

public class DiasDeSemanaSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, inserta un número del 1 al 7: ");
        int dia = scanner.nextInt();

        String diaSemana = "";

        switch (dia) {
            case 1:
                diaSemana = "Lunes";
                break;
            case 2:
                diaSemana = "Martes";
                break;
            case 3:
                diaSemana = "Miercoles";
                break;
            case 4:
                diaSemana = "Jueves";
                break;
            case 5:
                diaSemana = "Viernes";
                break;
            case 6:
                diaSemana = "Sábado";
                break;
            case 7:
                diaSemana = "Domingo";
                break;
            default:
                System.out.println("Número Mal Ingresado");

        }
        System.out.println("El día de la semana correspondiente es: " + diaSemana);
        scanner.close();
    }
}

 */