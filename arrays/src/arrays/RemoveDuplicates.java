package arrays;

import java.util.ArrayList;

public class RemoveDuplicates {
	
	public int removeDuplicates(int[] nums) {
		
		int k = 1;
		
		ArrayList<Integer> arrListOfUniqueNumbers = new ArrayList<>();
		arrListOfUniqueNumbers.add(nums[0]);
		
		for(int i = 1; i < nums.length; i++) {
			int previousNum = arrListOfUniqueNumbers.get(arrListOfUniqueNumbers.size()-1);
			if (nums[i] == previousNum) {
				k++;
			}
			previousNum = nums[i];
		}
		return k;
	}
	
	
}
	
	
    