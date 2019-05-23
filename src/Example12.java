import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example12 {
    public static void main(String[] args) throws IOException {
        // 12. Stream rows from CSV file, store fields in HashMap
        Stream<String> rows = Files.lines(Paths.get("resources/file/data.txt"));

        Map<String, Integer> rowsMap =rows.map(row -> row.split(","))
                .filter(row -> row.length == 3)
                .filter(row -> Integer.parseInt(row[1]) > 15)
                .collect(Collectors.toMap(
                        x -> x[0],
                        x -> Integer.parseInt(x[1])
                ));
        rows.close();

        rowsMap.entrySet().stream()
                .forEach(register -> System.out.println(register.getKey()+ " " + register.getValue()));
    }
}
