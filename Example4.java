// Chris Fietkiewicz. Demonstrates O(log N).
// Raja Hammad Mehmood
public class Example4 {
    public static void main(String[] args) {
        long startTime, stopTime; // For recording start/stop times
        long x = 0;
        long N = 999999999999999999L;
        startTime = System.currentTimeMillis();
        for (long i = 0; i < Math.log(N); i++) {
            x = x + 1;
        }
        stopTime = System.currentTimeMillis();
        System.out.println(stopTime - startTime + " msec");
    }
}