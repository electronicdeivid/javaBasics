package javaParaPrincipiantesUdemy;

public class ejercicio2JavaCore5 {
    public static void main(String[] args) {

String[] movies = {"Matrix","Batman el caballero de la noche","Your Name", "Jujutsu Kaisen 0", "Luther","La era del hielo"};

int iterador = 1;
int varBubble = movies[0].length();
int aux = 0;
int maxIndex = 0;

        while( iterador < movies.length){
            if( varBubble < movies[iterador].length() ){
                varBubble = movies[iterador].length();
                maxIndex = iterador;
                aux = maxIndex;
            }
            iterador++;
        }
        System.out.println("La película más larga es " + movies[aux] +" con " + varBubble + " caractéres.") ;
        System.out.println("La película más larga en caractéres ocupa la posición índice: " + aux + " del arreglo movies");
    }
}

// -------ENUNCIADO DEL EJERCICIO

        /*
5. Para un Arreglo de String de títulos de películas, imprime el título de la película con
el título más largo. Por ejemplo si tenemos un arreglo con los valores:
{“Jumanji”, “Toy Story”, “Pulp Fiction”, “Batman: El caballero de la noche”, “Kill Bill”}
Debería imprimir “Batman: El caballero de la noche”.
RETO OPCIONAL: Imprime el índice del título más largo, para el ejemplo anterior,
debería imprimir el 3, porque es el índice de “Batman: El caballero de la noche*/

// Recorrer el arreglo y hacer comparaciones iterando, utilizando método .length



// -------------------SEGUNDO INTENTO FALLIDO, MEDIANAMENTE CUMPLIDO, MUTABA EL ARRAY, NO ERA NECESARIO. Y PERDÍA EL INDICCE INICIAL DE LA PELICULA MÁS LARGA
/*
    while( iterador < movies.length){
        if( movies[0].length() < movies[iterador].length() ){
            aux = movies[iterador].length();
            auxString = movies[iterador];
            movies[iterador] = movies[0];
            movies[0] = auxString;
         }
    iterador++;
        }
        System.out.println("La película más larga es " + movies[0] +" con " + movies[0].length() + " caractéres.") ;
*/



//----------------PRIMER INTENTO , FALLIDO , COMPARABA TODAS CON UNA PERO AL HACER LA COMPARACION ERA EN FUNCION DE UNO , NO ANALIZABA LAS DEMSA ENTRE ELAS--------------------------------
  /*      for( int i=0 ; i < movies.length ; i++ ) {
            for (int j = 0; j < movies.length; j++) {

                if (movies[i].length() > movies[j].length()) {
                    maxSize = movies[i].length();
                    maxPosition = i;

                    if (maxSize < movies[j].length()){
                       maxSize = movies[j].length();
                    }
                }
            }

        }
*/
     //   System.out.println("La pelicula con más caracteres es " + movies[maxPosition] );
       // int size = movies[0].length();
      //  System.out.println("La segunda película tiene un total de " + size+ " caractéres");
  //      System.out.println(movies.length);




