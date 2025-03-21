package src;
import java.util.*;

public static void main(String[] args) {
       // Asking the user for input
       Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number of airports: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid number of airports.");
            return;
        }

        int[] fuel = new int[n];
        System.out.println("Enter fuel available at each airport (space-separated): ");
        for (int i = 0; i < n; i++) {
            fuel[i] = scanner.nextInt();
        }

        scanner.close();

        int result = minPlanesToReachDestination(fuel);
        System.out.println("Minimum planes required: " + result);
    }