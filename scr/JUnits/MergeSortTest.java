package Junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import APIs.Alumno;
import APIs.MergeSort;

class MergeSortTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void testPorArreglo() {
		int arreglo1[] = {10,21,2,3,41,6,7,12,1};
		int arreglo2[] = {10,21,2,3,41,6,7,12,1};
		MergeSort.porArreglo(arreglo1, 0, arreglo1.length - 1);
		Arrays.sort(arreglo2);
		assertArrayEquals(arreglo2, arreglo1);
	}

	@Test
	void testPorNombre() {
		ArrayList<Alumno> lista1 = new ArrayList<>();
		ArrayList<Alumno> lista2 = new ArrayList<>();
		Alumno a1 = new Alumno("Sebastian", "Urrutia", 24, 4);
		Alumno a2 = new Alumno("Gonzalo", "Villalobos", 23, 5);
		Alumno a3 = new Alumno("Angelo", "Perez", 27, 3);
		Alumno a4 = new Alumno("Juan", "Valdivia", 22, 7);
		Alumno a5 = new Alumno("Norton", "Irarrazabal", 23, 2);
		lista1.add(a1);
		lista1.add(a2);
		lista1.add(a3);
		lista1.add(a4);
		lista1.add(a5);
		lista2.add(a3);
		lista2.add(a2);
		lista2.add(a4);
		lista2.add(a5);
		lista2.add(a1);
		MergeSort.porNombre(lista1, 0, lista1.size() -1);
		assertEquals(lista2, lista1);
	}

	@Test
	void testPorApellido() {
		ArrayList<Alumno> lista1 = new ArrayList<>();
		ArrayList<Alumno> lista2 = new ArrayList<>();
		Alumno a1 = new Alumno("Sebastian", "Urrutia", 24, 4);
		Alumno a2 = new Alumno("Gonzalo", "Villalobos", 23, 5);
		Alumno a3 = new Alumno("Angelo", "Perez", 27, 3);
		Alumno a4 = new Alumno("Juan", "Valdivia", 22, 7);
		Alumno a5 = new Alumno("Norton", "Irarrazabal", 23, 2);
		lista1.add(a1);
		lista1.add(a2);
		lista1.add(a3);
		lista1.add(a4);
		lista1.add(a5);
		lista2.add(a5);
		lista2.add(a3);
		lista2.add(a1);
		lista2.add(a4);
		lista2.add(a2);
		MergeSort.porApellido(lista1, 0, lista1.size() -1);
		assertEquals(lista2, lista1);
	}

	@Test
	void testPorEdad() {
		ArrayList<Alumno> lista1 = new ArrayList<>();
		ArrayList<Alumno> lista2 = new ArrayList<>();
		Alumno a1 = new Alumno("Sebastian", "Urrutia", 24, 4);
		Alumno a2 = new Alumno("Gonzalo", "Villalobos", 23, 5);
		Alumno a3 = new Alumno("Angelo", "Perez", 27, 3);
		Alumno a4 = new Alumno("Juan", "Valdivia", 21, 7);
		Alumno a5 = new Alumno("Norton", "Irarrazabal", 22, 2);
		lista1.add(a1);
		lista1.add(a2);
		lista1.add(a3);
		lista1.add(a4);
		lista1.add(a5);
		lista2.add(a4);
		lista2.add(a5);
		lista2.add(a2);
		lista2.add(a1);
		lista2.add(a3);
		MergeSort.porEdad(lista1, 0, lista1.size() -1);
		assertEquals(lista2, lista1);
	}

	@Test
	void testPorNota() {
		ArrayList<Alumno> lista1 = new ArrayList<>();
		ArrayList<Alumno> lista2 = new ArrayList<>();
		Alumno a1 = new Alumno("Sebastian", "Urrutia", 24, 4);
		Alumno a2 = new Alumno("Gonzalo", "Villalobos", 23, 5);
		Alumno a3 = new Alumno("Angelo", "Perez", 27, 3);
		Alumno a4 = new Alumno("Juan", "Valdivia", 22, 7);
		Alumno a5 = new Alumno("Norton", "Irarrazabal", 23, 2);
		lista1.add(a1);
		lista1.add(a2);
		lista1.add(a3);
		lista1.add(a4);
		lista1.add(a5);
		lista2.add(a5);
		lista2.add(a3);
		lista2.add(a1);
		lista2.add(a2);
		lista2.add(a4);
		MergeSort.porNota(lista1, 0, lista1.size() -1);
		System.out.println(lista1);
		System.out.println(lista2);
		assertEquals(lista2, lista1);
	}

}
