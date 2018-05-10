package JUnits;

import java.util.List;
import java.util.Vector;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Modelo.Alumno;

public class QuickSortGenericoTest {
	
	private List<Alumno> lista = new Vector<Alumno>();
	private List<Alumno> listaEsperada = new Vector<Alumno>();
	private List<Alumno> listaFinal;
	
	@Before
	public void initialize(){
		lista.add(new Alumno("Angelo", "Perez", 20, 7));
		lista.add(new Alumno("Juan", "Urrutia", 20, 7));
		lista.add(new Alumno("Osvaldo", "Casas", 20, 7));
		lista.add(new Alumno("Alvaro", "Tabilo", 20, 7));
		lista.add(new Alumno("Danilo", "Damasco", 20, 7));
		
		listaEsperada.add(new Alumno("Osvaldo", "Casas", 20, 7));
		listaEsperada.add(new Alumno("Danilo", "Damasco", 20, 7));
		listaEsperada.add(new Alumno("Angelo", "Perez", 20, 7));
		listaEsperada.add(new Alumno("Alvaro", "Tabilo", 20, 7));
		listaEsperada.add(new Alumno("Juan", "Urrutia", 20, 7));
		
		System.out.println("\n\t --Datos a ordenar --");
		for(int i = 0; i<5; i++){
			System.out.println(lista.get(i).toString());
		}
		
	}
	
	@Test
	public void main(){
		APIs.AlgoritmoQuicksort.QuickSortGenerico<Alumno> QuickSort = new APIs.AlgoritmoQuicksort.QuickSortGenerico<Alumno>();
		listaFinal = QuickSort.OrdenaGenerico(lista);
		//Assert.assertArrayEquals(listaFinal, listaEsperada);
		for(int i = 0; i<5; i++){
			Assert.assertEquals(listaFinal.get(i).getApellido(), listaEsperada.get(i).getApellido());
		}
	}
	
	@After
	public void resultado(){
		System.out.println("\n\t --Datos ordenas --");
		for(int i = 0; i<5; i++){
			System.out.println(listaFinal.get(i).toString());
		}
	}
}
