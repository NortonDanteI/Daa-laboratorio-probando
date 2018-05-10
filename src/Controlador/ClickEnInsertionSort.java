package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JTextArea;
import Modelo.Alumno;

public class ClickEnInsertionSort implements ActionListener {
	//paramtros
	JTextArea textocambio1;
	JTextArea textocambio2;

	ArrayList<Integer> lx;
	ArrayList<Alumno> listax1;

	JButton botonx1, botonx2, botonx3, botonx4, botonx5, botonx6, botonx7;
	
	public ClickEnInsertionSort(JTextArea areaDeTexto1, JTextArea areaDeTexto,ArrayList<Integer> l, ArrayList<Alumno> listax, JButton boton1, JButton boton2, JButton boton3, JButton boton4, JButton boton5, JButton boton6, JButton boton7){
		this.textocambio1=areaDeTexto1;
		this.textocambio2=areaDeTexto;
	
		this.lx=l;
		this.listax1=listax;
		
		this.botonx1 = boton1;
		this.botonx2 = boton2;
		this.botonx3 = boton3;
		this.botonx4 = boton4;
		this.botonx5 = boton5;
		this.botonx6 = boton6;
		this.botonx7 = boton7;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		botonx1.setText("Generar numeros");
		botonx1.setEnabled(true);	
    	botonx1.addActionListener(new ClickEnGenerarArregloInt(textocambio1,lx));
    	
    	botonx2.setEnabled(true);
    	botonx2.setText("Generar Lista");
    	botonx2.addActionListener(new ClickEnGenerarListaInsertion(textocambio1,listax1));
    	

    	botonx3.setText("Aplicar metodo");
    	botonx3.setEnabled(true);	
		botonx3.addActionListener(new ClickEnAplicarOrdenInsertion(textocambio1,textocambio2,lx));
		
		botonx4.setEnabled(true);
    	botonx4.addActionListener(new ClickEnAplicarOrdenPorApellidoInsertion(textocambio1,textocambio2,listax1));
    	
		botonx5.setEnabled(true);
		botonx5.addActionListener(new ClickEnAplicarOrdenPorNombreInsertion(textocambio1, textocambio2, listax1));
		
		botonx6.setEnabled(true);
		botonx6.addActionListener(new ClickEnAplicarOrdenPorNotasInsertion(textocambio1, textocambio2, listax1));
		
		botonx7.setEnabled(true);
		botonx7.addActionListener(new ClickEnAplicarOrdenPorEdadInsertion(textocambio1, textocambio2, listax1));
		
	}
}
