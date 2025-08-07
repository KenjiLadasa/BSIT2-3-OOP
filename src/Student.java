public class Student {

    String name;
    int age;
    String course;
    double grade1, grade2, grade3;

    public Student(String name, int age, String course, double grade1, double grade2, double grade3) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Grade 1:" + grade1 + " ," + "Grade 2:" + grade2 +" ," + "Grade 3:" + grade3);
        System.out.println("Average Grade: " + calculateAverage());
        System.out.println("Letter Grade: " + getLetterGrade());
        System.out.println("Passing Status: " + (isPassing() ? "Passed" : "Failed"));
    }

    public double calculateAverage() {
        return (grade1 + grade2 + grade3) / 3.0;
    }

    public char getLetterGrade() {
        double average = calculateAverage();
        if (average >= 90) {
            return 'A';
        } else if (average >= 80) {
            return 'B';
        } else if (average >= 70) {
            return 'C';
        } else if (average >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public boolean isPassing() {
        return calculateAverage() >= 70;
    }
}