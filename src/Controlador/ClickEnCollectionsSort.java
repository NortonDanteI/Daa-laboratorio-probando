package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JTextArea;

import Modelo.Alumno;

public class ClickEnCollectionsSort implements ActionListener{
	JButton botonxx1,botonxx2,botonxx3,botonxx4,botonxx5,botonxx6,botonxx7;
	ArrayList<Alumno> listax;
	JTextArea areaDeTextoxx1;
	JTextArea areaDeTextoxx2;
	ArrayList<Alumno> listax1;
	
	public ClickEnCollectionsSort(ArrayList<Alumno> listax, JTextArea areaDeTexto1, JTextArea areaDeTexto, JButton boton1, JButton boton2, JButton boton3, JButton boton4, JButton boton5, JButton boton6, JButton boton7){
		this.botonxx1 = boton1;
		this.botonxx2 = boton2;
		this.botonxx3 = boton3;
		this.botonxx4 = boton4;
		this.botonxx5 = boton5;
		this.botonxx6 = boton6;
		this.botonxx7 = boton7;
		
		this.listax1 = listax;
		
		this.areaDeTextoxx1 = areaDeTexto1;
		this.areaDeTextoxx2 = areaDeTexto;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		botonxx1.setText("Generar lista");
    	botonxx1.addActionListener(new ClickEnGenerarLista(listax1,areaDeTextoxx1));
    	
    	botonxx2.setEnabled(false);
    	botonxx3.setEnabled(false);
    	
    	botonxx4.setEnabled(true);
    	botonxx4.addActionListener(new ClickEnAplicarOrdenPorApellido(listax1,areaDeTextoxx1,areaDeTextoxx2));
    	
		botonxx5.setEnabled(true);
		botonxx5.addActionListener(new ClickEnAplicarOrdenPorNombre(listax1, areaDeTextoxx1, areaDeTextoxx2));
		
		botonxx6.setEnabled(true);
		botonxx6.addActionListener(new ClickEnAplicarOrdenPorNotas(listax1, areaDeTextoxx1, areaDeTextoxx2));
		
		botonxx7.setEnabled(true);
		botonxx7.addActionListener(new ClickEnAplicarOrdenPorEdad(listax1, areaDeTextoxx1, areaDeTextoxx2));
	}
}
