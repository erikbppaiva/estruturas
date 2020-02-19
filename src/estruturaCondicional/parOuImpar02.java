package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class parOuImpar02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n1 = sc.nextInt();
		
		
		if(n1 % 2 == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
		}
		
		
		
		sc.close();
	}

}
