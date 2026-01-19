/*
        Validación de contraseña

    Escribe un programa que solicite al usuario ingresar una contraseña y valide que cumpla
    con ciertos criterios, como tener al menos 8 caracteres, incluir letras mayúsculas, minúsculas
    y números.

 */

import java.util.Scanner;

public class ValidacionContrasena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("      Validación de contraseña      ");
        System.out.println("Tu contraseña debe tener: ");
        System.out.println("- Al menos 8 caracteres ");
        System.out.println("- Incluir maýusculas, minúsculas y números");
        System.out.println(" -------------------- ");

        boolean contrasenaValida = false;

        while (!contrasenaValida) {
            System.out.print("Ingresa una contraseña: ");
            String contrasena = scanner.nextLine();
            if (contrasena.length() >= 8 && contrasena.matches(".*[A-Z].*")
                    && contrasena.matches(".*[a-z].*") && contrasena.matches(".*\\d.*")) {
                System.out.println("Contraseña Válida");
                contrasenaValida = true;
            } else {
                System.out.println("La contraseña no cumple con los requisitos. Intenta nuevamente");
            }
        }
        scanner.close();
    }
}

