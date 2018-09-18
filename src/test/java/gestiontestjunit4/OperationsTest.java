package gestiontestjunit4;

import java.lang.System.Logger;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class OperationsTest {
	static Operations op;
	private static Logger logger;
	
	
	@Before
	public void init(){
		
		logger = null;
		//		op = new Operations();
		logger.log(null,"Méthode à lancer avant chaque test");
	}
	
	@After
	public void testAfter(){
		logger.log(null,"Méthode à lancer aprés chaque test");
	}
	
	@AfterClass
	public static void testAfterClass(){
		logger.log(null,"Méthode à lancer aprés le test");
	}
	
	@BeforeClass
	public static void creerInstance(){
		logger.log(null,"Méthode à lancer avant l'execution des tests");
		op = new Operations();
	}
	

	@Test
	public void testAddition() {
		long resultat = op.addition(2,5,8);
		Assert.assertEquals(resultat,2+5+8);
	}

	
	@Test
	public void testMultiplication() {
		long resultat = op.multiplication(2,10,8);
		Assert.assertEquals(resultat,2*10*8);
	}
 
	
	public void testDivision(){
		
	}
	
}
