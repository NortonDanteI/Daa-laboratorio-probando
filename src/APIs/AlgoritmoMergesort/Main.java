package APIs.AlgoritmoMergesort;

import java.util.ArrayList;
import Modelo.Alumno;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[] = {7,3,5,8,2,4};
		System.out.println("Arreglo Inicial");
		for(int i = 0; i < array1.length; ++i) {
			System.out.println(array1[i]);
		}
		MergeSort.porArreglo(array1, 0, array1.length -1);
		System.out.println("Arreglo Ordenado");
		for(int i = 0; i < array1.length; ++i) {
			System.out.println(array1[i]);
		}
		ArrayList<Alumno> lista = new ArrayList<>();
		Alumno a1 = new Alumno("Sebastian", "Urrutia", 24, 4);
		Alumno a2 = new Alumno("Gonzalo", "Villalobos", 23, 5);
		Alumno a3 = new Alumno("Angelo", "Perez", 27, 3);
		Alumno a4 = new Alumno("Juan", "Valdivia", 22, 7);
		Alumno a5 = new Alumno("Norton", "Irarrazabal", 23, 2);
		lista.add(a1);
		lista.add(a2);
		lista.add(a3);
		lista.add(a4);
		lista.add(a5);
		
		//System.out.println(lista);
		MergeSort.porNombre(lista, 0, lista.size() - 1);
		System.out.println(lista);
		MergeSort.porNota(lista, 0, lista.size()-1);
		System.out.println(lista);
		// aux = "Valdivia";
		//String aux1 = "Villalobos";
		//System.out.println(aux1.compareTo(aux));
	}

}
