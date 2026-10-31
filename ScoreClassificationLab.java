public class ScoreClassificationLab {
    public static void main(String[] args) {
        int[] scores = {45, 72, 90, 58, 83, 35};

        int passCount = 0;
        int failCount = 0;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 60) {
                System.out.println("Score " + scores[i] + ": Pass");
                passCount++; 
            } else {
                System.out.println("Score " + scores[i] + ": Fail");
                failCount++; 
            }
        }

        System.out.println("\nTotal passing scores: " + passCount);
        System.out.println("Total failing scores: " + failCount);
    }
}
