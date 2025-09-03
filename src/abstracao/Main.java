package abstracao;

import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
         
		//Servivo bacteria = new SerVivo();
		
		SerVivo dogao = new Cachorro();
		
	    SerVivo bili = new Humano();
	    
	    dogao.setCor(Cores.VERDE);
	    
	    
	    for (Cores cor : Cores.values()) {
	    	  System.out.println(cor + "  " + cor.getI());
	    	
	    }
	    
	    //List<SerVivo> list = new ArrayList<>();
	   // list.add(new Humano());
	    //list.add(new Cachorro());
	    
	    //for (SerVivo serVivo : list) {
			
		
	}

}
