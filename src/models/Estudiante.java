package models;

public class Estudiante {
    private int matricula;
    private String nombre;

    public Estudiante(int matricula, String nombre) {
        this.matricula = matricula;
        this.nombre = nombre;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "matricula=" + matricula +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
