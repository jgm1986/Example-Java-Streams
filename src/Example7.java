import java.util.Arrays;

public class Example7 {
    public static void main(String[] args) {
        // 7. Stream from List, filter starts by "a" and print
        String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah"};
        System.out.println("\nStream from List, filter starts by \"a\" and print example:");
        Arrays.stream(names)
                .map(String::toLowerCase)
                .filter(name -> name.startsWith("a"))
                .forEach(System.out::println);
    }
}
