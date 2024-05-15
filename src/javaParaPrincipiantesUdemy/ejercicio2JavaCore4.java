package javaParaPrincipiantesUdemy;

import java.util.Scanner;
public class ejercicio2JavaCore4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cómo es el clima de hoy?");
        int option = scanner.nextInt();

        switch (option){
            case 1:
                System.out.println("Soleado");
                break;
            case 2:
                System.out.println("Nublado");
                break;
            case 3:
                System.out.println("Lluvioso");
                break;
            case 4:
                System.out.println("Tormentoso");
                break;
            case 5:
                System.out.println("Nevado");
                break;
            default:
                System.out.println("Pregúntale a Google");

        }
    }
}

// -------- ENUNCIADO EJERCICIO 4 --------

/*
    4. Escribe un programa que imprima “¿Cómo es el clima de hoy?”, dependiendo del
número que insertes te imprima los siguientes valores
➢ 1 = “Soleado”
➢ 2 = “Nublado”
➢ 3 = “Lluvioso”
➢ 4 = “Tormentoso”
➢ 5 = “Nevado”
Si insertas cualquier otro valor debe imprimir “Pregúntale a Google”
Recomendación: Usa Switch.
     */