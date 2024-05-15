package javaParaPrincipiantesUdemy;


// La clase carrera, tendrá distintos campos(atributos) y crearemos objetos de la clase experimentando en deividProbes

public class Carrera {

    String name;
    String area;
    int duration;

    public String getName() {
        return "Una de las mejores carreras es " + name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
