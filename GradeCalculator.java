import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = input.nextInt();

        int[] marks = new int[numSubjects];
        int userMark;

        System.out.println("Enter marks obtained in each subject (out of 100):");
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            do {
                System.out.print("Enter a mark (0-100): ");
                userMark = input.nextInt();

                if (userMark < 0 || userMark > 100) {
                    System.out.println("Please enter a valid mark between 0 and 100.");
                }

            } while (userMark < 0 || userMark > 100);

            marks[i] = userMark;
        }

        int totalMarks = 0;
        for (int i = 0; i < marks.length; i++) {
            totalMarks += marks[i];
        }

        double averagePercentage = (totalMarks * 100.0) / (numSubjects * 100);

        
        char grade;
        if (averagePercentage >= 85) {
            grade = 'A';
        } else if (averagePercentage >= 70) {
            grade = 'B';
        } else if (averagePercentage >= 55) {
            grade = 'C';
        } else if (averagePercentage >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

       
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        input.close();
    }
}
