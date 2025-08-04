import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student information
        System.out.println("Enter Student ID:");
        String studentId = scanner.nextLine();

        System.out.println("Enter First Name:");
        String firstName = scanner.nextLine();

        System.out.println("Enter Last Name:");
        String lastName = scanner.nextLine();

        System.out.println("Enter Course:");
        String course = scanner.nextLine();

        System.out.println("Enter Section:");
        String section = scanner.nextLine();

        // Display student information
        System.out.println("\nSTUDENT INFORMATION");
        System.out.println("Student Id: " + studentId);
        System.out.println("Student Name: " + firstName + " " + lastName);
        System.out.println("Course: " + course);
        System.out.println("Section: " + section);

        // Input scores
        System.out.println("\nEnter Midterm Exam Score:");
        int midtermScore = scanner.nextInt();

        System.out.println("Enter Final Exam Score:");
        int finalScore = scanner.nextInt();

        System.out.println("Enter Project Score:");
        int projectScore = scanner.nextInt();

        System.out.println("Enter Attendance Percentage:");
        int attendanceScore = scanner.nextInt();

        // Calculate average score
        int totalScore = midtermScore + finalScore + projectScore + attendanceScore;
        double averageScore = totalScore / 4.0;

        // Determine remarks
        String remarks;
        if (averageScore < 75) {
            remarks = "FAILED";
        } else {
            remarks = "PASSED";
        }

        // Display scores and result
        System.out.println("\nSTUDENT SCORE");
        System.out.println("Midterm Exam Score: " + midtermScore);
        System.out.println("Final Exam Score: " + finalScore);
        System.out.println("Project Score: " + projectScore);
        System.out.println("Attendance Score: " + attendanceScore);
        System.out.println("\nAverage Score: " + averageScore);
        System.out.println("Remarks: " + remarks);
    }
}
