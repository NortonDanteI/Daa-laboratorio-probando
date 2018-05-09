package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JTextArea;

public class ClickEnGenerarNumerosRandom implements ActionListener {
	JTextArea textocambio1;
	int[] numeros;
	
	public ClickEnGenerarNumerosRandom(JTextArea areaDeTexto1, int[] numerosx1){
		this.textocambio1=areaDeTexto1;
		this.numeros=numerosx1;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		for (int i=0; i<numeros.length; i++) {
			numeros[i] =(int) ((Math.random()*90)+1);
		}
		textocambio1.setText(Arrays.toString(numeros));
	}
}
