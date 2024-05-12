package javaParaPrincipiantesUdemy;

import java.util.Scanner;

public class ejercicio2JavaCore3 {
    public static void main(String[] args) {
        /*
 3. Haz un ciclo for y while que obtenga la sumatoria de los números hasta n, ejemplo,
para 5 debes obtener 15 (1+2+3+4+5), para 3 debes obtener 6. Imprime el resultado
así: “La suma es 15” usando formatos de String         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("El programa entrega la sumatoria desde 0 al número límite que usted ingrese. ");
        System.out.println("Ingrese un número entero positivo como límite de la sumatoria");
        int limite = scanner.nextInt();
        int sumaTotal = 0;
        int j = 0;
        int sumaTotal2 = 0;

        for (int i = 0 ; i < limite+1 ; i++){  // Por alguna extraña razón la sumatoria no funciona poniendo como limite i == limite
            sumaTotal = sumaTotal + i ;
        }
        System.out.println(String.format("El total de la sumatoria es %d" , sumaTotal)  );

        while( j < limite+1){
            sumaTotal2 = sumaTotal2 + j ;
            j++;
        }
        System.out.println(String.format("La misma sumatoria total mediante While es %d ", sumaTotal2));

    }
}
