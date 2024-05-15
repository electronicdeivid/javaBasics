package javaParaPrincipiantesUdemy;

import java.util.Scanner;

public class ejercicio2JavaCore {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido, ingrese la cantidad en miligramos que desea para su receta de multijugo: ");
        int cantidadMiligramos = sc.nextInt();

        if(cantidadMiligramos > 100){
            System.out.println("¡Felicidades, es una buena poción!");
        } else {
            System.out.println("La poción es mediocre, sangre sucia inmunda”");
        }
    }
}

// ---enunciado ejercicio 1

/* 1. Crea un programa que te pida una cantidad en miligramos para una poción
multijugos, el valor debe ser de tipo entero, si el valor es mayor a 100 imprime
“¡Felicidades, es una buena poción!”, de lo contrario imprime “La poción es
mediocre, sangre sucia inmunda”. */