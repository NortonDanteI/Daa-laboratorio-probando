package JUnits;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import org.junit.Before;
import org.junit.Test;

import Modelo.Alumno;
import APIs.MetodosCollections.OrdenaCollections;

public class TestOrdenaCollections {

	OrdenaCollections ordena;
	Alumno alumno1, alumno2, alumno3, alumno4, alumno5;
	
	@Before
	public void before(){
		ordena = new OrdenaCollections();
		alumno1 = new Alumno("Gonzalo", "Villalobos", 24, 4.3);
		alumno2 = new Alumno("Sebastian", "Urrutia", 24, 5.0);
		alumno3 = new Alumno("Norton", "Irarrazabal", 22, 4.8);
		alumno4 = new Alumno("Angelo", "Perez", 27, 5.2);
		alumno5 = new Alumno("Juan Pablo", "Valdivia", 24, 6.0);
	}
	
	@Test
	public void testOrdenaAlumnoApellido() {
		System.out.println("ORDENANDO POR APELLIDO");
		ArrayList<Alumno> lista = new ArrayList<>();
		lista.add(alumno1); lista.add(alumno2); lista.add(alumno3); lista.add(alumno4); lista.add(alumno5);
		ordena.ordenaAlumnoApellido(lista);
		System.out.println(lista);
		ArrayList<Alumno> esperado = ordena.ordenaAlumnoApellido(lista);
		assertEquals(new HashSet<Alumno>(esperado), new HashSet<Alumno>(lista));
	}
	
	@Test
	public void testOrdenaAlumnoNombre() {
		System.out.println("ORDENANDO POR NOMBRE");
		ArrayList<Alumno> lista = new ArrayList<>();
		lista.add(alumno1); lista.add(alumno2); lista.add(alumno3); lista.add(alumno4); lista.add(alumno5);
		ordena.ordenaAlumnoNombre(lista);
		System.out.println(lista);
		ArrayList<Alumno> esperado = ordena.ordenaAlumnoNombre(lista);
		assertEquals(new HashSet<Alumno>(esperado), new HashSet<Alumno>(lista));
	}
	
	@Test
	public void testOrdenaAlumnoEdad() {
		System.out.println("ORDENANDO POR EDAD");
		ArrayList<Alumno> lista = new ArrayList<>();
		lista.add(alumno1); lista.add(alumno2); lista.add(alumno3); lista.add(alumno4); lista.add(alumno5);
		ordena.ordenaAlumnoEdad(lista);
		System.out.println(lista);
		ArrayList<Alumno> esperado = ordena.ordenaAlumnoEdad(lista);
		assertEquals(new HashSet<Alumno>(esperado), new HashSet<Alumno>(lista));
	}
	
	@Test
	public void testordenaAlumnoNotas() {
		System.out.println("ORDENANDO POR NOTAS");
		ArrayList<Alumno> lista = new ArrayList<>();
		lista.add(alumno1); lista.add(alumno2); lista.add(alumno3); lista.add(alumno4); lista.add(alumno5);
		ordena.ordenaAlumnoNotas(lista);
		System.out.println(lista);
		ArrayList<Alumno> esperado = ordena.ordenaAlumnoNotas(lista);
		assertEquals(new HashSet<Alumno>(esperado), new HashSet<Alumno>(lista));
	}

}
