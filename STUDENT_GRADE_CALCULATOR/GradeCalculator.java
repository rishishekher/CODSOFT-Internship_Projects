package STUDENT_GRADE_CALCULATOR;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

         // enter the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();

        // store marks for each subject
        double[] marks = new double[numberOfSubjects];
        double totalMarks = 0;
        double value;

           // Input marks for each subject
        for (int i = 0; i < numberOfSubjects; i++) 
        {
            System.out.print("Enter marks obtained out of 100 in subject " + (i + 1) + ": ");
            value = scanner.nextDouble();
            
                // Validate the entered marks
            if(value <= 100 && value >= 0){
                marks[i] = value;
                totalMarks += marks[i];
            } else {
                System.out.println("Please enter valid marks between 0 and 100!");
                i--; // Decrement i to re-enter marks for the same subject
            }
        }
        
          // Calculate average percentage
        double averagePercentage = totalMarks / numberOfSubjects;
        
           // Determine the grade
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        // Display results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }
}
