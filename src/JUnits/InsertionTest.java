package JUnits;

import static org.junit.Assert.assertEquals;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;

import org.junit.Before;
import org.junit.Test;

import APIs.AlgoritmoInsertionsort.InsertionSort;
import Modelo.Alumno;

public class InsertionTest {
	ArrayList<Alumno> listax;
	Alumno alumno1, alumno2, alumno3, alumno4, alumno5;
	
	@Before
	public void before(){
		alumno1 = new Alumno("Gonzalo", "Villalobos", 24, 4.3);
		alumno2 = new Alumno("Sebastian", "Urrutia", 24, 5.0);
		alumno3 = new Alumno("Norton", "Irarrazabal", 22, 4.8);
		alumno4 = new Alumno("Angelo", "Perez", 27, 5.2);
		alumno5 = new Alumno("Juan Pablo", "Valdivia", 24, 6.0);
		listax = new ArrayList<>();
	}

	@Test
	public void testEnteros() {
		ArrayList<Integer> lista = new ArrayList<>();
		ArrayList<Integer> L= new ArrayList<>();
		
		int j = 0;
		
		for(int i = 1;i < 10;i++) {
			do{
				j = new SecureRandom().nextInt(100)+1;
			}while(lista.contains(j));
			System.out.println(j+"|");
			InsertionSort.insertarListaEnteros(lista,j);
			L.add(j);
		}
	
		System.out.println("\nlista de insersion ordenada");
		InsertionSort.imprimirListaEnteros(lista);
		
		Collections.sort(L);
		assertEquals(L,lista);
	}
	
	@Test
	public void testOrdenaAlumnoNombre() {
		System.out.println("ORDENANDO POR NOMBRE");
		listax.add(alumno1); listax.add(alumno2); listax.add(alumno3); listax.add(alumno4); listax.add(alumno5);
	
		InsertionSort.ordenarListaNombre(listax);
		InsertionSort.imprimirListaAlumno(listax);
	}
	
	@Test
	public void testApellido() {
		System.out.println("ORDENANDO POR APELLIDO");
		listax.add(alumno1); listax.add(alumno2); listax.add(alumno3); listax.add(alumno4); listax.add(alumno5);
		
		InsertionSort.ordenarListaApellido(listax);
		InsertionSort.imprimirListaAlumno(listax);
	}
	
	@Test
	public void testEdad() {
		System.out.println("ORDENANDO POR EDAD");
		listax.add(alumno1); listax.add(alumno2); listax.add(alumno3); listax.add(alumno4); listax.add(alumno5);
		
		InsertionSort.ordenarListaEdad(listax);
		InsertionSort.imprimirListaAlumno(listax);
	}
	
	@Test
	public void testNota() {
		System.out.println("ORDENANDO POR NOTA");
		listax.add(alumno1); listax.add(alumno2); listax.add(alumno3); listax.add(alumno4); listax.add(alumno5);
		
		InsertionSort.ordenarListaNota(listax);
		InsertionSort.imprimirListaAlumno(listax);
	}

}
