import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Example14 {
    public static void main(String[] args) {
        // 14. Reduction - sumary statistics
        IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 73, 4, 10)
                .summaryStatistics();
        System.out.println(summary);
    }
}
