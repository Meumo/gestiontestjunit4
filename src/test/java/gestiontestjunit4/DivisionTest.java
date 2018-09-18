package gestiontestjunit4;

import static org.junit.Assert.*;

import java.util.logging.Logger;

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
		logger = null;
		logger.log(null, "La m�thode sera lanc� avant le test.");
		
	}
	@AfterClass
	public static void ApresTest(){
		System.out.println("La m�thode sera lanc� apres le test.");
	}
	@Before
	public void avantChaqTest(){
		logger.log(null,"La m�thode sera lanc� avant chaque test.");
	}
	
	@After
	public void apresChaqTest(){
		logger.log(null,"La m�thode sera lanc� apres chaque test.");
	}
	
	long resultat;
	private static Logger logger;
	@Test
	public void testDivision() {
		resultat = div.division(8,2);
		assertEquals(resultat, 8/2);
	}

}
