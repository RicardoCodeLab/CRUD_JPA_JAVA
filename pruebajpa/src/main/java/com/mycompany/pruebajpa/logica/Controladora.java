package com.mycompany.pruebajpa.logica;
import com.mycompany.pruebajpa.persistencia.ControladoraPersistencia;
import java.util.ArrayList;

public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearAlumno(Alumno alu) throws Exception{
        controlPersis.crearAlumno(alu);
    }
    
    public void eliminarAlumno(int id){
        controlPersis.eliminarAlumno(id); 
    }
    
    public void editarAlumno (Alumno alu){
        controlPersis.editarAlumno(alu);
    }
    
    // FUNCIÓN QUE DEVUELVE ALUMNO
    public Alumno traerAlumno(int id){
        return controlPersis.traerAlumno(id);
    }
    
    public ArrayList<Alumno> traerListaAlumnos(){
        return controlPersis.traerListaAlumnos();
    }
}
