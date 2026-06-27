class Student {
    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Prints the full name of the student
     * Combines firstName and lastName with a space in between
     */
    public void printFullName() {
        System.out.println(this.firstName + " " + this.lastName);
    }
}

public class Task10 {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("       Student Full Name Printer        ");
        System.out.println("========================================\n");

        Student[] students = new Student[] {
            new Student("Morgan", "Freeman"),
            new Student("Brad", "Pitt"),
            new Student("Kevin", "Spacey"),
        };

        System.out.println("Students in the list:\n");
        for (Student s : students) {
            s.printFullName();
        }

        System.out.println("\n========================================");
        System.out.println("       Program Execution Complete       ");
        System.out.println("========================================");
    }
}