package estruturaRepetitivas;

import java.util.Scanner;

public class exEnquanto04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int combustivel = sc.nextInt();
		
		while(combustivel != 4) {
			if(combustivel == 1) {
				alcool += 1;
				
			} else if(combustivel == 2) {
				gasolina += 1;
				
			} else if(combustivel == 3) {
				diesel += 1;
			} else {
				System.out.println("C�digo �nvalido");				
			}
			combustivel = sc.nextInt();
				
		}
		System.out.println("Muito Obirgado");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("diesel: " + diesel);
		
	}

}
