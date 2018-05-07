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
	 * 	Metodo de insercion directo en una lista, usando el
	 * valor entero y la lista base entregada, comparando su
	 * existencia para no ingresar duplicados
	 * @param lista
	 * @param valor
	 */
	public static void insertarListaEnteros(ArrayList<Integer> lista, int valor){
		
		if(!lista.contains(valor)) {
		}else {
			System.out.print("(el valor existe) ");
		}
		lista.add(valor);
		
		if(lista.size() > 1) {
			ordenarListaEnteros(lista);
		}
		
	}

	/**
	 * Ordena la lista generada en @insertarListaEnteros
	 * @param lista
	 */
	public static void ordenarListaEnteros(ArrayList<Integer> lista) {
		int tam = lista.size();
		
		for(int i = 1;i < tam;i++) {
			int aux = lista.get(i);
			for(int j = i;j > 0;j--) {
				if(aux < lista.get(j-1)) {
					lista.set(j, lista.get(j-1));
					lista.set(j-1,aux);
					imprimirListaEnteros(lista);
				}else {
					break;
				}
			}
		}
	}
	
	/**
	 * Metodo de imprecion de datos en la Lista de enteros,
	 * ordenados, y en su proceso de orden
	 * @param lista
	 */
	public static void imprimirListaEnteros(ArrayList<Integer> lista) {
		System.out.println(lista);
	}
	
	public static void insertarListaClase(ArrayList<Estudiante> lista, Estudiante est) {
		if(!lista.contains(est)) {
			lista.add(est);
		}else {
			System.out.println("el valor existe");
		}
		
		if(lista.size() > 1) {
			ordenarListaNombre(lista);
		}if(lista.size() > 1) {
			ordenarListaApellido(lista);
		}if(lista.size() > 1) {
			ordenarListaEdad(lista);
		}if(lista.size() > 1) {
			ordenarListaNota(lista);
		}
	}

	private static void ordenarListaNombre(ArrayList<Estudiante> lista) {
		int tam = lista.size();
		
		for(int i = 0;i < tam;i++) {
			String aux = lista.get(i).getNombre();
			for(int j = i;j > 0;j--) {
				
			}
		}
		
	}

	private static void ordenarListaApellido(ArrayList<Estudiante> lista) {
		
	}


	private static void ordenarListaEdad(ArrayList<Estudiante> lista) {
		
	}

	private static void ordenarListaNota(ArrayList<Estudiante> lista) {
		
	}


}
