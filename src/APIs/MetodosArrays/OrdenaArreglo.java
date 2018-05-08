package APIs.MetodosArrays;

import java.util.Arrays;

/**
 * Clase encargada de ordenar en un arreglo, numeros enteros.
 *
 */
public class OrdenaArreglo {
	/**
	 * metodo de tipo {@link Arrays} que recibe como parametro un {@link Arrays} y lo ordena
	 * mediante el metodo Arrays.sort(), e imprime el arreglo ordenado.
	 * @param arreglo
	 * @return arreglo.
	 */
	public int[] ordenandoArreglo(int[] arreglo){
		Arrays.sort(arreglo);
		return arreglo;
	}
	
}
