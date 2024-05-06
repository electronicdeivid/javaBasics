package javaParaPrincipiantesUdemy;

public class ciclosDoWhileJava {
    public static void main(String[] args) {
        int i=0 , duration=120 ;

        do {
            if (i<=10) {
                System.out.println("min:" + i + "  Reproduciendo intro");
            } else if (i>10 && i<81) {
                System.out.println("min:" + i +"  Reproduciendo desarrollo de la película");
            } else {
                System.out.println("min:" + i +"  Reproduciendo el final de la película");
            }
            i++;  // Sin aumentar el valor de i, es decir sin esta linea de codigo se produce loop infinito e imprime min 0 todo el rato
        } while(i <= duration);
    }
}
