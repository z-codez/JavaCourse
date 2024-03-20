import java.util.Arrays;

public class StudentExamAnalyzer {
	 
	double calculateAverage(int[] arr) {
		
		int totalSum = 0;
		
		for(int item : arr) {
			
			totalSum += item;
		}
		
		double averageScore = totalSum / arr.length;
		
		return averageScore;
	}
	
	
	int findHighestScore(int[] arr) {
		Arrays.sort(arr);
		int highestScore = arr[arr.length - 1];
		return highestScore;
	}
	
	int countAboveAverage(int[] arr) {
		
		int numOfAboveAverageStudents = 0;
		
		double averageScore = this.calculateAverage(arr);
		
		for (int score : arr) {
			if (score >= averageScore) {
				numOfAboveAverageStudents++;
			}
		}
		
		return numOfAboveAverageStudents;
	}
	
	float calculatePercentage(int[] arr) {

		int aboveAverageStudents = this.countAboveAverage(arr);
		
		float division = (float) aboveAverageStudents / (float) arr.length;
		
		return 100 * division;
	}

}
