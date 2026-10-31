public class WeeklyTemperatures { 
    public static void main(String[] args) { 
        //TODO 0: Declare and initialize an integer array named temperatures with the seven daily temperature values: 72, 75, 70, 68, 74, 77, and 73. 
        int[] temperatures = {72, 75, 70, 68, 74, 77, 73};
        
        int sum = 0; 
        
        // TODO 1: TODO: Write a for loop that uses temperatures.length to display each temperature in the array on a separate line, labeled with its corresponding day number (Day 1 through Day 7). 
        for (int i = 0; i < temperatures.length; i++) {
            System.out.println("Day " + (i + 1) + ": " + temperatures[i]);
            
            // TODO 2: Add the current temperature to sum. 
            sum += temperatures[i];
        } 
        
        // TODO 3: Calculate the average as a decimal value. 
        double average = (double) sum / temperatures.length;
        
        // TODO 4: Display the sum and average. 
        System.out.println("Sum of temperatures: " + sum);
        System.out.println("Average temperature: " + average);
    } 
}
