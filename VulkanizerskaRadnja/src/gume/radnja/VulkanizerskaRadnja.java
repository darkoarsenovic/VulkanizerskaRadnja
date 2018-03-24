package gume.radnja;

import java.util.LinkedList;

import gume.AutoGuma;

/**
 * Klasa koja predstavlja vulkanizersku radnju
 * 
 * @author Darko Arsenovic daekoars@yahoo.com
 * @version 1.1
 *
 */
public class VulkanizerskaRadnja {

	/**
	 * Lista koja sadrzi gume
	 */
	private LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();

	/**
	 * Dodaje novu gumu u listu
	 * 
	 * @param a
	 *            nova guma koja se dodaje u listu
	 * @throws java.lang.RuntimeException
	 *             kada je uneta guma null ili guma vec postoji u listi
	 */
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		gume.add(a); //addFirst zamenjan sa add
	}

	/**
	 * Pronalazi gume odredjene marke i modela i vraca listu koja sadrzi te gume
	 * 
	 * @param markaModel
	 *            trazena marka i model gume
	 * @return gume odredjene marke i dodela kao LinkedList
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		for (int i = 0; i < gume.size(); i++)
			if (gume.get(i).getMarkaModel().equals(markaModel)) // dodato .getMarkaModel()
				novaLista.add(gume.get(i));
		return novaLista;
	}
}
