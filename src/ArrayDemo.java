import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// arrays must be declared with a size
		int[] arr = new int[4]; // the values by default are 0 for indexes 0 - 3

		arr[0] = 55;

		// Arrays.toString() prints the array with a format like [ element, element, element ] by default
		System.out.println(Arrays.toString(arr));
		arr[2] = 77;
		System.out.println(arr[2]);

		// using a standard for loop to print the array of elements
		// on a new line at each iteration
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}

		String name = "John";
		String[] arr2 = { name, "Ben", "Cheo", "Camila" };
		System.out.println(arr2[0]);

		// declaring and assign a size in 2 steps
		final int SIZE = 105; // ex. of using a constant to assign the size of an array
		double[] arr3;
		arr3 = new double[SIZE];

		// declaring, assigning size, and value in 1 step
		double[] arr4 = { 4.5, 6.8, 9.9, 10.7 };

		// let a user assign the size
		System.out.println("Hey! Please enter a number: ");
		int userNum = scan.nextInt();

		// default values for boolean arrays are false
		// if not initialized to some value
		// assigning the size of the array based on user input
		boolean arr5[] = new boolean[userNum];

		System.out.println(arr5.length); // length helps us verify that the userNum was assigned as the size for the
											// array

		// enhanced for loop aka for each
		// the disadvantage to using this is that we don't have access to the index
		for (boolean temp : arr5) {
			System.out.println(temp);
		}

		int[] nums = { 6, 7, 23, 44, 8 };
		System.out.println(sumArray(nums));

		int[] testing = test();
		System.out.println(Arrays.toString(testing));
		
		// can make arrays of Objects like a Robot
		// by default if not value is added the value is null
		Robot[] robotArr = new Robot[2];
		robotArr[0] = new Robot("Grant Chirpus", 5);
		
		for (Robot r : robotArr ) {
			System.out.println(r);
		}
		
		scan.close();

	}

	// example of a method that takes in an array
	// and returns a single integer value
	public static int sumArray(int[] arr) {
		int sum = 0;
		for (int temp : arr) {
			sum += temp; // sum = sum + temp;
		}

		return sum;
	}

	// example of a method that returns an int[]
	public static int[] test() {
		int[] nums = { 1, 2, 3 };
		return nums;
	}

}
