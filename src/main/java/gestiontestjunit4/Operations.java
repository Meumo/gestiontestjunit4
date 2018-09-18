package gestiontestjunit4;

import java.lang.System.Logger;

public class Operations {
	
	
	
	private Logger logger;



	public long addition(long...nombre){
		logger = null;
		//System.out.println("test sonar");
		logger.log(null, "Test Sonar");
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
