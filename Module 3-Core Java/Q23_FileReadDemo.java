import java.nio.file.*;
import java.util.List;

public class Q23_FileReadDemo {

    public static void main(String[] args) throws Exception {

        List<String> lines =
                Files.readAllLines(Path.of("output.txt"));

        for (String line : lines) {
            System.out.println(line);
        }
    }
}
