package Metodos.collection;

import java.util.Comparator;
/**
 * Clase encargada de ordenar por nombre por orden alfabetico.
 * Esto lo logra implementando la interface {@link Comparator} y como parametro tiene la clase {@link Alumno}.
 *
 */
public class OrdenarPorNombre implements Comparator<Alumno>{
	/**
	 * metodo de la interface {@link Comparator} que toma un nombre y compara otro mediante el metodo comparTo.
	 */
	@Override
	public int compare(Alumno al1, Alumno al2) {
		return al1.getNombre().compareTo(al2.getNombre());
	}
}
