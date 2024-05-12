package javaParaPrincipiantesUdemy;
// Ahora comenzaremos con la sentencia IF == Now we will start with the IF statement

public class condicionalesJava {
    public static void main(String[] args) {
     System.out.println("----Welcome ! We will try conditionals in Java----");
        int totalEpisodes = 0 , totalSeasons = 0;

        if (totalEpisodes >= 1 && totalSeasons >= 1) {
            if(totalEpisodes<10){
                System.out.println("It's a miniseries");
            } else {
                System.out.println("\nIs a series");
            }
        } else if ( totalEpisodes >= 1 && totalSeasons == 0) {                           // 'else if' es el simil a 'elif' de python
            System.out.println("\n Is a movie");
        } else{
            System.out.println("\n Must contain one episode or more");
        }
    }
}
