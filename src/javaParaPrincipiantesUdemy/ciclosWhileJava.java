package javaParaPrincipiantesUdemy;
/*
Recordar que existen bucles o ciclos , controlados por contador y buclces controlados por centinela
en los bucles controlados por contador, sabemos el número de veces que se repite el ciclo
y en los controlados por centinela no sabemos , y eel numero de veces que se repita, dependerá
del estado de una variable, por ejemplo cuando boolean VAR1=false, cambie a boolean VAR1=true, el
el programa saldrá del bucle.
Podemos usar ciclos while, controlados por contador o centinela.
Los ciclos for son controlados solo por contador.
 */
public class ciclosWhileJava {
    public static void main(String[] args) {
        int i = 0 , duration = 120 ; //Supondremos que es una película de 120 minutos, con 10 de intro, 80 desarrollo, y 20 de final.
        while (i<=120) {
            if (i<=10) {
                System.out.println("min:" + i + "  Reproduciendo intro");
            } else if (i>10 && i<81) {
                System.out.println("min:" + i +"  Reproduciendo desarrollo de la película");
            } else {
                System.out.println("min:" + i +"  Reproduciendo el final de la película");
            }
            i++;
        }
    }
}
