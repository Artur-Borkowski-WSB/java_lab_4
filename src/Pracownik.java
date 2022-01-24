public class Pracownik implements PracownikI {
	private int iloscKaw;
	private String stanowisko;

	@Override
	public void pracuj(int godzin) {
		System.out.println("Pracujesz " + godzin + "h");
		if (godzin > 1) {
			System.out.println("Czas na przerwę");
			this.zrobPrzerwe(30);
		}
	}

	@Override
	public void zrobPrzerwe(int minut) {
		System.out.println(minut + " min przerwy");
		this.jedz();
	}

	@Override
	public void napiszProgram() {
		System.out.println("printf(\"Hello world!\");");
	}

	@Override
	public void jedz() {
		System.out.println("Wypijasz kawę");
		this.iloscKaw++;
	}

	@Override
	public void spij() {
		System.out.println("Nie ma czasu na sen!!!");
		this.jedz();
	}

	public int getIloscKaw() {
		return iloscKaw;
	}

	public void setIloscKaw(int iloscKaw) {
		this.iloscKaw = iloscKaw;
	}

	public String getStanowisko() {
		return stanowisko;
	}

	public void setStanowisko(String stanowisko) {
		this.stanowisko = stanowisko;
	}

	@Override
	public String toString() {
		return "Pracownik " +
			"na stanowisku " + stanowisko +
			", wypił już " + iloscKaw + " kubków kawy";
	}
}
