package gestiontestjunit4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DivisionTest {
	static Division div;
	
	
	@BeforeClass
	public static void avantTest(){
		div = new Division();
		System.out.println("La méthode sera lancé avant le test.");
		
	}
	@AfterClass
	public static void ApresTest(){
		System.out.println("La méthode sera lancé apres le test.");
	}
	@Before
	public void avantChaqTest(){
		System.out.println("La méthode sera lancé avant chaque test.");
	}
	
	@After
	public void apresChaqTest(){
		System.out.println("La méthode sera lancé apres chaque test.");
	}
	
	long resultat;
	@Test
	public void testDivision() {
		resultat = div.division(8,2);
		assertEquals(resultat, 8/2);
	}

}
