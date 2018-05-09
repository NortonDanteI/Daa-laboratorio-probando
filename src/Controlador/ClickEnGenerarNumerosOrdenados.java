package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JTextArea;

import APIs.MetodosArrays.OrdenaArreglo;

public class ClickEnGenerarNumerosOrdenados implements ActionListener{
	JTextArea textcambio1;
	int[] numerosx;
	OrdenaArreglo ordena1= new OrdenaArreglo();
	String numeros;
	
	public ClickEnGenerarNumerosOrdenados(JTextArea areaDeTexto1, int[] numerosx1){
		this.textcambio1=areaDeTexto1;
		this.numerosx = numerosx1;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		for (int i=0; i<numerosx.length; i++) {
			numerosx[i] =(int) ((Math.random()*90)+1);
		}
		
		numerosx=ordena1.ordenandoArreglo(numerosx);
		textcambio1.setText(null);
		textcambio1.setText(Arrays.toString(numerosx));
	}
}
