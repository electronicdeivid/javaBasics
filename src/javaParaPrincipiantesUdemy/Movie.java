package javaParaPrincipiantesUdemy;

public class Movie {

    String title;
    String genre;
    int duration;

    public Movie(String title, String genre, int duration) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }

    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
        this.duration = 0;
    }

    public Movie() {
        this.title = "Non Title";
        this.genre = "Nule";
        this.duration = 0;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
