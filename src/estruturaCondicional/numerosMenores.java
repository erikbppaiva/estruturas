package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class numerosMenores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int menor= 0;
		
		
		if(a < b && a < c) {
			menor = a;
		}else if (b < c) {
			menor = b;
		}else
			menor = c;
		
		
		
		System.out.println("Menor = " + menor);
		sc.close();
	}

}
