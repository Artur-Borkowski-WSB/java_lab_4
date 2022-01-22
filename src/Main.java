public class Main {
	public static void main(String[] args) {

    /* zad.1
    a) Stwożyć interfejs Budynek,
    b) interfejs powinien mieć metody:
        - double powierzchnia(double pow);
        - String adresBudynku(String adres);
        - int liczbaOkien(int value);
        - void liczbaMieszkancow(int value);
        - void kolorDomu(KolorEnum kolor);
    c) stworzyć enum KolorEnum z przykładowymi kolorami,
    d) stworzyć jedną metodę z 2 parametrami wymyśloną przez siebie,
    */

    /* zad.2
    a) napisać klasę Dom implementującą interfejs Budynek,
    b) zaimplementować wszystkie metody,
    c) stworzyć brakujące pola(prywatne), gettery i settery, napisać metodę toString
    (gettery i settery najlepiej wygenerować: Code/Prawy myszy --> Generate --> getters/setters/toString)
    d) stworzyć jedną dowolną metodę przez siebie
    */

    /* zad.3
    a) w klasie Main stworzyć 2 objekty typu Dom deklarując pierwszy objekt Typem Dom,
    drugi objekt typem Budynek,
    b) wykorzystać wszystkie metody do implementacji pól
    c) wyświetlić w konsoli metodę toString (na obu objektach) opisującą zachowanie klasy Dom
    */

		Dom obj1 = new Dom();
		Budynek obj2 = new Dom();

		obj1.powierzchnia(123.45);
		obj1.adresBudynku("Gdzieś, ul. Jakaś 12/34");
		obj1.liczbaOkien(10);
		obj1.liczbaMieszkancow(3);
		obj1.kolorDomu(KolorEnum.CZERWONY);
		System.out.println("Koszt domu to " + obj1.koszt(2000, 120) + "zł");
		System.out.println("Średni miesięczny koszt prądu to " + obj1.avgCenaPradu() + "zł");

		obj2.powierzchnia(200);
		obj2.adresBudynku("Lorem, ul. Ipsum 321");
		obj2.liczbaOkien(15);
		obj2.liczbaMieszkancow(4);
		obj2.kolorDomu(KolorEnum.ZIELONY);

		System.out.println(obj1);
		System.out.println(obj2);
	}
}
