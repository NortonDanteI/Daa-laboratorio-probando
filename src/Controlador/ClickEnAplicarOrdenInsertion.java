package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

import APIs.AlgoritmoInsertionsort.InsertionSort;

import javax.swing.JTextArea;

public class ClickEnAplicarOrdenInsertion implements ActionListener {
	JTextArea textocambioxx1;
	JTextArea textocambioxx2;
	ArrayList<Integer> lxxx;
	
	public ClickEnAplicarOrdenInsertion(JTextArea textocambio1, JTextArea textocambio2, ArrayList<Integer> lx){
		this.textocambioxx1=textocambio1;
		this.textocambioxx2=textocambio2;
		this.lxxx=lx;
	}

	public void actionPerformed(ActionEvent arg0) {
		textocambioxx2.setText(null);
		textocambioxx2.append("Aplicando Algoritmo Insertion Sort\n");
		
		InsertionSort.ordenarListaEnteros(lxxx,textocambioxx2);
		textocambioxx1.append("\n"+Arrays.toString(lxxx.toArray()));
	}
}
