public class Student implements StudentI{
	private int stanKonta;
	private int semestr;
	private String numerAlbumu;
	private String kierunek;

	@Override
	public void uczSie(int godzin) {
		System.out.println("Uczyłeś się przez " + godzin + "h");
	}

	@Override
	public void oplacCzesne(int kwota) {
		this.stanKonta -= kwota;
	}

	@Override
	public void napiszSprawozdanie(String przedmiot) {
		System.out.println("Napisałeś sprawozdanie z " + przedmiot);
	}

	@Override
	public void jedz() {
		System.out.print("Jesz ");
		if (this.stanKonta > 20) {
			System.out.println("kebaba");
			this.stanKonta -= 20;
		} else if (this.stanKonta > 5) {
			System.out.println("parówki ugotowane w czajniku");
			this.stanKonta -= 5;
		} else {
			System.out.println("nic");
		}
	}

	@Override
	public void spij() {
		System.out.println("Nie ma czasu na sen!!!");
	}

	public int getStanKonta() {
		return stanKonta;
	}

	public void setStanKonta(int stanKonta) {
		this.stanKonta = stanKonta;
	}

	public int getSemestr() {
		return semestr;
	}

	public void setSemestr(int semestr) {
		this.semestr = semestr;
	}

	public String getNumerAlbumu() {
		return numerAlbumu;
	}

	public void setNumerAlbumu(String numerAlbumu) {
		this.numerAlbumu = numerAlbumu;
	}

	public String getKierunek() {
		return kierunek;
	}

	public void setKierunek(String kierunek) {
		this.kierunek = kierunek;
	}

	@Override
	public String toString() {
		return "Student " +
			numerAlbumu +
			", " + semestr +
			" semestr kierunku " +  kierunek +
			", ma " + stanKonta + "zł";
	}
}
