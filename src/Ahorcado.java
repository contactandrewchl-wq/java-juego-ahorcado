
import java.util.Scanner;
public class Ahorcado {
    public static void main(String[] args) {
        
        
        // Clase Scanner que nos permite que el usuario escriba
        Scanner scanner = new Scanner(System.in);

        // Declaraciones y asignaciones
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Arreglos:
        char[] letrasAdivinidas = new char[palabraSecreta.length()];


        // Estructura de control: Iterativa (Bucle)
        for (int i = 0; i < letrasAdivinidas.length; i++) {
            letrasAdivinidas[i] = '_';
        }

        // Estructura de control: Iterativa (Bucle)

        while(!palabraAdivinada && intentos < intentosMaximos){
                                                      // ESTO SE USA CUANDO TENEMOS UNA PALABRA DE CHARS
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinidas) + " (" + palabraSecreta.length() + "Letras)");
            System.out.println("Introduce una letra, porfavor");

            // Usamos la clase scanner para pedir una letra
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            // Estructura de control iterativa (Bucle)
            for (int i = 0; i < palabraSecreta.length(); i++) {
                
                // Estructura de control condicional 
                if(palabraSecreta.charAt(i) == letra){
                    letrasAdivinidas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if(!letraCorrecta){
                intentos++;
                System.out.println("¡Incorrecto! Te quedan " + (intentosMaximos - intentos) + " intentos.");
            }

            if(String.valueOf(letrasAdivinidas).equals(palabraSecreta)){
                palabraAdivinada = true;
                System.out.println("¡Felicidades!, Has adivinado la palabra secreta: " + palabraSecreta);
            }
        }

        if(!palabraAdivinada){
            System.out.println("¡Qué pena te has quedado sin intetos! GAME OVER");
        }

        scanner.close();

    }
    
}
