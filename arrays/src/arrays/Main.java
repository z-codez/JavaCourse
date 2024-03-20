package arrays;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int[] numbers = {16, 8, 23, 35, 11, 6, 19};
		
		Arrays.sort(numbers);
		
		System.out.println("The maximum value is:" + numbers[numbers.length-1]);
		System.out.println("The minimum value is:" + numbers[0]);
		
		int sum = 0;
		
		for(int num : numbers) {
			sum += num;
		}
		
		float averageArr = (float) sum / numbers.length;
		System.out.println(numbers.length);
		
		System.out.println("The sum of all integers is: " + sum);
		System.out.println("The average of all integers is: " + averageArr);

	}
}



/*Sol1 sol1 = new Sol1();
boolean ans = sol1.repeatedSubstringPattern("ababad");
System.out.println(ans);*/