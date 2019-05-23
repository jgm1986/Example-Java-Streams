import java.util.Arrays;

public class Example6 {
    public static void main(String[] args) {
        // 6. Average of squares of an int array
        System.out.println("Average of squares of an int array:");
        int[] numbers = new int[]{2, 4, 6, 8, 10};
        Arrays.stream(numbers)
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println);
    }
}
