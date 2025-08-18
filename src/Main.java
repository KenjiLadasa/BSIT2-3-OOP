public class Main {
public static void main(String[] args) {
        GradeCalculator calculator = new GradeCalculator();

        String studentName = "John Smith";
        double[] johnGrades = {85.5, 92.0, 78.5, 90.0};
        double average = calculator.calculateAverage(johnGrades);
        String letterGrade = calculator.getLetterGrade(average);

        System.out.println("--- Displaying Results for " + studentName + " ---");
        calculator.displayResult(studentName, average);
        calculator.displayResult(studentName, average, letterGrade);

    }
}