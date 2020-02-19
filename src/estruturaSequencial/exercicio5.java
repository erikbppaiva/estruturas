package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod = sc.nextInt();
		int quant = sc.nextInt();
		double valor = sc.nextDouble();
		double tot1 = (double) quant * valor;
		
		
		int cod2 = sc.nextInt();
		int quant2 = sc.nextInt();
		double valor2 = sc.nextDouble();
		double tot2 = (double) quant2 * valor2;
		
		double vtotal = (double) (tot1 + tot2);
		System.out.printf("Valor a Pagar = %.2f%n", vtotal);
		
		
		
		
		sc.close();
	}

}
