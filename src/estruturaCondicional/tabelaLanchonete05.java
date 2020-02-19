package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class tabelaLanchonete05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int cod = sc.nextInt();
		int quantidade = sc.nextInt();
		double total = 0;
		
		if (cod == 1) {
			total = quantidade * 4.00;
		}else if(cod == 2){
			total = quantidade * 4.50;
		}else if (cod == 3) {
			total = quantidade * 5.00;
		}else if (cod == 4) {
			total = quantidade * 2.00;
		}else if (cod == 5) {
			total = quantidade * 1.5;
		}else {
			System.out.println("CODIGO NÃO EXISTE");
		}
		
		System.out.printf("Total: R$ %.2f%n", total);
		
		
		
		sc.close();
		
			
	}

}
