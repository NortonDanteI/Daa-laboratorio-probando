package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JTextArea;

import Modelo.Alumno;

public class ClickEnArraysSort implements ActionListener{
	JButton botonx1,botonx2,botonx3,botonx4,botonx5,botonx6,botonx7;
	ArrayList<Alumno> listax;
	JTextArea areaDeTextox1;
	JTextArea areaDeTextox2;
	int[] numerosxx1;
	
	public ClickEnArraysSort(int[] numerosx1, JTextArea areaDeTexto1, JTextArea areaDeTexto, JButton boton1, JButton boton2, JButton boton3, JButton boton4, JButton boton5, JButton boton6, JButton boton7){
		this.botonx1 = boton1;
		this.botonx2 = boton2;
		this.botonx3 = boton3;
		this.botonx4 = boton4;
		this.botonx5 = boton5;
		this.botonx6 = boton6;
		this.botonx7 = boton7;
		
		this.numerosxx1 = numerosx1;
		
		this.areaDeTextox1 = areaDeTexto1;
		this.areaDeTextox2 = areaDeTexto;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
    	botonx1.setText("Generar numeros ordenados");
    	botonx1.addActionListener(new ClickEnGenerarNumerosOrdenados(areaDeTextox1,numerosxx1));
    	
    	botonx2.setEnabled(true);
    	botonx2.addActionListener(new ClickEnGenerarNumerosRandom(areaDeTextox1,numerosxx1));
    	
    	botonx3.setText("Aplicar metodo");
		botonx3.addActionListener(new ClickEnAplicarOrden(areaDeTextox1,areaDeTextox2,numerosxx1));
		
		botonx4.setEnabled(false);
		botonx5.setEnabled(false);
		botonx6.setEnabled(false);
		botonx7.setEnabled(false);
	}

}
