import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Example8 {
    public static void main(String[] args) throws IOException {
        // 8. Stream rows from text file, sort, filter, and print
        System.out.println("\nStream rows from text file, sort, filter, and print example: ");
        Stream<String> bands = Files.lines(Paths.get("resources/file/bands.txt"));
        bands.filter(band -> band.length() > 13)
                .sorted()
                .forEach(System.out::println);
        bands.close();
    }
}
