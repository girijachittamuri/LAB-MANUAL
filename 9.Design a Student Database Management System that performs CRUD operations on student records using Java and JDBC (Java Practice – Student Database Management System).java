import java.util.Scanner;

public class StudentDB {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = "Girija";
        int mark = 90;

        System.out.println("Student Name : " + name);
        System.out.println("Mark : " + mark);

        // Update
        mark = 95;
        System.out.println("Updated Mark : " + mark);
    }
}
