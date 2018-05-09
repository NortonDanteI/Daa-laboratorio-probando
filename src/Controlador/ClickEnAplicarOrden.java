package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import APIs.MetodosArrays.OrdenaArreglo;

public class ClickEnAplicarOrden  implements ActionListener {
	JLabel labelcambio2;
	JLabel labelcambio3;
	int[] numerosx2;
	
//	int[] numeros1 = new int [21];
//	String numeros;
	OrdenaArreglo ordena1= new OrdenaArreglo();
	
	JTextArea estado;
	JTextArea estado1;
	
	public ClickEnAplicarOrden(JTextArea areaDeTexto1, JTextArea areaDeTexto, int[] numerosx1){
		this.estado1=areaDeTexto1;	
		this.estado=areaDeTexto;
		this.numerosx2=numerosx1;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {	
		numerosx2=ordena1.ordenandoArreglo(numerosx2);
		
		estado.setText(null);
		estado.append(" Aplico el metodo Arrays.Sort; Si el arreglo se encontraba\n"
				    + "ordenado el coste del metodo es n^2 en caso contrario nlogn");
	
		estado1.append("\n"+Arrays.toString(numerosx2));
    }
}
