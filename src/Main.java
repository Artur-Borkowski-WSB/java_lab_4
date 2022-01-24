public class Main {
	public static void main(String[] args) {

    /* zad.1
    a) napisać interfejs CzlowiekI
    b) zadeklarować 2 metody

    c) napisać interfejs StudentI który dziedziczy po interfejsie CzlowiekI
    d) zadeklarować 3 metody

    e) napisać interfejs PracownikI który dziedziczy po interfejsie CzlowiekI
    f) zadeklarować 3 metody
    */

    /* zad.2
    a) napisać klasę Student która będzie implementować interfejs StudentI
    b) napisać klasę Pracownik która będzie implementować interfejs PracownikI
    c) stworzyć pola, gettery i settery, metodę toString dla obu klas, (constructor z przeciążeniem - jak ktoś chce ),
    (gettery i settery / toString() ..., najlepiej wygenerować: Code/Prawy myszy-->Generate-->getters/setters/toString)
    */

    /* zad.3
    a) stworzyć 2 objekty typu Student i uzupełnić wszystkie pola
    b) stworzyć 2 objekty typu Pracownik i uzupełnić wszystkie pola
    c) wypisać metody toString() wszystkich objektów

    zad.4 - Dla chętnych
    a) stworzyć klasę Kierownik która będzie implementować interfejs PracownikI,
    b) zaimplementować wszystkie metody, i stworzyć pola
    c) stworzyć 2 objekty typu Kierownik i uzupełnić wszystkie pola,
    d) stworzyć listę typu PracownikI --> List<PracownikI> listaPracownikow = new ArrayList<>();
    e) dodać do niej objekty typu Kierownik i Pracownik
    f) wypisać pętlą metody toString() wszystkich elementów listy
    */

    /* zad5 - Dla chętnych
    Stworzyć klasę która będzie implementować 2 lub 3 interfejsy następnie będzie
    dziedziczona przez inną klasę
    */

		// Rozumiem, że zadania dla chętnych nie liczą się do oceny?
		Student s1, s2;
		System.out.println("\nStudent 1");
		s1 = new Student();
		s1.setKierunek("Informatyka");
		s1.setSemestr(3);
		s1.setNumerAlbumu("12345");
		s1.setStanKonta(520);
		s1.oplacCzesne(510);
		s1.uczSie(12);
		s1.napiszSprawozdanie("programowanie języku Java");
		s1.jedz();
		s1.spij();
		System.out.println(s1);

		System.out.println("\nStudent 2");
		s2 = new Student();
		s2.setKierunek("Zarządzanie");
		s2.setSemestr(2);
		s2.setNumerAlbumu("54321");
		s2.setStanKonta(400);
		System.out.println(s2);

		Pracownik p1, p2;
		System.out.println("\nPracownik 1");
		p1 = new Pracownik();
		p1.setStanowisko("Programista");
		p1.setIloscKaw(8);
		System.out.println(p1);

		System.out.println("\nPracownik 2");
		p2 = new Pracownik();
		p2.setStanowisko("Programista");
		p2.setIloscKaw(11);
		p2.pracuj(2);
		p2.napiszProgram();
		p2.zrobPrzerwe(15);
		p2.jedz();
		p2.spij();
		System.out.println(p2);
	}
}
