import java.util.Arrays;

public class Example5 {
    public static void main(String[] args) {
        // 5. Stream from Array, sort, filter and print
        String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah"};
        System.out.println("\nStream from Array, sort, filter and print: ");
        Arrays.stream(names)
                .filter(x -> x.startsWith("S"))
                .sorted()
                .forEach(System.out::println);
    }
}
