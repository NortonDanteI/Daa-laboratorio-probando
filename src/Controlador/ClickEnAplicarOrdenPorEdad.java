package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextArea;

import APIs.MetodosCollections.OrdenaCollections;
import Modelo.Alumno;

public class ClickEnAplicarOrdenPorEdad implements ActionListener{
	JTextArea textocambio1;
	JTextArea textocambio2;
	ArrayList<Alumno> listax1;
	OrdenaCollections ordena = new OrdenaCollections();
	
	public ClickEnAplicarOrdenPorEdad(ArrayList<Alumno> lista, JTextArea areaDeTexto1, JTextArea areaDeTexto){
		this.textocambio1=areaDeTexto1;
		this.textocambio2=areaDeTexto;
		this.listax1=lista;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		textocambio2.setText(null);	
		textocambio2.append("Aplicando Collections.Sort.");
		
		listax1=ordena.ordenaAlumnoEdad(listax1,textocambio2);
		textocambio1.append("----------------------------------------------------------------------------------------------------------\n");
		for(int ite=0;ite<listax1.size();ite++) {
			textocambio1.append(	(listax1.get(ite)).toString()+"\n");
		}
	}

}
