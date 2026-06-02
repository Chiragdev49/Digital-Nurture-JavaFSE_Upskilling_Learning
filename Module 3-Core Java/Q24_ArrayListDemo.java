import java.util.*;

public class Q24_ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("How many students? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter name " + i + ": ");
            names.add(sc.nextLine());
        }

        System.out.println("\nStudent Names:");
        for (String name : names) {
            System.out.println(name);
        }

        sc.close();
    }
}
