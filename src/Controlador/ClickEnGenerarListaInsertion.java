package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextArea;
import Modelo.Alumno;

public class ClickEnGenerarListaInsertion implements ActionListener {
	JTextArea areaDeTextox1;
	ArrayList<Alumno> listaxxx1;
	Alumno alumno1, alumno2, alumno3, alumno4, alumno5;
	
	public ClickEnGenerarListaInsertion(JTextArea areaDeTexto1, ArrayList<Alumno> listax1){
		this.areaDeTextox1=areaDeTexto1;
		this.listaxxx1 = listax1;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {	
		listaxxx1.clear();
		alumno1 = new Alumno("Gonzalo", "Villalobos", 24, 4.3);
		alumno2 = new Alumno("Sebastian", "Urrutia", 24, 5.0);
		alumno3 = new Alumno("Norton", "Irarrazabal", 22, 4.8);
		alumno4 = new Alumno("Angelo", "Perez", 27, 5.2);
		alumno5 = new Alumno("Juan Pablo", "Valdivia", 24, 6.0);
		
		listaxxx1.add(alumno1); listaxxx1.add(alumno2); listaxxx1.add(alumno3); listaxxx1.add(alumno4); listaxxx1.add(alumno5);
		Object [] arreglo = listaxxx1.toArray();
	
		areaDeTextox1.setText(null);
		areaDeTextox1.append("Generando Lista\n");
		
		for(int i=0;i<listaxxx1.size();i++){
			areaDeTextox1.append(arreglo[i].toString()+"\n");
		}
	}
}
