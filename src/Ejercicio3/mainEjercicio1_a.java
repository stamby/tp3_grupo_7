package Ejercicio1;

import java.util.*;

public class mainEjercicio1_a {
	public static void main(String[] args) {
		ArrayList<Profesor> profesores = new ArrayList<Profesor>();
		
		Profesor profesor = new Profesor();
		
		profesor.setNombre("Marcos Martínez");
		profesor.setCargo("Titular");
		profesor.setEdad(40);
		profesor.setAntiguedadDocente(15);
		
		profesores.add(profesor);
		
		profesor = new Profesor();
		
		profesor.setNombre("Juliana Álvarez");
		profesor.setCargo("Titular");
		profesor.setEdad(38);
		profesor.setAntiguedadDocente(14);
		
		profesores.add(profesor);
		
		profesor = new Profesor();
		
		profesor.setNombre("Marcos Martínez");
		profesor.setCargo("Jefe de Trabajos Prácticos");
		profesor.setEdad(29);
		profesor.setAntiguedadDocente(6);
		
		profesores.add(profesor);
		
		profesor = new Profesor();
		
		profesor.setNombre("Jesús López");
		profesor.setCargo("Jefe de Trabajos Prácticos");
		profesor.setEdad(34);
		profesor.setAntiguedadDocente(8);
		
		profesores.add(profesor);
		
		profesor = new Profesor();
		
		profesor.setNombre("Mariana González");
		profesor.setCargo("Titular");
		profesor.setEdad(50);
		profesor.setAntiguedadDocente(27);

		profesores.add(profesor);
		
		Iterator<Profesor> iter = profesores.iterator();
		
		System.out.print("ID, Nombre, Edad, Cargo, Antigüedad Docente\n");
		
		while (iter.hasNext()) {
			System.out.print(iter.next().toString() + "\n");
		}
	}
}
