package com.mycompany.pruebajpa;
import com.mycompany.pruebajpa.logica.Alumno;
import com.mycompany.pruebajpa.logica.Controladora;
import java.util.ArrayList;
import java.util.Date;

public class Pruebajpa {
    public static void main(String[] args) throws Exception {
        Controladora control = new Controladora();
        
        // CREAR ALUMNO
        Alumno al2 = new Alumno(75219635,"Veronica Isabel", "Vera Pacherre", new Date());
        control.crearAlumno(al2);
        try {
            control.crearAlumno(al2);
            System.out.println("¡Alumno creado con éxito!");
        }catch (Exception e) {
            System.err.println("No se pudo conectar a la base de datos o hubo un error: " + e.getMessage());
        }
        
        // ELIMINACIÓN DE ALUMNO
        //control.eliminarAlumno(76124578);
        
        // EDITAR UN ALUMNO
        /*alu.setNombre("Kiara Melissa");
        control.editarAlumno(alu);*/
        
        // BUSQUEDA 
        System.out.println("-----------BUSQUEDA INDIVIDUAL---------------");
        Alumno alu=control.traerAlumno(76124578);
        System.out.println("El alumno es: "+alu.toString());
        System.out.println("-----------BUSQUEDA GRUPAL--------------------");
        ArrayList<Alumno> listaAlumnos= control.traerListaAlumnos();
        for(Alumno todos: listaAlumnos){
            System.out.println(todos.toString());
        }
    }
}
