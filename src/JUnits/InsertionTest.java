package JUnits;

import static org.junit.jupiter.api.Assertions.*;

import java.security.SecureRandom;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import APIs.AlgoritmoInsertionsort.InsertionSort;

class InsertionTest {

	@Test
	void test() {
		ArrayList<Integer> lista = new ArrayList<>();
		ArrayList<Integer> L= new ArrayList<>();
		
		int j = 0;
		
		for(int i = 1;i < 30;i++) {
			j = new SecureRandom().nextInt(100)+1;
			System.out.println(j);
			InsertionSort.insertarListaEnteros(lista,j);
			L.add(j);
		}
		
		InsertionSort.imprimirListaEnteros(lista);
		
		assertEquals(L.contains(j), lista.contains(j));
	}

}
