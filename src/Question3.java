import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfStudents;
        System.out.println("Enter the number of students: ");
        numberOfStudents = input.nextInt();

        double[] scores = new double[numberOfStudents];
        for(int i = 0; i < scores.length; i++)
        {
            System.out.println("Enter score: ");
            scores[i] = input.nextDouble();
        }
        System.out.printf("The average is: %.2f \n", computeAverage(scores));
        System.out.printf("The max score is: %d \n", computeMax(scores));
        percentageOfSuccess(scores);
    }
    public static double computeAverage(double[] scores) {
        double sum = 0;
        for (int i = 0; i < scores.length; i++)
        {
            sum += scores[i];
        }
        double average = sum / scores.length;
        return average;
    }
    public static int computeMax(double[] scores) {

        double max = 0;
        int maxIndex = 0;
        for (int i = 0; i < scores.length; i++)
        {
            if (scores[i] > max)
            {
                max = scores[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    public static void percentageOfSuccess(double[] scores) {
        int pass = 0;
        for(int i = 0; i < scores.length; i++)
        {
            if (scores[i] >= 50)
            {
                pass++;
            }
        }
        double percent = (double) pass / scores.length * 100;
        System.out.printf("the percentage of success is: %.2f\n", percent);
    }
}

