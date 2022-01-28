import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/* zad.1
		a) stworzyć tablicę 6-cio elementową, uzupełnić przykładowymi wartościami (dowolny typ tablicy),
		b) wprowadzić z klawiatury numer indexu tablicy który chcemy wyświetlić, użyć metody next() --> scan.next();
		c) zabezpieczyć kod przed wprowadzeniem:
				 - za dużej liczby (index > tab.length),
				 - wprowadzeniem innego znaku niż liczba,
		d) użyć metody finally aby wyświetlić komunikat zakończenia programu
		e) wprowadzanie indeksu niech będzie zapętlone do momentu wprowadzenia poprawnego indeksu

		PODPOWIEDZI:
		scan.next() - można wprowadzać dowolny znak z klawiatury,
		index = Integer.parseInt(scan.next()); - parsowanie zmiennej do typu int (liczbowego calkowitego)

		warto stworzyć flagę np. isIndexCorrect = false, i niech pętla sie wykonuje, dopuki flaga jest false,
		boolean isIndexCorrect
		white(!isIndexCorrect) {}
		*/
		/* zad.2
		a) stworzyć dowolny przykład z NullPonterException,
		b) stworzyć dowolny przykład z ArithmeticException ,
		c) stworzyć dowolny przykład z 2 lub 3 blokami catch i z blokiem finally,
		 */
		System.out.println("Zad1");
		int[] tab = {1, 2, 3, 4, 5, 6};
		Scanner scan = new Scanner(System.in);
		boolean isIndexCorrect = false;
		int index = -1;
		System.out.println("Podaj indeks:");
		while (!isIndexCorrect) {
			try {
				index = Integer.parseInt(scan.next());
				System.out.println("Wybrane liczba to: " + tab[index]);
				isIndexCorrect = true;
			} catch(NumberFormatException e) {
				System.err.println("Proszę wprowadzić poprawną liczbę");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.err.println("Liczba poza zakresem (0-5)");
			} finally {
				if (!isIndexCorrect) {
					System.out.println("Spróbuj ponownie:");
				} else {
					System.out.println("Koniec zadania 1");
				}
			}
		}

		System.out.println("\nZad2");
		// A)
		Zad2 objA = null;
		try {
			objA.getTest();
		} catch (NullPointerException e) {
			System.out.println("\na) Próbujemy wywołać metodę na wartości null\n" + e.getMessage());
		}
		// B)
		try {
			int x = 123 / 0;
		} catch (ArithmeticException e) {
			System.out.println("\nb) Próbujemy podzielić przez 0\n" + e.getMessage());
		}
		// C)
		try {
			System.out.println("\nc) Podaj liczbę przez którą chcesz podzielić 18:");
			int cy = Integer.parseInt(scan.next());
			System.out.println(18 / cy);
		} catch (ArithmeticException e) {
			System.err.println("Nie dziel przez 0!!!");
		} catch (NumberFormatException e) {
			System.err.println("Podano niepoprawną liczbę!!!");
		} catch (Exception e) {
			System.err.println("Wystąpił nieznany błąd:\n" + e.getMessage());
		} finally {
			System.out.println("\nKoniec zadania");
		}
	}
}

class Zad2 {
	private int test;

	public int getTest() {
		return test;
	}
}