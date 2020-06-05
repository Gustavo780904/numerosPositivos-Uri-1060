package numerosPositivos1060;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double valor;
		int valoresPositivos = 0, quantidadeValores = 0;
		while (quantidadeValores != 6) {
			valor = sc.nextDouble();
			if (valor == 0.0) {
				quantidadeValores = quantidadeValores + 0;				
			}else if(valor > 0.0) {
				quantidadeValores = quantidadeValores + 1;
				valoresPositivos = valoresPositivos + 1;
			}else {
				quantidadeValores = quantidadeValores + 1;
			}
		}
		System.out.println(valoresPositivos + " valores positivos");

		sc.close();

	}

}
