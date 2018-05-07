package JUnits;

import static org.junit.jupiter.api.Assertions.*;

import java.security.SecureRandom;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import APIs.AlgoritmoInsertionsort.InsertionSort;

class InsertionTest {

	@Test
	void testEnteros() {
		ArrayList<Integer> lista = new ArrayList<>();
		ArrayList<Integer> L= new ArrayList<>();
		
		int j = 0;
		
		for(int i = 1;i < 30;i++) {
			j = new SecureRandom().nextInt(100)+1;
			System.out.println(j);
			InsertionSort.insertarListaEnteros(lista,j);
			L.add(j);
		}
		System.out.println();
		System.out.println("lista de insersion ordenada");
		InsertionSort.imprimirListaEnteros(lista);

		InsertionSort.imprimirListaEnteros(L);
		System.out.println("Ordenando lista");
		InsertionSort.ordenarListaEnteros(L);
		InsertionSort.imprimirListaEnteros(L);
		
		assertEquals(L, lista);
	}

}
