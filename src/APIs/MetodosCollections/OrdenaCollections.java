package APIs.MetodosCollections;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JTextArea;

import Modelo.Alumno;
/**
 * 
 * Clase encargada de ordenar en una lista los alumnos creados de la clase {@link Alumno}.
 *
 */
public class OrdenaCollections {
	/**
	 * metodo de tipo {@link ArrayList} que recibe como parametro un {@link ArrayList}
	 * e invoca al metodo Collections.sort para ordenar por apellido
	 * @param lista
	 * @param textocambio2 
	 * @return lista
	 */
	public ArrayList<Alumno> ordenaAlumnoApellido(ArrayList<Alumno> lista){	

		Collections.sort(lista);
		return lista;
	}
	public ArrayList<Alumno> ordenaAlumnoApellido(ArrayList<Alumno> lista, JTextArea textocambio2){	
		textocambio2.append("\nOrdenando alumnos por apellido.");
		Collections.sort(lista);
		return lista;
	}
	/**
	 * metodo de tipo {@link ArrayList} que recibe como parametro un {@link ArrayList}
	 * e invoca al metodo Collections.sort para ordenar por nombre
	 * @param lista
	 * @return lista
	 */
	
	public ArrayList<Alumno> ordenaAlumnoNombre(ArrayList<Alumno> lista){	
		Collections.sort(lista);
		return lista;
	}
	
	public ArrayList<Alumno> ordenaAlumnoNombre(ArrayList<Alumno> lista,JTextArea textocambio2){
		textocambio2.append("\nOrdenando alumnos por Nombre.");
		Collections.sort(lista, Alumno.OrdenarPorNombre);
		return lista;
	}
	/**
	 * metodo de tipo {@link ArrayList} que recibe como parametro un {@link ArrayList}
	 * e invoca al metodo Collections.sort para ordenar por edad
	 * @param lista
	 * @return lista
	 */
	public ArrayList<Alumno> ordenaAlumnoEdad(ArrayList<Alumno> lista){
		
		Collections.sort(lista, Alumno.OrdenarPorEdad);
		return lista;
	}
	
	public ArrayList<Alumno> ordenaAlumnoEdad(ArrayList<Alumno> lista,JTextArea textocambio2){
		textocambio2.append("\nOrdenando alumnsos por Edad.");
		Collections.sort(lista, Alumno.OrdenarPorEdad);
		return lista;
	}
	
	/**
	 * metodo de tipo {@link ArrayList} que recibe como parametro un {@link ArrayList}
	 * e invoca al metodo Collections.sort para ordenar por notas
	 * @param lista
	 * @return lista
	 */
	public ArrayList<Alumno> ordenaAlumnoNotas(ArrayList<Alumno> lista){
		
		Collections.sort(lista, Alumno.OrdenarPorNotas);
		return lista;
	}
	
	public ArrayList<Alumno> ordenaAlumnoNotas(ArrayList<Alumno> lista,JTextArea textocambio2){
		textocambio2.append("\nOrdenando alumnos por Notas.");
		Collections.sort(lista, Alumno.OrdenarPorNotas);
		return lista;
	}
	
}
