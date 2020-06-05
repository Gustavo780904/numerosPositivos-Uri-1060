import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int soma, i = 0;
		double valores = 0;

		for (soma = 0; i < 6; i++) {
			valores = sc.nextDouble();

			if (valores > 0) {
				soma = soma + 1;
			}
		}
		System.out.println(soma + " valores positivos");
		sc.close();

	}

}
