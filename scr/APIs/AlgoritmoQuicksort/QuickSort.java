package APIs.AlgoritmoQuicksort;



/**
 * 
 * @author Angelo Perez Olivares
 *
 */
public class QuickSort {
	
	//private int[] arreglo;

	/**
	 * Recibe un Arreglo de datos finitos y los ordena de menor a mayor usando el metodo QuickSort
	 * @param Arreglo Con valores enteros (integer) sin orden especifico del tipo int[].
	 * @return Retorna un arreglo de tipo int[] ordenado.
	 */
	public int [] OrdenaEnteros(int arreglo[]){
		return OrdenaEnteros(arreglo, 0, arreglo.length - 1);
	}
	/**
	 * Ordena de forma recursiva usando QuickSort una lista de numeros.
	 * @param Arreglo Con valores enteros (integer) sin orden especifico del tipo int[].
	 * @param a Inicio del arreglo
	 * @param b	Final del arrelo 
	 * @return Retorna un arreglo de tipo int[] ordenado.
	 */
	public int[] OrdenaEnteros(int arreglo[], int a, int b){

		//for(int i= 0;i<arreglo.length;i++)
			//System.out.print(arreglo[i]);
		//System.out.println("\tinicio");
		
		int temporal;
		int inicio = a;
		int fin = b;
		
		//La elecion del pivote es fundamental en el algoritmo
		int pivote = arreglo[(inicio+fin)/2];
		
		do{
			while(arreglo[inicio] < pivote){
				inicio++;
			}
			while(arreglo[fin] > pivote){
				fin--;
			}
			
			if(inicio <= fin){
				temporal = arreglo[inicio];
				arreglo[inicio] = arreglo[fin];
				arreglo[fin] = temporal;
				inicio++;
				fin--;
			}
		}while(inicio <= fin);
		
		if(a < fin){
			OrdenaEnteros(arreglo, a, fin);
			//for(int i= 0;i<arreglo.length;i++)
				//System.out.print(arreglo[i]);
			//System.out.println("\tprimer if");
		}
		if(inicio < b){
			OrdenaEnteros(arreglo, inicio, b);
			//for(int i= 0;i<arreglo.length;i++)
				//System.out.print(arreglo[i]);
			//System.out.println("\tsegundo if");
		}
		
		return arreglo;
	}
}
