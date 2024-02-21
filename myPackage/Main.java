
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ionel", 20, "A");

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Grade: " + student.getGrade());

        student.setName("Elena");
        student.setAge(30);
        student.setGrade("B");

        System.out.println("\nModified Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Grade: " + student.getGrade());
    }
}
