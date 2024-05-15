package javaParaPrincipiantesUdemy;
import java.util.Scanner;

public class ejercicio2JavaCore2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("A qué distnacia se encuentra el conductor deseado ?");
        float distancia = scanner.nextFloat();
        System.out.println("¿El conductor, se encuentra disponible?");
        boolean disponibilidad = scanner.nextBoolean();

        if( distancia <= 0.5 && distancia > 0 ){
            if (disponibilidad == true){
            System.out.println("Listo para iniciar recorrido");
            }else{
            System.out.println("Conductor cercano, pero no disponible");
            }
        } else if ( distancia > 0.5 ){
            if (!disponibilidad) {
                System.out.println("No hay conductores disponibles");
            }else {
                System.out.println("Conductor disponible pero muy lejos, aplicarán taridas más altas");
            }
        }
    }
}

// -----ENUNCIADO EJERCICIO2
        /*
2. Escribe un programa que te diga si un carro de Uber puede iniciar su recorrido, para
esto se necesitan dos cosas, que el conductor esté cerca y que esté disponible, el programa te pedirá dos valores,
 la distancia del conductor en kilómetros y su disponibilidad, donde false = no disponible y true = disponible, según los datos que
insertes imprime lo siguiente:

➢ Si la distancia es menor o igual a 0.5 km y el conductor está disponible, imprime “Listo para iniciar recorrido”
➢ Si la distancia es menor o igual a 0.5 km y el conductor NO está disponible, imprime, “Conductor cercano, pero no disponible”
➢ Si la distancia es mayor a 0.5 km y el conductor está disponible, imprime, “Conductor disponible pero muy lejos, aplicarán tarifas más altas”
➢ Si la distancia es mayor a 0.5 km y el conductor NO está disponible, imprime, “No hay conductores disponibles”
➢ Usa if-else para esto
➢ Para negar una validación debes usar el símbolo !, por ejemplo if (!isAvailable)
➢ No olvides imprimir las instrucciones antes de pedir las variables de entrada */