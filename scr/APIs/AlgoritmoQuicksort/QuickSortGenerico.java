package APIs.AlgoritmoQuicksort;

import java.util.List;

public class QuickSortGenerico<T extends Comparable<T>>{
	
	/**
	 * Ordena un List con valores genericos usando QuickSort
	 * @param lista con los datos a ordenar del tipo List
	 * @return Retorna un list ordenado. El orden aplicado dependera de como se
	 * declare el compareTo()
	 */
	public List<T> OrdenaGenerico(List<T> lista){
		OrdenaGenerico(lista, 0, lista.size() - 1);
		return lista;
	}
	
	/**
	 * Ordena un List con valores genericos usando QuickSort
	 * @param lista con los datos a ordenar del tipo List
	 * @param a Inicio del arreglo
	 * @param b	Final del arrelo 
	 * @return Retorna un list ordenado. El orden aplicado dependera de como se
	 * declare el compareTo()
	 */
	public List<T> OrdenaGenerico(List<T> lista, int a, int b){
		
		T temporal;
		int inicio = a;
		int fin = b;
		T pivote = lista.get((inicio+fin)/2); //usamos el primer valor como pivote.
		
		do{
			while(lista.get(inicio).compareTo(pivote) < 0){  //arreglo[inicio] < pivote
				inicio++;
			}
			
			while(lista.get(fin).compareTo(pivote) > 0){ //arreglo[fin] > pivote
				fin--;
			}
			
			if(inicio <= fin){
				temporal = lista.get(inicio);
				lista.set(inicio, lista.get(fin));
				lista.set(fin, temporal);
				inicio++;
				fin--;
			}
		}while(inicio <= fin);
		
		if(a < fin){
			OrdenaGenerico(lista, a, fin);
		}
		if(inicio < b){
			OrdenaGenerico(lista, inicio, b);
		}
		
		return lista;
	}
}
