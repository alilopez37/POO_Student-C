package models;

import java.util.ArrayList;

public class Asignatura {
    private int id;
    private String nombre;
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();
    public boolean addStudent(Estudiante student){
        boolean status;
        status = estudiantes.add(student);
        return status;
    }
    public ArrayList<Estudiante> getEstudiantes(){
        return estudiantes;
    }
}
