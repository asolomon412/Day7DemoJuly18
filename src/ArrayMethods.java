import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {

		// parallel arrays allow us to maintain an associated list
		// of different types
		// should have the same length, and reference the same index locations
		String[] names = { "Alex", "Brandon", "Michelle" };
		int[] jerseyNums = { 22, 81, 1 };

		for (int i = 0; i < names.length; i++) {
			System.out.println("Name: " + names[i] + " Jersey #: " + jerseyNums[i]);
		}

		int[] arr = { 6, 54, 3, 22, 1 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		Arrays.fill(arr, 100); // fills entire array with same result
		System.out.println(Arrays.toString(arr));

		Arrays.fill(arr, 1, 3, 202); // fills index between a range last index reference is not inclusive
		System.out.println(Arrays.toString(arr));

		int[] arr3 = { 6, 54, 3, 22, 1 };
		int[] arr2 = { 6, 54, 3, 22, 1 };

		System.out.println(Arrays.equals(arr, arr2));// will return false because we made modifications to arr
		System.out.println(Arrays.equals(arr3, arr2)); // will return true

		int[] arr4 = { 3, 4, 5, 6 };
		int[] arr5 = arr4; // don't do this -- this is bad! will change the original value as well
		
		System.out.println("Array 4: " + Arrays.toString(arr4));
		System.out.println("Array 5: " + Arrays.toString(arr5));
		arr5[2] = 160;
		System.out.println("Array 4: " + Arrays.toString(arr4));
		System.out.println("Array 5: " + Arrays.toString(arr5));
		
		System.out.println();
		// to overcome reference pointer/copy issues we will use methods
		int[] arr6 = Arrays.copyOf(arr4, 10); 
		System.out.println("Array 4: " + Arrays.toString(arr4));
		System.out.println("Array 6: " + Arrays.toString(arr6));
		arr6[2] = 147;
		System.out.println("Array 4: " + Arrays.toString(arr4));
		System.out.println("Array 6: " + Arrays.toString(arr6));
		
	}

}
