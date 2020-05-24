// Chris Fietkiewicz. Demonstrates N + N^2.
// Raja Hammad Mehmood
// modifying this program for several loops
public class Example3 {
    public static void main(String[] args) {
        long startTime, stopTime; // For recording start/stop times
        long x = 0;
        long N = 30000L;
        
        for (long i = 0; i < 6; i++) {
        	 startTime = System.currentTimeMillis();
             for (long z = 0; z < N; z++) {
                 x = x + 1;
             }
             for (long a = 0; a < N; a++) {
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
