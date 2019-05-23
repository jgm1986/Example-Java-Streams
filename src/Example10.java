import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Example10 {
    public static void main(String[] args) throws IOException {
        // 10. Stream rows from CSV file and count
        Stream<String> rows = Files.lines(Paths.get("resources/file/data.txt"));

        int rowCount = (int) rows.map(x -> x.split(",")).filter(x -> x.length == 3).count();

        System.out.println(rowCount + " rows.");
        rows.close();
    }
}
