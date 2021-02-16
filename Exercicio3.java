package exercicios;

public class Exercicio3 {

	public static void main (String[]args) {
		
		Integer array2d[][] = new Integer[100][100];
		Integer a, b = 0;
		
		for(a = 0; a < 100; a++) {
			for(b = 0; b < 100; b++) {
				array2d[a][b] = (a * 0)-(b * 0);
				}
			}
		
		
		for(a = 0; a < 100; a++) {
			for(b = 0; b < 100; b++) {
				array2d[a][b] = (a * 7)-(b * 7);
			
			}
			
		}
		
		
		for(a = 0; a < 100; a++) {
			for(b = 0; b < 100; b++) {
			
				if((array2d[a][b] <= -100)){
					System.out.print("|"+array2d[a][b]+" |");
				}
				
				if((array2d[a][b] <= -10)&&(-99 <= array2d[a][b])){
					System.out.print("| "+array2d[a][b]+" |");
				}
				
				if((array2d[a][b] <= -1)&&(array2d[a][b] >= -9)) {
					System.out.print("|  "+array2d[a][b]+" |");
				}
				
				if((array2d[a][b] >= 0)&&(9 >= array2d[a][b])){
					System.out.print("|  "+array2d[a][b]+"  |");
				}
				
				if((array2d[a][b] >= 10)&&(99 >= array2d[a][b])){
					System.out.print("|  "+array2d[a][b]+" |");
				}
				
				if((array2d[a][b] >= 100)){
					System.out.print("| "+array2d[a][b]+" |");
				}
				
			}
			
			System.out.println();
			
		}
		

		System.out.println();
		
		for(a = 0; a < 100; a++) {
			for(b = 0; b < 100; b++) {
				array2d[a][b] = (a - b);
			
				
				if((array2d[a][b] <= -1)&&(array2d[a][b] >= -9)) {
					System.out.print("|  "+array2d[a][b]+" |");
				}
				
				if((array2d[a][b] >= 0)&&(9 >= array2d[a][b])){
					System.out.print("|  "+array2d[a][b]+"  |");
				}
				
				if((array2d[a][b] >= 10)&&(99 >= array2d[a][b])){
					System.out.print("|  "+array2d[a][b]+" |");
				}
				
				if((array2d[a][b] <= -10)&&(-99 <= array2d[a][b])){
					System.out.print("| "+array2d[a][b]+" |");
				}
			}
			System.out.println();
			
		}

		
		
		


	}
}
