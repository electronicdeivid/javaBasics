package javaParaPrincipiantesUdemy;
import java.util.Arrays;
import java.util.Scanner;

public class dataArrays {

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        System.out.println("Now we view the arrays in java");
        System.out.println("Enter the length of the array:");
        int n = scann.nextInt();
        int[] fiveArray = new int[n];

        for( int i=0 ; i < n  ; i++){
            int j = i+1;
            System.out.println("Ingresa el valor para la posición " + j );
            fiveArray[i] = scann.nextInt();
        }
        System.out.println("Your celphone number in array is: ");
        System.out.println(Arrays.toString(fiveArray));


        /* //---- El sgte progrmaa ccontiene un array con los días de los meses del año, luego pide al usuario consultar los días de algun mes, solicitando el num del mes , luego imprime por pantala el resultado

        int[] daysOfTheMonth ={31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.println("Enter the number of the month for know the number of days it contain");
        int numberMonth = scann.nextInt();
        numberMonth--;
        System.out.println("The month " + numberMonth  + " contain : " + daysOfTheMonth[numberMonth]+ " days"); */


        // ----Ahora el mismo ejemplo que el curso de -Udemy
        System.out.println("Ingresa el número del episodio para consultar su duración");
        int episodeIndex = scann.nextInt(); // Solicitamos el valor de la variable episodeIndex
        episodeIndex--; // Restamos uno el index ingresado ya que los arrays parten de 0 y no de 1

        int[] episodeDurationArray = new int[5];  // Creamos un array de 5 posiciones
        //int[] episodeDurationArray = new int[]{30, 34, 32, 35, 30}; // Esta es la otra forma de declarar los valores del arreglo, más elegante
        // Esta es otra forma de declarar los valores de las posiciones del array posicion por posicion
        episodeDurationArray[0]=30;
        episodeDurationArray[1]=34;
        episodeDurationArray[2]=32;
        episodeDurationArray[3]=35;
        episodeDurationArray[4]=30;

        if(episodeIndex < 5 && episodeIndex >= 0){
            int episodeDuration = episodeDurationArray[episodeIndex];
            System.out.println("El episodio dura "+ episodeDuration);
        } else {
            System.out.println("La serie dura solo 5 episodios");
        }

        /*
        while(episodeIndex > 5 || episodeIndex <0 ){
            System.out.println("La serie dura solo 5 episodios");
        }
        */









    }








}
