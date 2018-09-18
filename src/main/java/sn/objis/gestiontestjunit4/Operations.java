package sn.objis.gestiontestjunit4;

import java.util.logging.Logger;

public class Operations {
	
	
	
	public long addition(long...nombre){
		//System.out.println("test sonar");
		Logger logger= Logger.getLogger("Test Sonar");

		long resultat = 0;
		for(long i : nombre)
			resultat+=i;
		return resultat;
	}
	
	
	
	public long multiplication(long ...nombre){
	long resultat = 1;
		for(long i : nombre)
			resultat*=i;
		return resultat;
	}

}
