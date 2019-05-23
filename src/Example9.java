import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example9 {
    public static void main(String[] args) throws IOException {
        // 9. Stream rows from text file, filter if contains "jit" and save to List
        System.out.println("\nStream rows from text file and save to List example: ");
        Stream<String> bands = Files.lines(Paths.get("resources/file/bands.txt"));
        List<String> bandList =bands.filter(band -> band.contains("jit"))
                .collect(Collectors.toList());
        bands.close();

        bandList.forEach(System.out::println);
    }
}
