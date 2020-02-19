package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio1Casting {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*Exemplo do youtube
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		
		System.out.printf("Area = %.2f%n", metroQuadrado);
		System.out.printf("Preço = %.2f%n", preco);
		
		
		
		
		
		
		*/
		
		//
		int a = sc.nextInt();
		int b = sc.nextInt();
		double soma =(double) a + b;
		
		System.out.println("A soma de "+ a + " + "+ b + " é "+ soma);
		
		sc.close();
		
	}

}
