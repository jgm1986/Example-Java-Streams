import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Example11 {
    public static void main(String[] args) throws IOException {
        // 11. Stream rows from CSV file, parse data from rows
        Stream<String> rows = Files.lines(Paths.get("resources/file/data.txt"));

        rows.map(row -> row.split(","))
                .filter(row -> row.length == 3)
                .filter(row -> Integer.parseInt(row[1]) > 15)
                .forEach(row -> System.out.println(row[0] + "   " + row[1] + "   " + row[2]));
    }
}
