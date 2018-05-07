package Metodos.collection;

import java.util.Comparator;
/**
 * Clase encargada de ordenar por edad de menor a mayor.
 * Esto lo logra implementando la interface {@link Comparator} y como parametro tiene la clase {@link Alumno}.
 *
 */
public class OrdenarPorEdad implements Comparator<Alumno>{
	
	/**
	 * metodo de la interface {@link Comparator} que compara dos edades y las ordena de menor a mayor.
	 */
	@Override
	public int compare(Alumno al1, Alumno al2) {
		return al1.getEdad() - al2.getEdad();
	}

}
