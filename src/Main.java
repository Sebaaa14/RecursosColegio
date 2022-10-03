/*
	-Gestion de recursos educativos
	-Registro de alumnos, profesores, asignaturas y recursos digitales para cada curso(tipo aula virtual)
	
	Gestión de recursos educativos digitales en un colegio: registro de alumnos, profesores,
    asignaturas y recursos digitales para cada curso (tipo aula virtual)
    
    TODO 
    asdasd
*/
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	   public static void main(String[] args) throws IOException{
		   Gestion gestionar = Gestion.getInstancia();
		   gestionar.cargarCursos();
		   gestionar.cargarAlumnos();
		   gestionar.cargarProfesores();
		   gestionar.correrCodigo();
	   }
}