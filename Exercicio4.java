package exercicios;

public class Exercicio4 {
	
	public static void main(String[]args) {
		Integer array2d[][] = new Integer[50][100];
		Integer a, ai, b, bi;
		for(a = 49, ai = 0; a >= 0; a--, ai++){
			for(b = 99, bi = 0; b >= 0; b--, bi++) {
				array2d[ai][bi] = (a + b);
				
				if((array2d[ai][bi] >= 0)&&(9 >= array2d[ai][bi])){
					System.out.print("|  "+array2d[ai][bi]+"  |");
				}
				
				if((array2d[ai][bi] >= 10)&&(99 >= array2d[ai][bi])){
					System.out.print("|  "+array2d[ai][bi]+" |");
				}
				
				if((array2d[ai][bi] >= 100)){
					System.out.print("| "+array2d[ai][bi]+" |");
				}
				
			}
			
			System.out.println();
			
			}
		}
	}

