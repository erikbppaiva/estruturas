package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int horas = sc.nextInt();
		double salario = sc.nextDouble();
		
		double soma = (double) salario * horas;
		
		System.out.println("NUMBER "+ numero);
		System.out.printf("SALARY US$ %.2f%n", soma);
		
		sc.close();
		
		
		
	}

}
