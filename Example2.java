// Chris Fietkiewicz. Demonstrates O(N^2).
// Raja Hammad Mehmood
// modifying this program for several loops
public class Example2 {
    public static void main(String[] args) {
        long startTime, stopTime; // For recording start/stop times
        long x = 0;
        long N = 30000L;
       
        for (long i = 0; i < 6; i++) {
        	 startTime = System.currentTimeMillis();
        	 for (long z = 0; z < N; z++) {
                 for (long j = 0; j < N; j++) {
                     x = x + 1;
                 }
             }
             stopTime = System.currentTimeMillis();
             System.out.println(stopTime - startTime + " msec");
             N=N+10000;
        }
        
       
    }
}
