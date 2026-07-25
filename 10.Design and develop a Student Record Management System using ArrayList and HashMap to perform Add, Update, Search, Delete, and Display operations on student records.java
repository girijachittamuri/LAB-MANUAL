import java.util.ArrayList;

public class StudentRecord {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Girija");
        students.add("Ram");
        students.add("Ravi");

        System.out.println("Student List");
        System.out.println(students);

        // Remove
        students.remove("Ram");

        System.out.println("After Delete");
        System.out.println(students);
    }
}
