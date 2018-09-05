package gestiontestjunit4;

public class Operations {
	
	
	
	public long addition(long...nombre){
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
