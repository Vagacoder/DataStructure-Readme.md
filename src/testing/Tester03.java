package testing;

public class Tester03 {

	//Test clone() on 2 dimensional array
	
	public static void main(String[] args) {
		int[][] int1 = {{1,2},{3,4}};
		int[][] int2 = int1.clone();
		System.out.println(int1);
		for (int i = 0; i<int1.length; i++) {
			int[] row = int1[i];
			for (int j = 0; j < row.length; j++) {
				System.out.println(row[j]);	
			}
			
		}
		
		System.out.println(int2);
		for (int i = 0; i<int2.length; i++) {
			int[] row = int2[i];
			for (int j = 0; j < row.length; j++) {
				System.out.println(row[j]);	
			}
			
		}
		
		int[] temp = {8,9};
		int2[1]= temp;
		System.out.println(int1);
		System.out.println();
		for (int i = 0; i<int1.length; i++) {
			int[] row = int1[i];
			for (int j = 0; j < row.length; j++) {
				System.out.println(row[j]);	
			}
			
		}
		
		System.out.println(int2);
		for (int i = 0; i<int2.length; i++) {
			int[] row = int2[i];
			for (int j = 0; j < row.length; j++) {
				System.out.println(row[j]);	
			}
			
		}
	}

}
