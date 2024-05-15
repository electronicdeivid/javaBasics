package javaParaPrincipiantesUdemy;
import java.util.Scanner;

public class ejercicio2JavaCore6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el número limite para indicar todos los pares hasta ese número: ");
        int var=1;
        int limit = sc.nextInt();
        while( var!=0){
            if(limit <= 0) {
                System.out.println("Debes ingresar un número mayor a 0: ");
                limit=sc.nextInt();
            }else {
                System.out.println("Los números pares hasta el límite indicado son: ");
                for (int i = 1; i < limit + 1; i++) {
                    int result = i % 2;
                    if (result != 1) {
                    System.out.println(i);
                }
                var = 0;
            }
          }
        }
    }
}

//------  ENUNCIADO EJERCICIO -------------------------------

        /*6. EJERCICIO RETO SUPER SAYAYÍN: Escribe un programa que para un número N, imprima los números pares desde 1 hasta N,
        por ejemplo si N = 6, debe imprimir “2, 4, 6”. Hazlo con un for o un while. Si el número es menor o igual a 0, debes imprimir
        “Inserta un número positivo”

TIP: Para saber si un número es par, debes obtener el residuo de ese número al ser dividido entre 2, si el residuo es 0,
entonces el número es par. Por ejemplo si quieres saber si 4 es par, divides 4/2 = 2 y te sobran 0,
entonces 4 es par, en cambio para 5/2 = 2 y sobra 1, entonces es impar, para obtener el residuo de una división en Java
puedes utilizar %, ejemplo: 4 % 2 = 0 y 5 % 2 = 1.*/