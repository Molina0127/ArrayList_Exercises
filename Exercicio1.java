package exercicios;

public class Exercicio1 {

	public static void main(String[]args) {
		
		Integer[] vetor = new Integer[9];
	    Integer a = 0;
	    
	    System.out.println("\nValores dos índices\n");
	    
	    for(a = 0; a < 9; a++) {
	    	vetor[a] = a;
	    	System.out.print("|"+vetor[a]+"|");
	    }
	    
	    System.out.println();
	    
	    System.out.println("\nValores dos índices multiplicados por três\n");
	    
	    for(a = 0; a < 9; a++) {
	    	vetor[a] = a * 3;
	    	System.out.print("|"+vetor[a]+"|");
	    }

	}
}
