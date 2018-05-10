package JUnits;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Angelo Perez Olivares
 *
 */

public class QuickSortTest {
	
	private int arreglo[];
	private int arregloEsperado[];
	private int arregloTEMP[];
	
	@Before
	public void initialize(){
		
		arreglo = new int[] {5,6,4,7,8,2,3,9,1};
		arregloEsperado = new int [] {1,2,3,4,5,6,7,8,9};
		
		System.out.println("\n -- Metodo Primitivo --");
		System.out.print("Arreglo a ordenar:\t");
		for(int i= 0;i<arreglo.length;i++)
			System.out.print(arreglo[i]+" ");
	}
	
	@Test
	public void ordena(){
		
		
		APIs.AlgoritmoQuicksort.QuickSort QuickSort = new APIs.AlgoritmoQuicksort.QuickSort();
		arregloTEMP = QuickSort.OrdenaEnteros(arreglo);
		
		Assert.assertArrayEquals(arregloTEMP, arregloEsperado);
		
		
		
	}
	
	@After
	public void resultado(){
		System.out.print("\nArreglo  ordenado:\t");
		for(int i= 0;i<arregloTEMP.length;i++)
			System.out.print(arregloTEMP[i]+" ");
	}
	
}
