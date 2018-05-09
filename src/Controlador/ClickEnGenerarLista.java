package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextArea;
import Modelo.Alumno;

public class ClickEnGenerarLista implements ActionListener{
	JTextArea textAreacambio1;
	ArrayList<Alumno> listax;
	Alumno alumno1, alumno2, alumno3, alumno4, alumno5;
	
	public ClickEnGenerarLista(ArrayList<Alumno> lista2, JTextArea areaDeTexto1){
		this.listax=lista2;
		this.textAreacambio1=areaDeTexto1;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		listax.clear();
		alumno1 = new Alumno("Gonzalo", "Villalobos", 24, 4.3);
		alumno2 = new Alumno("Sebastian", "Urrutia", 24, 5.0);
		alumno3 = new Alumno("Norton", "Irarrazabal", 22, 4.8);
		alumno4 = new Alumno("Angelo", "Perez", 27, 5.2);
		alumno5 = new Alumno("Juan Pablo", "Valdivia", 24, 6.0);
		listax.add(alumno1); listax.add(alumno2); listax.add(alumno3); listax.add(alumno4); listax.add(alumno5);
		
		textAreacambio1.setText(null);
		
		for(int ite=0;ite<listax.size();ite++) {
			textAreacambio1.append(	(listax.get(ite)).toString()+"\n");
		}
	}
}
