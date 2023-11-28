package labexercise01;

public class Main {

    public static void main(String[] args) {
        
        Student student = new Student("Shaina Jean Heras", 2000, "Bachelor of Science in Information Technology");

        System.out.println("Student's Information: " + student);
        System.out.println("\nStudent's Major: " + student.getMajor());

        Instructor instructor = new Instructor("Phoebe", 1990, 27098);

        System.out.println("\nInstructor's Information: " + instructor);
        System.out.println("Instructor's Salary: " + instructor.getSalary());
    }
}
    

