package Metodos.collection;

import java.util.Comparator;
/**
 * Clase encargada de ordenar las notas de un alumno de mayor a menor.
 * Esto lo logra implementando la interface {@link Comparator} y como parametro tiene la clase {@link Alumno}.
 *
 */
public class OrdenarPorNotas implements Comparator<Alumno> {
	
	/**
	 * metodo de la interface {@link Comparator} que compara dos notas y las ordena de mayor a menor.
	 */
	@Override
	public int compare(Alumno al1, Alumno al2) {
		return Double.compare(al2.getNotas(), al1.getNotas());
	}

}
