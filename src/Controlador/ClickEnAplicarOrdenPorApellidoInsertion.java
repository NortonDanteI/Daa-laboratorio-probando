package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JTextArea;

import APIs.AlgoritmoInsertionsort.InsertionSort;
import Modelo.Alumno;

public class ClickEnAplicarOrdenPorApellidoInsertion implements ActionListener{
	JTextArea textocambio3; JTextArea textocambio4; ArrayList<Alumno> listax2;
	
	public ClickEnAplicarOrdenPorApellidoInsertion(JTextArea textocambio1, JTextArea textocambio2, ArrayList<Alumno> listax1){
		this.textocambio3 = textocambio1;
		this.textocambio4 = textocambio2;
		this.listax2 = listax1;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		textocambio4.setText(null);
		textocambio4.append("Ordenando por apellido mediante Insertion Sort\n");
		
		InsertionSort.ordenarListaApellido(listax2,textocambio4);
		textocambio3.append("----------------------------------------------------------------------------------------\n");
		for(int ite=0;ite<listax2.size();ite++) {
			textocambio3.append(	(listax2.get(ite)).toString()+"\n");
		}

	}
}
