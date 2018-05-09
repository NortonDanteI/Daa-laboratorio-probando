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
		int[] array1 = new int [10];
		for(int i=0;i<array1.length;i++) {
			array1[i]=(int) ((Math.random()*90)+1);
		}
		ordena.ordenandoArreglo(array1);
		System.out.println(Arrays.toString(array1));
		int[] esperado = ordena.ordenandoArreglo(array1);
		assertArrayEquals(esperado, array1);
	}

}
