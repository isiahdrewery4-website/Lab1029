public class StudentScoreAnalyzer {

	public static void main(String[] args) {
		int[] scores = {88, 64, 91, 73, 59, 80};

		int passingCount = countPassing(scores);

		// Display the results
		System.out.println("Number of passing students: " + passingCount);
		System.out.println("Total number of students: " + scores.length);
	}

	public static int countPassing(int[] scoresArray) {
		int count = 0;

		for (int score : scoresArray) {
			if (score >= 70) {
				count++;
			}
		}

		return count;
	}
}
