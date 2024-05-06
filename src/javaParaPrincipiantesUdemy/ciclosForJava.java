package javaParaPrincipiantesUdemy;

public class ciclosForJava {
    public static void main(String[] args) {
    int i = 0 , duration = 120;

        for (i = 0 ; i <= duration ; i++ ) {
            if (i<=10) {
                System.out.println("min:" + i + "  Reproduciendo intro");
            } else if (i>10 && i<81) {
                System.out.println("min:" + i +"  Reproduciendo desarrollo de la película");
            } else {
                System.out.println("min:" + i +"  Reproduciendo el final de la película");
            }
        }
    }
}

