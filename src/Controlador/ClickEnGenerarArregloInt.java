package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JTextArea;

public class ClickEnGenerarArregloInt implements ActionListener {

	JTextArea areaDeTextox1;
	ArrayList<Integer> lx1;
	ArrayList<Integer> aux= new ArrayList<>();
	
	public ClickEnGenerarArregloInt(JTextArea areaDeTexto1, ArrayList<Integer> lx){
		this.areaDeTextox1=areaDeTexto1;
		this.lx1=lx;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {	
		int j = 0;
		lx1.clear();
		aux.clear();
		
		for(int i = 0;i < 21;i++) {
			do{
				j = new SecureRandom().nextInt(100)+1;
			}while(aux.contains(j));
			aux.add(j);
			lx1.add(j);
		}	
		
		areaDeTextox1.setText(null);
		areaDeTextox1.setText(Arrays.toString(lx1.toArray()));
	}

}
