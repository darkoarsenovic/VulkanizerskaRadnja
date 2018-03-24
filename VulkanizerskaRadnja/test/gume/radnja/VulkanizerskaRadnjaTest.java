package gume.radnja;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import gume.AutoGuma;

public class VulkanizerskaRadnjaTest {

	private VulkanizerskaRadnja r;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		r = new VulkanizerskaRadnja();
	}

	@After
	public void tearDown() throws Exception {
		r = null;
	}

	// testiranje za dodajGumu
	@Test
	public void testDodajGumu() {
		AutoGuma a = new AutoGuma();
		a.setMarkaModel("Tigar Wintera");
		a.setPrecnik(16);
		a.setSirina(150);
		a.setVisina(55);

		r.dodajGumu(a);

		assertTrue(r.pronadjiGumu(a.getMarkaModel()).contains(a));
	}

	@Test(expected = java.lang.NullPointerException.class)
	public void testDodajGumuNull() {
		r.dodajGumu(null);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testDodajGumuPostojiVecUListi() {
		AutoGuma a = new AutoGuma();
		r.dodajGumu(a);
		r.dodajGumu(a);
	}

	// testiranje za pronadjiGumu
	@Test
	public void testPronadjiGumu() {
		assertEquals(null, r.pronadjiGumu(null));
	}

	@Test
	public void testPronadjiGumuNemaNijedneGumeTrazeneMarkeIModela() {
		assertTrue(r.pronadjiGumu("").isEmpty());
	}

	@Test
	public void testPronadjiGumuJednaGuma() {
		AutoGuma a = new AutoGuma();
		a.setMarkaModel("Michelin Sprint");
		a.setPrecnik(17);
		a.setSirina(150);
		a.setVisina(65);

		LinkedList<AutoGuma> lista = new LinkedList<>();
		lista.add(a);

		r.dodajGumu(a);

		assertTrue(r.pronadjiGumu("Michelin Sprint").equals(lista));
	}

	@Test
	public void testPronadjiGumuViseGumaRazlicitihDimenzija() {
		AutoGuma a1 = new AutoGuma();
		a1.setMarkaModel("Michelin Sprint");
		a1.setPrecnik(17);
		a1.setSirina(150);
		a1.setVisina(65);

		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("Michelin Sprint");
		a2.setPrecnik(16);
		a2.setSirina(155);
		a2.setVisina(60);

		LinkedList<AutoGuma> lista = new LinkedList<>();
		lista.add(a1);
		lista.add(a2);

		r.dodajGumu(a1);
		r.dodajGumu(a2);

		assertTrue(r.pronadjiGumu("Michelin Sprint").equals(lista));
	}
}
