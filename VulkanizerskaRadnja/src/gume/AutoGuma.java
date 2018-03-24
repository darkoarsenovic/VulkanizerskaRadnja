package gume;

/**
 * Klasa koja predstavlja auto gumu i njene karakteristike
 * 
 * @author Darko Arsenovic daekoars@yahoo.com
 * @version 1.0
 *
 */
public class AutoGuma {

	/**
	 * Marka i model gume
	 */
	private String markaModel = null;

	/**
	 * Precnik gume
	 */
	private int precnik = 0;

	/**
	 * Sirina gume
	 */
	private int sirina = 0;

	/**
	 * Visina gume
	 */
	private int visina = 0;

	/**
	 * Vraca vrednost atributa markaModel
	 * 
	 * @return marka i model kao String
	 */
	public String getMarkaModel() {
		return markaModel;
	}

	/**
	 * Postavlja novu vrednost za atribut markaModel
	 * 
	 * @param markaModel
	 *            nova vrednost za marku i model
	 * @throws java.lang.RuntimeException
	 *             ako je za marku i model unet null ili String kraci od 3 karaktera
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel == null || markaModel.length() < 3)
			throw new RuntimeException("Morate uneti marku i model");
		this.markaModel = markaModel;
	}

	/**
	 * Vraca vrednost atributa precnik
	 * 
	 * @return precnik kao integer
	 */
	public int getPrecnik() {
		return precnik;
	}

	/**
	 * Postavlja novu vrednost za atribut precnik
	 * 
	 * @param precnik
	 *            nova vrednost za precnik
	 * @throws java.lang.RuntimeException
	 *             ako je parametar precnik manji od 13 ili veci od 22
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 && precnik > 22)
			throw new RuntimeException("Precnik van opsega");
		this.precnik = precnik;
	}

	/**
	 * Vraca vrednost atributa sirina
	 * 
	 * @return sirina kao integer
	 */
	public int getSirina() {
		return sirina;
	}

	/**
	 * Postavlja novu vrednost za atribut sirina
	 * 
	 * @param sirina
	 *            nova vrednost za sirinu
	 * @throws java.lang.RuntimeException
	 *             ako je parametar sirina manja od 135 ili veca od 355
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 && sirina > 355)
			throw new RuntimeException("Sirina van opsega");
		this.sirina = sirina;
	}

	/**
	 * Vraca vrednost atributa visina
	 * 
	 * @return visina kao integer
	 */
	public int getVisina() {
		return visina;
	}

	/**
	 * Postavlja novu vrednost za atribut visina
	 * 
	 * @param visina
	 *            nova vrednost za visinu
	 * @throws java.lang.RuntimeException
	 *             ako je parametar visina manji od 25 ili veci od 95
	 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new RuntimeException("Visina van opsega");
		this.visina = visina;
	}

	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
				+ visina + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
				return false;
		} else if (!markaModel.equals(other.markaModel))
			return false;
		if (precnik != other.precnik)
			return false;
		if (sirina != other.sirina)
			return false;
		if (visina != other.visina)
			return false;
		return true;
	}
}
