public class Dom implements Budynek {
	private double pow;
	private String adres;
	private int okna;
	private int mieszkancow;
	private KolorEnum kolor;

	// Niejasne dla mnie jest jak mają działać te metody
	// dlatego działają jak settery do tego zwracają argument
	// mimo tego gettery i settery dodałem na wszystkie pola

	@Override
	public double powierzchnia(double pow) {
		this.pow = pow;
		return pow;
	}

	@Override
	public String adresBudynku(String adres) {
		this.adres = adres;
		return adres;
	}

	@Override
	public int liczbaOkien(int value) {
		this.okna = value;
		return value;
	}

	@Override
	public void liczbaMieszkancow(int value) {
		this.mieszkancow = value;
	}

	@Override
	public void kolorDomu(KolorEnum kolor) {
		this.kolor = kolor;
	}

	@Override
	public double koszt(int rata, int miesiecy) {
		return rata * miesiecy * 1.05;
	}

	public int avgCenaPradu() {
		return this.mieszkancow * 50;
	}

	public double getPow() {
		return pow;
	}

	public void setPow(double pow) {
		this.pow = pow;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public int getOkna() {
		return okna;
	}

	public void setOkna(int okna) {
		this.okna = okna;
	}

	public int getMieszkancow() {
		return mieszkancow;
	}

	public void setMieszkancow(int mieszkancow) {
		this.mieszkancow = mieszkancow;
	}

	public KolorEnum getKolor() {
		return kolor;
	}

	public void setKolor(KolorEnum kolor) {
		this.kolor = kolor;
	}

	@Override
	public String toString() {
		return
			"Dom ma powierzchnię " + pow +
			"m^2, jego adres to: " + adres +
			". Dom ma " + okna +
			" okien i mieszkają w nim " + mieszkancow +
			" osoby. Dom ma kolor " + kolor;
	}
}
