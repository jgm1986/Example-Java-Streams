import java.util.stream.Stream;

public class Example4 {
    public static void main(String[] args) {
        // 4. Stream of, sorted and findFirst
        System.out.println("\nStream of, sorted and findFirst example: ");
        Stream.of("Ava", "Aneri", "Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
    }
}
