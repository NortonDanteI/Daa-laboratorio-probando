package Vista;


import java.awt.Color;
import java.awt.Container;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

import Controlador.ClickEnArraysSort;
import Controlador.ClickEnCollectionsSort;
import Controlador.ClickEnInsertionSort;
import Modelo.Alumno;

@SuppressWarnings("serial")
public class Vista1 extends JFrame{
	//inicializar componentes
	JButton boton1 = new JButton("Generar numeros ordenados");
	JButton boton2 = new JButton("Generar numeros aleatorios");
	JButton boton3 = new JButton("Aplicar algoritmo");
	JButton boton4 = new JButton("Ordenar Por Apellido");
	JButton boton5 = new JButton("Ordenar Por Nombre");
	JButton boton6 = new JButton("Ordenar Por Notas");
	JButton boton7 = new JButton("Ordenar Por Edad");
	
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	
	JMenuBar menuBar = new JMenuBar();
	
	JMenu menu1 = new JMenu("Algoritmos de ordenamiento");
	JMenu menu2 = new JMenu("Métodos de ordenamiento");
	
	JMenuItem item1 = new JMenuItem("Insertion Sort");
	JMenuItem item2 = new JMenuItem("Merge Sort");
	JMenuItem item3 = new JMenuItem("Quick Sort");
	JMenuItem item4 = new JMenuItem("Arrays.Sort");
	JMenuItem item5 = new JMenuItem("Collections.Sort");
	
	JLabel label1 = new JLabel("Estado del algoritmo");
	JLabel label2 = new JLabel("Arreglo");
	
	JScrollPane scrollPane = new JScrollPane();
	JScrollPane scrollPane1 = new JScrollPane();
	
	JTextArea AreaDeTexto = new JTextArea();
	JTextArea AreaDeTexto1 = new JTextArea();
	 
	int[] numerosx1 = new int[21];
	
	ArrayList<Integer> L= new ArrayList<>();
	ArrayList<Alumno> listax = new ArrayList<>();
	
	public Vista1() {
		Container contenedor= getContentPane();
		setResizable(false);
		setTitle("Algoritmos y métodos de ordenamiento");
		contenedor.setBackground(Color.WHITE);
		contenedor.setLayout(null);

		//x,y
		setSize(840,620);
		setLocation(230, 70);
		
		panel1.setLayout(null);												panel3.setLayout(null);
		panel1.setBounds(8, 5, 440, 381);									panel3.setBounds(454, 5, 372, 381);
		panel1.setBackground(Color.WHITE);									panel3.setBackground(Color.WHITE);
		panel1.setBorder(new LineBorder(new Color(0, 0, 0),2,true));  		panel3.setBorder(new LineBorder(new Color(0, 0, 0),2,true));
		
											panel2.setLayout(null);
											panel2.setBounds(8, 393, 818, 166);
											panel2.setBackground(Color.WHITE);
											panel2.setBorder(new LineBorder(new Color(0, 0, 0),2,true));
		
		setJMenuBar(menuBar);

		menu1.add(item1);
		menu1.add(item2);
		menu1.add(item3);
		
		menu2.add(item4);
		menu2.add(item5);
		
		menuBar.add(menu1);
		menuBar.add(menu2);

		boton4.setBounds(240,75,180,40);
	 	boton5.setBounds(436,20,180,40);
	 	boton6.setBounds(436,75,180,40);
	 	boton7.setBounds(630,20,170,40);
	 	
	 	panel2.add(boton4);
	 	panel2.add(boton5);
	 	panel2.add(boton6);
	 	panel2.add(boton7);
	
        menu1.add(item1);  
        menu1.add(item2);
        
        label1.setBounds(5, 5, 140, 20);
        panel3.add(label1);
        
        label2.setBounds(5,5, 140, 20);
        panel1.add(label2);
        
        boton1.setBounds(20,20,200,40);
       
        boton2.setBounds(20, 75,200,40);
        boton3.setBounds(240,20,180,40);

        panel2.add(boton1);
        panel2.add(boton2);
        panel2.add(boton3);
        
        item1.addActionListener(new ClickEnInsertionSort(AreaDeTexto1,AreaDeTexto,L,listax,boton1,boton2,boton3,boton4,boton5,boton6,boton7));
//      item2.addActionListener(this);
 //     item3.addActionListener(this); 
        item4.addActionListener(new ClickEnArraysSort     (numerosx1,AreaDeTexto1,AreaDeTexto,boton1,boton2,boton3,boton4,boton5,boton6,boton7));
        item5.addActionListener(new ClickEnCollectionsSort(listax,AreaDeTexto1,AreaDeTexto,boton1,boton2,boton3,boton4,boton5,boton6,boton7));
        
        scrollPane1.setBounds(10, 30, 422,340);
		scrollPane1.setViewportView(AreaDeTexto1);
        AreaDeTexto1.setEditable(false);
        panel1.add(scrollPane1);
        
		scrollPane.setBounds(10, 30, 352, 340);
		scrollPane.setViewportView(AreaDeTexto);
		AreaDeTexto.setEditable(false);
		panel3.add(scrollPane);
		
        contenedor.add(panel1);
		contenedor.add(panel2);
		contenedor.add(panel3);
	}
}

