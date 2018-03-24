package gume;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AutoGumaTest {

	private AutoGuma g;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		g = new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
		g = null;
	}

	// testovi za setMarkaModel
	@Test
	public void testSetMarkaModel() {
		g.setMarkaModel("Golf 5");

		assertEquals("Golf 5", g.getMarkaModel());
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		g.setMarkaModel(null);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelStringDuzineDva() {
		g.setMarkaModel("m2");
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelStringDuzineJedan() {
		g.setMarkaModel("a");
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelPrazanString() {
		g.setMarkaModel("");
	}

	// testovi za setPrecnik
	@Test
	public void testSetMPrecnik() {
		g.setPrecnik(17);

		assertEquals(17, g.getPrecnik());
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPrecnikManjiOdOpsega() {
		g.setPrecnik(10);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPrecnikVeciOdOpsega() {
		g.setPrecnik(25);
	}

	// testovi za setSirina
	@Test
	public void testSetSirina() {
		g.setSirina(200);

		assertEquals(200, g.getSirina());
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetSirinaManjaOdOpsega() {
		g.setSirina(110);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetSirinaVecaOdOpsega() {
		g.setSirina(370);
	}

	// testovi za setVisina
	@Test
	public void testSetVisina() {
		g.setVisina(62);

		assertEquals(62, g.getVisina());
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetVisinaManjaOdOpsega() {
		g.setSirina(14);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetVisinaVecaOdOpsega() {
		g.setSirina(111);
	}
	
	// test za toString
	@Test
	public void testToString() {
		g.setMarkaModel("Opel Astra");
		g.setPrecnik(16);
		g.setSirina(195);
		g.setVisina(65);
		
		assertEquals("AutoGuma [markaModel=Opel Astra, precnik=16, sirina=195, visina=65]", g.toString());
	}
	
	// testovi za equals
	@Test
	public void testEqualsObjectTrue() {
		g.setMarkaModel("Opel Astra");
		g.setPrecnik(16);
		g.setSirina(195);
		g.setVisina(65);
		
		AutoGuma g2 = new AutoGuma();
		g2.setMarkaModel("Opel Astra");
		g2.setPrecnik(16);
		g2.setSirina(195);
		g2.setVisina(65);
		
		assertTrue(g.equals(g2));
	}
	
	@Test
	public void testEqualsObjectFalse() {
		g.setMarkaModel("Opel Corsa");
		g.setPrecnik(17);
		g.setSirina(185);
		g.setVisina(55);
		
		AutoGuma g2 = new AutoGuma();
		g2.setMarkaModel("Opel Astra");
		g2.setPrecnik(16);
		g2.setSirina(195);
		g2.setVisina(65);
		
		assertFalse(g.equals(g2));
	}
}
