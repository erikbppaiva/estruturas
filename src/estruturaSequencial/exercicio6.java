package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {

		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A,B,C,PI;
		
		A=sc.nextDouble();
		B=sc.nextDouble();
		C=sc.nextDouble();
		PI=Math.PI;		
		
		double triangulo = A * C / 2;
		double circulo = Math.PI * Math.pow(C, 2);
		double trapesio = ((A+B)*C)/2;
		double quadrado = Math.pow(B, 2);
		double retangulo = A * B;		
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPESIO: %.3f%n", trapesio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n" , retangulo);
		
		
		sc.close();
	}

}
