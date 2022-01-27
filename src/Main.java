public class Main {

	public static void main(String[] args) {

		/* zad.1
		a) stworzyć klasę abstrakcyjną Figura
		b) stworzyć metody abstrakcyjne pole() i obwod()
		c) stworzyć zwykłą metodę nazwaFigury(String figura), która będzie zwracała tekst 'To jest figura: .....',
		*/

		/* zad.2
		a) stworzyć klasę kwadrat i prostokat które będą dziedziczyć po klasie Figura
		b) zaimplementować metody abstrakcyjne odpowiednimi wzorami,
		c) stworzyć objekty tych klas i wyświetlić przykładowe wyliczenia
		*/

		Prostokat pr = new Prostokat(10, 5);
		System.out.println(pr.pole());
		System.out.println(pr.obwod());
		System.out.println(pr.nazwaFigury("Prostokąt"));

		Kwadrat kw = new Kwadrat(5);
		System.out.println(kw.pole());
		System.out.println(kw.obwod());
		System.out.println(kw.nazwaFigury("Kwadrat"));
	}
}
