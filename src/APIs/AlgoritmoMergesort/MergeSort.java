package APIs.AlgoritmoMergesort;

import java.util.ArrayList;
import Modelo.Alumno;;
/**
 * Clase que implementa el metodo Mergesort para ordenar Alumnos por un atributo
 * indicado o para ordenar un arreglo de enteros.
 * 
 * @author Sebastian
 */

public final class MergeSort {
	// TODO crear el merge sort para todos los atributos
	/**
	 * Ordena un arreglo de numeros enteros por el metodo Merge sort.
	 * 
	 * @param arreglo
	 *            Arreglo de numeros enteros.
	 * @param inicio
	 *            Posicion inicial del arreglo
	 * @param fin
	 *            Posicion final del arreglo.
	 */
	public static void porArreglo(int arreglo[], int inicio, int fin) {
		if (inicio < fin) {
			int medio = (inicio + fin) / 2;
			porArreglo(arreglo, inicio, medio);
			porArreglo(arreglo, medio + 1, fin);
			mezclar(arreglo, inicio, medio, fin);
		}

	}

	public static void porNombre(ArrayList<Alumno> lista1, int inicio, int fin) {
		if(inicio < fin) {
			int medio = (inicio + fin) / 2;
			porNombre(lista1, inicio, medio);
			porNombre(lista1, medio + 1, fin);
			mezclar(lista1, inicio, medio, fin, 0);
		}
		
	}

	public static void porApellido(ArrayList<Alumno> lista, int inicio, int fin) {
		if(inicio < fin) {
			int medio = (inicio + fin) / 2;
			porApellido(lista, inicio, medio);
			porApellido(lista, medio + 1, fin);
			mezclar(lista, inicio, medio, fin, 1);
		}
	}

	public static void porEdad(ArrayList<Alumno> lista, int inicio, int fin) {
		if(inicio < fin) {
			int medio = (inicio + fin) / 2;
			porEdad(lista, inicio, medio);
			porEdad(lista, medio + 1, fin);
			mezclar(lista, inicio, medio, fin, 2);
		}
	}

	public static void porNota(ArrayList<Alumno> lista, int inicio, int fin) {
		if(inicio < fin) {
			int medio = (inicio + fin) / 2;
			porNota(lista, inicio, medio);
			porNota(lista, medio + 1, fin);
			mezclar(lista, inicio, medio, fin, 3);
		}
	}

	public static void mezclar(ArrayList<Alumno> lista,int inicio, int medio, int fin, int opcion) {
		// TODO mezcla del mergesort
		int tam1 = medio - inicio +1;
		int tam2 = fin - medio;
		
		Alumno arregloIzq[] = new Alumno[tam1];
		Alumno arregloDer[] = new Alumno[tam2];
		
		for (int i = 0; i < tam1; ++i) {
			arregloIzq[i] = lista.get(inicio + i);
		}
		for(int j = 0; j < tam2; ++j) {
			arregloDer[j] = lista.get(medio + 1 + j);
		}
		int i = 0, j = 0, aux = inicio;
		switch(opcion) {
			case 0:
				while (i < tam1 && j < tam2) {
					int comparar = arregloIzq[i].getNombre().compareTo(arregloDer[j].getNombre());
					if (comparar <= 0) {
						lista.set(aux, arregloIzq[i]);
						i++;
					} else {
						lista.set(aux, arregloDer[j]);
						j++;
					}
					aux++;
				}
				while (i < tam1) {
					lista.set(aux, arregloIzq[i]);
					i++;
					aux++;
				}
				while (j < tam2) {
					lista.set(aux, arregloDer[j]);
					j++;
					aux++;
				}
				break;
			case 1:
				//TODO Arreglar caso de que empiecen con la misma letra
				while (i < tam1 && j < tam2) {
					int comparar = arregloIzq[i].getApellido().compareToIgnoreCase(arregloDer[j].getApellido());
					if (comparar <= 0) {
						lista.set(aux, arregloIzq[i]);
						i++;
					} else {
						lista.set(aux, arregloDer[j]);
						j++;
					}
					aux++;
				}
				while (i < tam1) {
					lista.set(aux, arregloIzq[i]);
					i++;
					aux++;
				}
				while (j < tam2) {
					lista.set(aux, arregloDer[j]);
					j++;
					aux++;
				}
				break;
			case 2:
					//TODO ordenar por edad
				while (i < tam1 && j < tam2) {
					if (arregloIzq[i].getEdad() <= arregloDer[j].getEdad()) {
						lista.set(aux, arregloIzq[i]);
						i++;
					} else {
						lista.set(aux, arregloDer[j]);
						j++;
					}
					aux++;
				}
				while (i < tam1) {
					lista.set(aux, arregloIzq[i]);
					i++;
					aux++;
				}
				while (j < tam2) {
					lista.set(aux, arregloDer[j]);
					j++;
					aux++;
				}
				break;
			case 3:
					//TODO ordenar por nota
				while (i < tam1 && j < tam2) {
					if (arregloIzq[i].getNotas() <= arregloDer[j].getNotas()) {
						lista.set(aux, arregloIzq[i]);
						i++;
					} else {
						lista.set(aux, arregloDer[j]);
						j++;
					}
					aux++;
				}
				while (i < tam1) {
					lista.set(aux, arregloIzq[i]);
					i++;
					aux++;
				}
				while (j < tam2) {
					lista.set(aux, arregloDer[j]);
					j++;
					aux++;
				}
				break;
		}
	}

	public static void mezclar(int arreglo[], int inicio, int medio, int fin) {
		int tam1 = medio - inicio + 1;
		int tam2 = fin - medio;

		int arregloIzq[] = new int[tam1];
		int arregloDer[] = new int[tam2];

		for (int i = 0; i < tam1; ++i) {
			arregloIzq[i] = arreglo[inicio + i];
		}
		for (int j = 0; j < tam2; ++j) {
			arregloDer[j] = arreglo[medio + 1 + j];
		}
		int i = 0, j = 0, aux = inicio;
		while (i < tam1 && j < tam2) {
			if (arregloIzq[i] <= arregloDer[j]) {
				arreglo[aux] = arregloIzq[i];
				i++;
			} else {
				arreglo[aux] = arregloDer[j];
				j++;
			}
			aux++;
		}
		while (i < tam1) {
			arreglo[aux] = arregloIzq[i];
			i++;
			aux++;
		}
		while (j < tam2) {
			arreglo[aux] = arregloDer[j];
			j++;
			aux++;
		}
	}

}
