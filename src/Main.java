import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci un numero ");
		int n = input.nextInt();
		int r = calcoloFattoriale(n);
		System.out.println("Il fattoriale di " + n + " è " + r);
	}

	private static int calcoloFattoriale(int n) {
		if(n == 0) {
			return 1;
		} else {
			return n * calcoloFattoriale(n - 1);
		}
	}
}
