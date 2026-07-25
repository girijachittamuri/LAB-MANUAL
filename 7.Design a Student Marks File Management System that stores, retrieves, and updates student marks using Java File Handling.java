import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        FileWriter fw = new FileWriter("marks.txt");

        fw.write("Girija - 95\n");
        fw.write("Ram - 88\n");

        fw.close();

        BufferedReader br = new BufferedReader(
                new FileReader("marks.txt"));

        String line;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}
