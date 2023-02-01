import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// Q1
        System.out.print("Type the Student TMA score: ");
        double TMA = input.nextDouble();

        System.out.print("Type the Student MTA score: ");
        double MTA = input.nextDouble();

        System.out.print("Type the Student Final Exam score: ");
        double finalExam = input.nextDouble();

        double sum = TMA + MTA + finalExam;

        if (sum < 100) {
            if (sum >= 90) {
                System.out.printf("Grade = A %.0f/100" ,sum);
            } else if (sum >= 80) {
                System.out.printf("Grade = B %.0f/100", sum);
            } else if (sum >= 70) {
                System.out.printf("Grade = C %.0f/100", sum);
            } else if (sum >= 60) {
                System.out.printf("Grade = D %.0f/100", sum);
            } else {
                System.out.printf("Grade = F %.0f/100", sum);
            }
        } else {
            System.out.println("The Sum Grade is more than 100" + sum);
        }

    }
}