package exercicios;

public class Exercicio2 {

	public static void main(String[]args) {
		
		Integer array[] = new Integer[10];
		Integer a = 0;
		Integer b = 0;
		
		for(a = 9; a >= 0; a--) {
			array[b] = a;
			System.out.print("|"+array[b]+"|");
			++b;
		}
	}
	
}
