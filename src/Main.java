class Main{
    String name;
    double grade;

        public static void main(String[] args) {
            Student student1 = new Student("Alice Smith", 20, "BSIT", 85.0, 90.0, 88.0);
            student1.displayInfo();

            Student student2 = new Student("Bob Johnson", 19, "BSCS", 92.0, 95.0, 89.0);
            student2.displayInfo();

            Student student3 = new Student("Charlie", 21, "BSIT", 65.0, 70.0, 68.0);
            student3.displayInfo();
            System.out.println("\n---");
        }

    public Main(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Grade: " + grade);
    }

    public String getGradeStatus() {
        if (grade >= 75) { // Assuming 75 is the passing threshold
            return "PASSING";
        } else {
            return "FAILING";
        }
    }

    public boolean isPassing() {
        return grade >= 75;
    }
    }
