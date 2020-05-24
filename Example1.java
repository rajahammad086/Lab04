// Chris Fietkiewicz. Demonstrates O(N).
// Raja Hammad Mehmood
// modifying this program for several loops
public class Example1 {
    public static void main(String[] args) {
        long startTime, stopTime; // For recording start/stop times
        long x = 0;
        long n = 1000000000L;
        
        for (long i = 0; i < 6; i++) {
        	startTime = System.currentTimeMillis();
        	for (long z = 0; z < n; z++) {
                x = x + 1;
            }
        	stopTime = System.currentTimeMillis();
            System.out.println(stopTime - startTime + " msec");
        	n=n+1000000000;
        }
        
        
    }
}
