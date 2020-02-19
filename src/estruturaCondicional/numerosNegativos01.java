package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class numerosNegativos01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		
		if (n1 < 0 ) {
			System.out.println("NEGATIVO");
		}else {
			System.out.println("NÃO NEGATIVO");
		}
		
		
		
		
		sc.close();
		
		
	}

}
