package String;

public class funcaoString {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DFEG    ";
		
		String s01 = original.toLowerCase();// letras minusculas
		String s02 = original.toUpperCase();// letras maiuscula
		String s03 = original.trim();//*Elimina os espa�os sobrando
		String s04 = original.substring(2); // Cria novaString apartir da posi��o (2)
		String s05 = original.substring(2, 9); //Recorta da posi��o ()ate ()
		String s06 = original.replace('a', 'x'); //troca a primeira pela segunda
		String s07 = original.replace("abc","xy"); //troca a primeira pela segunda
		int i = original.indexOf("bc"); // Diz a primeira posi��o da string
		int j = original.lastIndexOf("bc"); //Diz a ultima posi��o
		
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLoweCase: -" + s01 + "-"); 
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("Substring(2): -" +s04+ "-");
		System.out.println("Substring(2, 9) -" + s05 + "-");
		System.out.println("Replace('a','x') -" + s06 + "-");
		System.out.println("Replace('abc','xy') -" + s07 + "-");
		System.out.println("IndexOf 'bc': -"+ i+ "-");
		System.out.println("lastIndexOf 'bc': -"+ j+ "-");
	}

}
