package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class numerosMultiplos03 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a % b == 0 || b % a == 0) {
			System.out.println("Sãp Multiplos");
		} else {
			System.out.println("Não são Multiplos");
		}
		sc.close();
	
	
	}
}
