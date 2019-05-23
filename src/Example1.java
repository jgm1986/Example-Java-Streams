import java.util.stream.IntStream;

public class Example1 {
    public static void main(String[] args) {
        // 1. Integer Stream
        System.out.println("\nInteger stream example: ");
        IntStream.range(1, 10).forEach(System.out::println);
    }
}
