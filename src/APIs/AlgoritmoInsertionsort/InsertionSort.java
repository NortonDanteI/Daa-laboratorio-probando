/**
 * 
 */
package APIs.AlgoritmoInsertionsort;

import java.util.ArrayList;

import Modelo.Estudiante;

/**
 * @author juan_
 *
 */
public class InsertionSort {
	
	/**
	 * Metodo de insercion directo en una lista, usando el valor entero y la lista base entregada
	 * Comparando su existencia para no ingresar duplicados
	 * @param lista
	 * @param valor
	 */
	public static void insertarListaEnteros(ArrayList<Integer> lista, int valor){
		
		if(!lista.contains(valor)) {
			lista.add(valor);
		}else {
			System.out.println("el valor existe");
		}
		
		if(lista.size() > 1) {
			ordenarListaEnteros(lista);
		}
		
	}

	/**
	 * Ordena la lista generada en @insertarListaEnteros
	 * @param lista
	 */
	private static void ordenarListaEnteros(ArrayList<Integer> lista) {
		int tam = lista.size();
		int aux = lista.get(tam-1);
		int cont = tam-1;
		for(int i = cont;i > 0;i--) {
			if(aux < lista.get(i-1)) {
				lista.set(i, lista.get(i-1));
				cont--;
				lista.set(i-1,aux);
				imprimirListaEnteros(lista);
			}else {
				break;
			}
		}
		lista.set(cont, aux);
	}
	
	public static void imprimirListaEnteros(ArrayList<Integer> lista) {
		System.out.println(lista);
	}
	
	public static void insertarListaEstudiante(ArrayList<Integer> lista, Estudiante est) {
		
	}

}
