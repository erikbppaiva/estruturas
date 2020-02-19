package String;

public class operacaoSplit {

	public static void main(String[] args) {
		
		String s = "potato apple lemon";
		
		String[] vect = s.split(" "); // Split recorta a frase e coloca dentro de um vetor
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		
	}

}
