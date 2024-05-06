package javaParaPrincipiantesUdemy;

/* s
// CLASE 6: Formatos de String
public class Main {

    public static void main(String[] args) {
        int age = 29;
        float height = 1.76f;
        double piValue = 3.141597465;
        long distanceToSun = 726387416471827124L;
        boolean isDay = false;
        char  myInitial = 'D';

        System.out.println("Mi nombre es David y tengo "+ age + " años ");
        System.out.println(String.format("Mi nombre es David  y tengo %d años y mido %.2f metros", age,height));
        // use %d for int and longs, %f para floats and doubles
    }
}
*/


// ----------------------------------------------------------------------------------------

/* s
// CLASE 9: Operaciones matemáticas complejas, la clase Math
public class Main {
    public static void main(String[] args) {
        // Circle
        int r = 6; //radio de la circunferencia
        double pi = 3.1416;
        double circleArea= pi*Math.pow(r,2);
        System.out.println("El area del circulo es : " + circleArea +" u2");
        System.out.println(String.format("El área de la circunferencia es de :  %.2f unidades cuadradas", circleArea));

        // Existen varios métodos de la clase Math, por ejempo también hay fuciones trigonometricas
        double cosenode30 = Math.cos(30) ;
        System.out.println(cosenode30);
    }
}
*/

// -------------------------------------------------------------------------------------------------

// TAREA 1

/*1. Supongamos que un cubo rectangular tiene las dimensiones: largo=15, ancho=23,
alto=12. Obtén su volumen.

2. Obtén la energía cinética si la masa es m = 12 kg y la velocidad es v = 3 m/s,
imprime el resultado con solo 2 decimales, la fórmula de la energía cinética es
Ec=0.5*m*v^2

3. ¿Qué tipos variables utilizarías para los siguiente valores? Ejemplo: Si tenemos 1
usamos una variable de tipo int.
a. ‘R’
b. 1495970192837664
c. 12.5
d. true
e. 90
f. “No tengo trono ni reina, ni nadie que me comprenda, pero sigo siendo el rey”
g. 6.626070040

4. Supongamos que promueves tu empresa en Google y debes calcular el costo
promedio para 180 clics, donde los clics tienen los siguientes costos
60 clics = $0.30 cada uno
100 clics = $0.25 cada uno
20 clics = $0.80 cada uno
Imprime el costo promedio que tendrás. Puedes encontrar la definición de costo
promedio aquí:
https://support.google.com/google-ads/answer/14074?hl=es-419
Calcúlalo de manera que debas incluir el IVA aparte, donde el IVA es 16% del total,
es decir, deberás calcular total + IVA, imprime el resultado a dos decimales.
Ejemplo: Si tu total es de $100.00, el total + IVA es $116.00

 */

import java.security.spec.ECField;

public class Main{
    public static void main(String[] args) {
        // Ejercicio 1
        int largo = 15 , ancho = 23 , alto =12 ;
        int volumen = largo*ancho*alto;
        System.out.println(String.format("El volumen del cubo es de %d", volumen));

        // Ejercicio 2
        int m=12, v=3;
        float Ec = 0.5f*m*v*v;  // si no le escribo 0.5f y solo pongo 0.5 lo asume double y hay problemas
        System.out.println(String.format("La energía cinética es %.2f", Ec));

        //Ejercicio 3

        char myLetter = 'R';
        long number = 1495970192837664L ; // Si no se pone L lo toma como int, y sale error por ser tan largo
        float numeroFlotante = 12.5f;
        boolean value = true;
        int numeroEntero=90;
        String frase = "No tengo trono ni reina, ni nadie que me comprenda, pero sigo siendo el rey";
        double decimalGrande = 6.626070040;

        System.out.println(frase);

        // Ejercicio 4










    }
}