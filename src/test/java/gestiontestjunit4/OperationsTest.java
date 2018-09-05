package gestiontestjunit4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class OperationsTest {
	static Operations op;
	
	
	@Before
	public void init(){
		
//		op = new Operations();
		 System.out.println("Méthode à lancer avant chaque test.");
	}
	
	@After
	public void testAfter(){
		System.out.println("Méthode à lancer aprés chaque test.");
	}
	
	@AfterClass
	public static void testAfterClass(){
		System.out.println("Méthode à lancer aprés le test.");
	}
	
	@BeforeClass
	public static void creerInstance(){
		System.out.println("Méthode à lancer avant l'execution des tests.");
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
