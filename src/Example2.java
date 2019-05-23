import java.util.stream.IntStream;

public class Example2 {
    public static void main(String[] args) {
        // 2. Integer Stream with skip
        System.out.println("\nInteger stream example with Skip: ");
        IntStream.range(1, 10).skip(5).forEach(System.out::println);
    }
}
