package src;

public class FlyMeToDestination {
    public static int minPlanesToReachDestination(int[] fuel) {
        int n = fuel.length;
        if (n == 1) return 0; 

        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < n - 1; i++) {
            farthest = Math.max(farthest, i + fuel[i]);

            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;

                if (currentEnd >= n - 1) return jumps; // Reached the last airport
            }

            if (i == farthest && fuel[i] == 0) return -1; // Stuck at an airport with no fuel
        }

        return -1; // If we can't reach the last airport
    }

   
}
