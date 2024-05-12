package javaParaPrincipiantesUdemy;

public class arraysAndLoops {
    public static void main(String[] args) {

        float[] notes = { 3.0f , 4.5f , 6.6f , 5.0f , 5.3f }; // Las notas sacadas en el semestre de un ramo
        int cantidadNotas = notes.length; // Obtengo longitud del arreglo, es como el len de python
        float sumaNotas = 0 ;
        float sumaNotasDos = 0; // Variable sumanotas, para utilizar en un ciclo de suma con sintaxis mas elegante

        for (int i=0; i < cantidadNotas ; i++) {
             sumaNotas = sumaNotas + notes[i];
        }
        System.out.println("La suma de todas las notas es " + sumaNotas );


        for (float note : notes) {
            sumaNotasDos += note;   // Cuando tenemos la misma variable del lado izquirdo y derecho de la igualdad y le estamos sumando mas valores podemos abreviar con +=
        }
        System.out.println("La suma de todas las notas usando for each para iterar el arreglo y modificando la suma es: " + sumaNotasDos );

    }
}
