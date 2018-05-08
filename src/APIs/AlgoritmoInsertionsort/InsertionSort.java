/**
 * 
 */
package APIs.AlgoritmoInsertionsort;

import java.util.ArrayList;

import Modelo.Alumno;

/**
 * InsertionSort, ordenamiento de insersion, inserta ordenadamente
 * los parametros entregados. ademas de usar su metdo de ordenamiento
 * para ordenar listas previas.
 * 
 * @author Juan Pablo Valdivia Astudillo
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
			lista.add(valor);
		}else {
			System.out.print("(el valor existe) ");
		}
		
		if(lista.size() > 1) {
			ordenarListaEnteros(lista);
		}
		
	}
	
	public static void insertarListaClase(ArrayList<Alumno> lista, Alumno est) {
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
	 * Metodo de ordenamiento de Clase @Estudiante, por nombre
	 * @param lista
	 */
	public static void ordenarListaNombre(ArrayList<Alumno> lista) {
		int tam = lista.size();
		
		for(int i = 0;i < tam;i++) {
			Alumno auxE = lista.get(i);
			String aux = auxE.getNombre();
			for(int j = i;j > 0;j--) {
				if(aux.compareTo(lista.get(j-1).getNombre()) < 0) {
					lista.set(j, lista.get(j-1));
					lista.set(j-1, auxE);
					
					imprimirListaAlumno(lista);
					
				}
			}
		}
		
	}

	/**
	 * Metodo de ordenamiento de la Clase @Estudiante, por apellido
	 * @param lista
	 */
	public static void ordenarListaApellido(ArrayList<Alumno> lista) {
		int tam = lista.size();
		
		for(int i = 0;i < tam;i++) {
			Alumno auxE = lista.get(i);
			String aux = auxE.getApellido();
			for(int j = i;j > 0;j--) {
				if(aux.compareTo(lista.get(j-1).getApellido()) < 0) {
					lista.set(j, lista.get(j-1));
					lista.set(j-1, auxE);
					
					imprimirListaAlumno(lista);
					
				}
			}
		}
	}


	/**
	 * Metodo de ordenamiento por edad, de la clase @Estudiante
	 * @param lista
	 */
	public static void ordenarListaEdad(ArrayList<Alumno> lista) {
		int tam = lista.size();
		
		for(int i = 0;i < tam;i++) {
			Alumno auxE = lista.get(i);
			int aux = auxE.getEdad();
			for(int j = i;j > 0;j--) {
				if(aux < lista.get(j-1).getEdad()) {
					lista.set(j, lista.get(j-1));
					lista.set(j-1, auxE);
					
					imprimirListaAlumno(lista);
					
				}
			}
		}
	}

	/**
	 * Metodo de ordenamiento por notas, de la clase @Estudiante
	 * @param lista
	 */
	public static void ordenarListaNota(ArrayList<Alumno> lista) {
		int tam = lista.size();
		
		for(int i = 0;i < tam;i++) {
			Alumno auxE = lista.get(i);
			double aux = auxE.getNota();
			for(int j = i;j > 0;j--) {
				if(aux < lista.get(j-1).getNota()) {
					lista.set(j, lista.get(j-1));
					lista.set(j-1, auxE);
					
					imprimirListaAlumno(lista);
					
				}
			}
		}
	}
	
	/**
	 * Metodo de impresion de datos en la Lista de enteros
	 * @param lista
	 */
	public static void imprimirListaEnteros(ArrayList<Integer> lista) {
		System.out.println(lista);
	}
	
	/**
	 * Metodo de impresion de lista de @Estudiante
	 * @param lista
	 */
	public static void imprimirListaAlumno(ArrayList<Alumno> lista) {
		int tam = lista.size();
		for(int i = 0;i < tam;i++) {
			System.out.print("  Nombre: "+lista.get(i).getNombre());
			System.out.print("  Apellido: "+lista.get(i).getApellido());
			System.out.print("  Edad: "+lista.get(i).getEdad());
			System.out.println("  Nota: "+lista.get(i).getNota());
		}
	}


}
