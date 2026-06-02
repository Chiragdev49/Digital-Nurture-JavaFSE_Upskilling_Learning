import java.io.*;
import java.util.Scanner;

public class Q22_FileWriteDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter text: ");
            String text = sc.nextLine();

            FileWriter writer = new FileWriter("output.txt");
            writer.write(text);
            writer.close();

            System.out.println("Data written successfully to output.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
