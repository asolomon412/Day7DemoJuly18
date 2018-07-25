import java.util.Arrays;

/*
 * Given an array of ints length 3, 
 * figure out which is larger, 
 * the first or last element in the array, 
 * and set all the other elements to be that value. 
 * Return the changed array.
 */
public class CodeChallengeDay7 {

	public static void main(String[] args) {
		int[] arr = {98,43,22};
		
		int[] max = maxEnd3(arr);
		System.out.println(Arrays.toString(max));
		
		for (int i = 0; i < max.length; i++) {
			System.out.println(max[i]);
		}
		
		// enhanced for loop
		System.out.println("Enhanced for loop ex: ");
		for(int n : maxEnd3(arr)) { // could also refernce the variable max on the right hand side of the : 
			System.out.println(n);
		}

	}

	// your method should start here, 
	// and should be returning an int[]
	// solution Day7
	public static int[] maxEnd3(int[] nums) {
		  int temp = 0;
		  if (nums[0] > nums[nums.length-1]) {
		    temp = nums[0];
		  } else {
		    temp = nums[nums.length-1];
		  }    
		  //nums[1] = temp;
		  //nums[2] = temp;
		  Arrays.fill(nums, temp); //also valid solution
		  return nums;
		}
	
}

