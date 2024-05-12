package javaParaPrincipiantesUdemy;
import java.util.Scanner;
/*

Métodos de la clase Scanner --> Explicación

boolean nextBoolean()  --> Lee valores lógicos boléanos introducidos por el usuario.
byte nextByte() --> Lee valores byte introducidos por el usuario.
double nextDouble() --> Lee valores double introducidos por el usuario. - 15 decimales
float nextFloat() --> Lee valores float introducidos por el usuario.  - 6decimales
int nextInt() --> Lee valores int introducidos por el usuario.
example :  int dayOfWeek = scanner.nextInt();
String nextLine() --> Lee valores String introducidos por el usuario.
long nextLong() --> Lee valores long introducidos por el usuario. -2^63 a 2^63-1  - 19 digitos
short nextShort() --> Lee valores short introducidos por el usuario.

Un objeto scanner soporta guardar multiples variables
*/

public class scannerJava {
    public static void main(String[] args) {
        System.out.println("What day is today?");
        System.out.println("1.- Monday , 2.- Tuesday , 3.- Wednesday , 4.- Thursday , 5.- Friday, 6.- Satudrday, 7.-Sunday");

        Scanner scanner = new Scanner(System.in);  // Creamos un objeto llamado "scanner" de la clase "Scanner"

        Byte dayOfWeek = scanner.nextByte();
        System.out.println("Ingress your age: ");
        byte age=scanner.nextByte();
       // scanner.close();

        System.out.println("Today is " +dayOfWeek+ " day of week my dear Deivid, and your age " + age + " years old"   );

/* Si el valor introducido por teclado no  es del tipo esperado o de un tipo compatible al esperado, se produce un error.
  En este caso se lanza la excepción InputMismatchException */

/*

---Funcionamiento interno de la clase Java Scanner.---

Es importante conocer el funcionamiento interno de la clase Scanner para poder realizar las operaciones de lectura de forma correcta.
De forma resumida, el proceso de lectura por teclado en un programa Java es el siguiente:

    Los datos que se introducen desde teclado se almacenan en una zona de memoria que vamoso a llamar buffer.
    (buffer = area de memoria temporal que se utiliza para almacenar datos de entrada o salida de forma temporal)
    El buffer, almacena los datos ingresados, antes de que sean procesados por el programa. Esto ayuda tambien a manejar
    los errores de entrada.
    Las dos clases principales que se utilizan para trabajar con buffers en Java son Scanner y BufferedReader.
    La clase Scanner es más fácil de usar, pero la clase BufferedReader es más eficiente para leer grandes cantidades de datos.
    Mediante un stream estos datos pasan al programa.
    Un stream o flujo de datos es un objeto que hace de intermediario entre el programa y el origen o el destino de los datos.
    El programa lee del stream o escribe en él, sin importarle de donde proceden los datos físicamente o hacia qué dispositivo
    se dirigen realmente.Un stream está formado por una secuencia de bytes utilizados para la entrada o salida de un programa.

Java crea de forma automática los siguientes streams cuando se ejecuta un programa:
    System.in: stream de entrada conectado al teclado
    System.out: stream de salida conectado al monitor
    System.err: stream de salida conectado al monitor para mensajes de error.

 Origen(teclado) --> BUFFer --(stream de entrada sysyem.in)--> PROGRAMA ----(stream de salida System.out)--->BUFFER-->Destino(monitor)

FUENTE : https://puntocomnoesunlenguaje.blogspot.com/2012/08/java-scanner.html

IMPORTANTE (!) : Cuando se introducen datos desde teclado, se pueden introducir varios valoeres separados por espacios en blanco

ejemplo : 12 2.115

A continuación, utilizando los métodos adecuados de la clase Scanner se puede acceder a esos tokens y trabajar con ellos en el programa.
Por ejemplo si el dato neterior es llamado con :

n = sc.nextInt();

El accede al buffer encuentra el 12 y lo envía, el resto queda en el bufer, lo que trae nuevos errores, al pedir
más tarde nuevas entradas por pantalla. Existirá un error : "InputMismatchException".

Para evitar estos errores la clase Scanner proporciona métodos para saber si hay tokens en el buffer y para saber
el tipo del siguiente token a extraer:

hasNext():  Devuelve un boolean. Indica si existe o no un siguiente token para extraer.
hasNextXxx():  Devuelve un boolean. Indica si el siguiente token a extraer es del tipo especificado por Xxx,
por ejemplo hasNextInt(), hasNextDouble(), etc.

*/
        // Ahora veremos uun ejemplo de como manejar un error de ingreso.

        int N;
        do{
            System.out.println("Deivid, now ingress a positive entere number: ");
            while (!scanner.hasNextInt()){      // This is other form for say "while true", ya que la condicion de while sera true mientras lo ingresado por el usuario no sea el tipo de dato deseado , saldra del while cuando si sea un int
                System.out.println("Invalid value");
                scanner.next();  // Con esta instrucción extraemos del buffer el dato no valido introducido.
                /* El método next() del objeto Scanner se utiliza para leer la siguiente entrada del usuario. Esto elimina la entrada no válida del búfer de entrada.*/
                System.out.println("Please insert a valid data (positive int number) :");
            }
            N = scanner.nextInt();
            if (N<=0){
                System.out.println("The number must be positive");
            }
        } while(N <= 0);
        System.out.println("The number entered is: "+N);
        scanner.close();

    }
}
