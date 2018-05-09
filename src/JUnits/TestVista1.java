package JUnits;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import org.junit.Before;
import org.junit.Test;

import Vista.Vista1;


public class TestVista1 {
	//parametros y clases
	Vista1 Vista;
		
	@Before	
	public void before(){
		//inicializar parametros y clases
	    Vista = new Vista1();
	}
	
	@Test
	public void test() {
//		LookAndFeelInfo info[] = UIManager.getInstalledLookAndFeels();
//		for(LookAndFeelInfo look: info)
//		    System.out.println(look.getClassName());
		
//		UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
		
		Vista.setVisible(true);
		try{
			Thread.sleep(900000);
		}catch(Exception e){}	
	}
}
/*----------------------------------------------------------------------------------------------------------------------------------*/