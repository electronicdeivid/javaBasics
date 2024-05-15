package javaParaPrincipiantesUdemy;
import java.util.Scanner;

public class argumentosDeMetodos {
    public static void main(String[] args) {
        int limit = ingresaNumero();
        contador(limit);
    }



    public static int ingresaNumero(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el límite de una sumatoria: ");
        int limit = scanner.nextInt();
        return limit;
    }

    public static void contador(int limite) { // void es para funciones vacías que no devuelven nada, si devuelven alto debe cambiarse por el tipo de dato que retornaran.
        int suma=0;
        for(int i=0 ; i<limite+1 ;i++){
            suma = suma + i;
        }
        System.out.println("El resultado de la sumatoria , para el límite indicado es : "+ suma);
    }
}
