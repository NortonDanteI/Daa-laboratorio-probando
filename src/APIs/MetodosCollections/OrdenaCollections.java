package APIs.MetodosCollections;

import java.util.ArrayList;
import java.util.Collections;

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
	 * @return lista
	 */
	public ArrayList<Alumno> ordenaAlumnoApellido(ArrayList<Alumno> lista){	
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
	
}
