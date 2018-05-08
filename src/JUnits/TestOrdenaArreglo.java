package JUnits;

import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

import APIs.MetodosArrays.OrdenaArreglo;

public class TestOrdenaArreglo {
	
	OrdenaArreglo ordena;
	
	@Before
	public void before(){
		ordena = new OrdenaArreglo();
	}
	
	@Test
	public void testOrdenaArreglo() {
		int[] array1 = new int[]{33,22,13,45,63,60,99,10,78};
		ordena.ordenandoArreglo(array1);
		System.out.println(Arrays.toString(array1));
		int[] esperado = ordena.ordenandoArreglo(array1);
		assertArrayEquals(esperado, array1);
	}

}
