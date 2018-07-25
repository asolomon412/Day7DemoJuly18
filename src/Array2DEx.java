
public class Array2DEx {

	public static void main(String[] args) {
		// initialize an array with 3 rows and 3 columns
		// first [] on RHS = row count (required), second [] = column count (optional)
		int[][] arr = new int[3][3];
		
		int[][] arr2 = {{3,3,3,4},
						{6,5,5,7},
						{7,8,8,9},
						{4,3,2,2}};
		
		System.out.println(arr2[2][2]);
		
		for (int i = 0; i < arr2.length; i++) { // looping through rows
			for (int j = 0; j < arr2[i].length; j++) { // looping through columns
				System.out.println(i + "," + j + " " + arr2[i][j]);
				
			}
		}
		
		
			int sum = 0;
			// enhanced for look aka for each
			for (int[] row : arr2) { // loops through rows (they are arrays)
				for (int columns : row) { // looping through columns 
					sum += columns;
				}
			}
			
			System.out.println(sum);
			
			
			// jagged array example
			int[][] arr3 = new int[3][];
			arr3[0] = new int[35]; // giving me 35 columns for my arrays at index 0
			arr3[1] = new int[2];
			arr3[2] = new int[4];
			
			arr3[0][14]= 144;
			
			System.out.println(arr3[0][14]);
			System.out.println(arr3[0][0]);
		

	}

}
