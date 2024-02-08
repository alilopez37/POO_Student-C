import models.Asignatura;
import models.Estudiante;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner key =  new Scanner(System.in);
    private static  Asignatura poo = new Asignatura();
    public static void main(String[] args) {

        int opcion;
        do {
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Mostrar estudiantes");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            opcion = key.nextInt();
            switch (opcion) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    listStudent();
            }
        } while(opcion != 3);
    }
    public static void addStudent(){
        int matricula;
        String nombre;
        System.out.print("Matrícula: ");
        matricula = key.nextInt();
        key.nextLine();
        System.out.print("Nombre: ");
        nombre = key.nextLine();
        Estudiante student = new Estudiante(matricula, nombre);
        if (poo.addStudent(student))
            System.out.println("Registro exitosao");
        else
            System.out.println("Error en el registro. Intenta de nuevo.");
    }
    public static void listStudent(){
        ArrayList<Estudiante> lista;
        lista = poo.getEstudiantes();
        for (int i=0;i<lista.size();i++)
            System.out.println(lista.get(i));
    }
}