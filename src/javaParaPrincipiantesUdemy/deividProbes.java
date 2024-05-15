package javaParaPrincipiantesUdemy;

import java.util.Scanner;

public class deividProbes {
    public static void main(String[] args) {

        Carrera ingenieriaQuimica = new Carrera();

        ingenieriaQuimica.setName("Ingeniería Química");
        ingenieriaQuimica.setArea("Ingeniería y Ciencias");
        ingenieriaQuimica.setDuration(5);

        System.out.println(ingenieriaQuimica.getName() + ", esta pertenece al área de " + ingenieriaQuimica.getArea() );

        Movie jujutsuKaisen0 = new Movie("Jujutsu Kaisen 0", "Anime", 120 );
        Movie demonSlayer = new Movie( "Demon Slayer", "anime");
        jujutsuKaisen0.setGenre("Monos chinos");
        demonSlayer.setDuration(90);

        System.out.println(jujutsuKaisen0.getTitle() + "es de género : "+ jujutsuKaisen0.getGenre() +" y tiene una duración de " + jujutsuKaisen0.getDuration()+" minutos." );
        System.out.println(demonSlayer.getTitle() + "es de género : "+ demonSlayer.getGenre() +" y tiene una duración de " + demonSlayer.getDuration()+" minutos." );

    }
}
