import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type the Student TMA score: ");
        double TMA = input.nextDouble();

        System.out.print("Type the Student MTA score: ");
        double MTA = input.nextDouble();

        System.out.print("Type the Student Final Exam score: ");
        double finalExam = input.nextDouble();

        double sum = TMA + MTA + finalExam;

        if (sum < 100) {
            if (sum >= 90) {
                System.out.print("Grade = A ");
            } else if (sum < 90 && sum >= 80) {
                System.out.print("Grade = B ");
            } else if (sum < 80 && sum >= 70) {
                System.out.print("Grade = C ");
            } else if (sum < 70 && sum >= 60) {
                System.out.print("Grade = D ");
            } else {
                System.out.print("Grade = F ");
            }
        } else {
            System.out.println("The Sum Grade is more than 100");
        }



    }
}