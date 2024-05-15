package javaParaPrincipiantesUdemy;

import java.util.Random;

public class sobrecargaDeMetodos {
    public static void main(String[] args) {


        String[] titleArray = {"The Lords of Rings", "Star Wars", "Ice Age", "Shrek", "Matrix", "Matrix : Reload", "Jujutsu Kaisen 0"};
        String title = play(titleArray,3);
        //String randomTitle = play(titleArray);
        play(titleArray);

    }


    public static String play(String[] titleArray , int index){ // La funcion solicita como argumentos un arreglo de tring y un int

        if (index < titleArray.length){
            String title = titleArray[index];
            for(int i=0 ; i < 5 ; i++){
                System.out.println("Playing movie: " + title);
            }
            return title;

        }else {
            System.out.println("Index its too big");
            return "";
        }
    }


    public static String play(String[] titleArray){

        Random random = new Random();     // Instanciamos un objeto de la clase Random
        int index2 = random.nextInt(titleArray.length - 1);     // creamos un objeto random y aplicamos el método nextInt, nos dará un numero entero al azar de maximo mayor el largo del arreglo - 1 ;
        String randTitle = titleArray[index2];
        for(int i=0 ; i < 5 ; i++){
            System.out.println("Playing movie: " + randTitle);
        }
         return randTitle;

    }

}

/* Se realizó una sobrecarga de métodos, es decir se utiliza el mismo nombre de método, pero se crean,
dos métodos distintos con el mismo nombre, pero distinta ufncionalidad y argumentos de entrada, esa es la clave,
deben tener distintos argumentos de entrada.

El primer método play, imprime playing movie "nombre de la pelicula" , previamente indicado el índice del array de peliculas
como argumento del método.
El segundo metodo solo necesita como parámetro un array de stirng, y se encargará de generar un valor aleatorio int , dentro del tamaño
del array de stirng, para luego imprimir la película de dicho subindice coincida cn el valor aleatorio generado.

(!!!!)  Impoetante al definir la función indicar el tipo de variable qe devlverá y esta debe coincidir cn la variable
que se entregara mediante return. !! al prinicpio puse en la segunda metodo play String[] de est aforma :

public static String[] play(String[] titleArray){... }

y devolvía solo un string y no un array de string tube qe modificar y ponerle :

public static String play(String[] titleArray){... }

    }
 */