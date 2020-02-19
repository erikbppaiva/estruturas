package estruturaSequencial;

import java.util.Scanner;

public class entadaDeDados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //adiciona o teclado como entrada
		int x;
		x = sc.nextInt();
		System.out.println("Você digitou: "+ x);
		
		
		sc.close();
		
	}

}
