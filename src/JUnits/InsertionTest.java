package JUnits;

import static org.junit.jupiter.api.Assertions.*;

import java.security.SecureRandom;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import APIs.AlgoritmoInsertionsort.InsertionSort;
import Modelo.Estudiante;

class InsertionTest {

	@Test
	void testEnteros() {
		ArrayList<Integer> lista = new ArrayList<>();
		ArrayList<Integer> L= new ArrayList<>();
		
		int j = 0;
		
		for(int i = 1;i < 30;i++) {
			do{
				j = new SecureRandom().nextInt(100)+1;
			}while(lista.contains(j));
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
	
	@Test
	void testNombre() {
		ArrayList<Estudiante> lista = new ArrayList<>();
		String n1 = "pablo";
		String n2 = "juan";
		
		lista.add(new Estudiante(n1,n2));
		lista.add(new Estudiante(n2,n1));
		
		System.out.println("Ordenando por nombre");
		InsertionSort.ordenarListaNombre(lista);
		
		InsertionSort.imprimirListaEstudiante(lista);
	}
	
	@Test
	void testApellido() {
		ArrayList<Estudiante> lista = new ArrayList<>();
		String n1 = "pablo";
		String n2 = "juan";
		
		
		lista.add(new Estudiante(n2,n1));
		lista.add(new Estudiante(n1,n2));
		
		System.out.println("Ordenando por apellido");
		InsertionSort.ordenarListaApellido(lista);
		
		InsertionSort.imprimirListaEstudiante(lista);
	}

}
